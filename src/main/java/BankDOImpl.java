import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class BankDOImpl implements BankDO {


    private DataSource ds;
    private JdbcTemplate jdbcTemplate;


    private final static String SELECT_BANK_DETAIL = "SELECT A.ACC_NO,A.BRANCH_NAME,A.BALANCE,D.CUSTOMER_NAME"+
        ",C.CUSTOMER_ADDRESS,C.CUSTOMER_CITY FROM ACCOUNT AS A JOIN DEPOSITOR AS D ON (D.ACC_NO=A.ACC_NO) JOIN CUSTOMER"
            + " AS C ON (C.CUSTOMER_NAME=D.CUSTOMER_NAME)  WHERE C.CUSTOMER_NAME=:CNAME ";


    private final static String INSERTION= "INSERT INTO CUSTOMER(CUSTOMER_NAME,CUSTOMER_ADDRESS,CUSTOMER_CITY) " +
            "VALUES(:name, :address , :city) ";


    @Override
    public void insertsql(String name, String address, String city) {
        MapSqlParameterSource msps = new MapSqlParameterSource();
        NamedParameterJdbcTemplate namedParameterJdbcTemplate=  new NamedParameterJdbcTemplate(ds);
        msps.addValue("name",name);
        msps.addValue("address",address);
        msps.addValue("city",city);
        namedParameterJdbcTemplate.update(INSERTION,msps);
    }

    @Override
    public void setDataSource(DataSource ds) {
        this.ds = ds;
        this.jdbcTemplate=new JdbcTemplate(ds);

    }


    @Override
    public List<BankVO> getBankDetails() {
        MapSqlParameterSource msps=new MapSqlParameterSource();
        msps.addValue("CNAME","JAKE");
        NamedParameterJdbcTemplate namedParameterJdbcTemplate=new NamedParameterJdbcTemplate(ds);
        return namedParameterJdbcTemplate.query(SELECT_BANK_DETAIL,msps,new BankMapper());
        //        List<BankVO> bankVOList = jdbcTemplate.query(SELECT_BANK_DETAIL,new BankDOImpl.BankMapper());
//        return bankVOList;
//    return  null;
    }



    private static class BankMapper implements RowMapper<BankVO>{

        @Override
        public BankVO mapRow(ResultSet rs, int rowNum) throws SQLException {
            BankVO bankVO = new BankVO();
            bankVO.setACC_NO(rs.getString("ACC_NO"));
            bankVO.setBALANCE(rs.getBigDecimal("BALANCE"));
            bankVO.setBRANCH_NAME(rs.getString("BRANCH_NAME"));
            bankVO.setCUSTOMER_ADDRESS(rs.getString("CUSTOMER_ADDRESS"));
            bankVO.setCUSTOMER_CITY(rs.getString("CUSTOMER_CITY"));
            bankVO.setCUSTOMER_NAME(rs.getString("CUSTOMER_NAME"));
            return bankVO;
        }
    }

}
