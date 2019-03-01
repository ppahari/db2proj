import java.math.BigDecimal;

public class BankVO {

    private String ACC_NO;
    private String BRANCH_NAME;
    private BigDecimal BALANCE;
    private String CUSTOMER_NAME;
    private String CUSTOMER_ADDRESS;
    private String CUSTOMER_CITY;

//    public BankVO(String ACC_NO, String BRANCH_NAME, Float BALANCE, String CUSTOMER_NAME, String CUSTOMER_ADDRESS, String CUSTOMER_CITY) {
//        this.ACC_NO = ACC_NO;
//        this.BRANCH_NAME = BRANCH_NAME;
//        this.BALANCE= BALANCE;
//        this.CUSTOMER_NAME = CUSTOMER_NAME;
//        this.CUSTOMER_ADDRESS = CUSTOMER_ADDRESS;
//        this.CUSTOMER_CITY = CUSTOMER_CITY;
//    }


    public String getACC_NO() {
        return ACC_NO;
    }

    public void setACC_NO(String ACC_NO) {
        this.ACC_NO = ACC_NO;
    }

    public String getBRANCH_NAME() {
        return BRANCH_NAME;
    }

    public void setBRANCH_NAME(String BRANCH_NAME) {
        this.BRANCH_NAME = BRANCH_NAME;
    }

    public BigDecimal getBALANCE() {
        return BALANCE;
    }

    public void setBALANCE(BigDecimal BALANCE) {
        this.BALANCE = BALANCE;
    }

    public String getCUSTOMER_NAME() {
        return CUSTOMER_NAME;
    }

    public void setCUSTOMER_NAME(String CUSTOMER_NAME) {
        this.CUSTOMER_NAME = CUSTOMER_NAME;
    }

    public String getCUSTOMER_ADDRESS() {
        return CUSTOMER_ADDRESS;
    }

    public void setCUSTOMER_ADDRESS(String CUSTOMER_ADDRESS) {
        this.CUSTOMER_ADDRESS = CUSTOMER_ADDRESS;
    }

    public String getCUSTOMER_CITY() {
        return CUSTOMER_CITY;
    }

    public void setCUSTOMER_CITY(String CUSTOMER_CITY) {
        this.CUSTOMER_CITY = CUSTOMER_CITY;
    }
}
