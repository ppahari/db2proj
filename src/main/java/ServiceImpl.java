import java.util.List;

public class ServiceImpl implements Service {




    private BankDO bankDO;

    public void setBankDO(BankDO bankDO) {
        this.bankDO = bankDO;
    }



    @Override
    public void process() {

        List<BankVO> bankVOList= bankDO.getBankDetails();

        for(BankVO bankVO:bankVOList){
          System.out.println("ACC_NO : " + bankVO.getACC_NO());
          System.out.println("BRANCH_NAME : " + bankVO.getBRANCH_NAME());
          System.out.println("BALANCE : " + bankVO.getBALANCE());
          System.out.println("CUSTOMER_ADDRESS : " + bankVO.getCUSTOMER_ADDRESS());
          System.out.println("CUSTOMER_CITY : " + bankVO.getCUSTOMER_CITY());
          System.out.println("CUSTOMER_NAME : " + bankVO.getCUSTOMER_NAME());
      }

      bankDO.insertsql("Paras","1351 Meadow Creek Dr","Irving");

    }

}
