import javax.sql.DataSource;
import java.util.List;

public interface BankDO {
    void setDataSource(DataSource ds);
    List<BankVO> getBankDetails();
    void insertsql(String name,String address,String city);
}
