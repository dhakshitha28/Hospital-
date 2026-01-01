public class LifeInsurance extends Insurance implements LifeInsuranceInterface{
    public LifeInsurance(String policyId,int premiumAmount,PolicyHolderInterface policyHolder){
        this.setPolicyId(policyId);
        this.setPremiumAmount(premiumAmount);// by use the know construct type i initialized the value by parameter
        this.setPolicyHolder(policyHolder);
    }

    public void familyCoverage(){
        System.out.println("Family Coverage Enabled");
    }

}