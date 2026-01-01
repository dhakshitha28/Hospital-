public class HealthInsurance extends Insurance implements HealthInsuranceInterface {
   public HealthInsurance(String policyId,int premiumAmount,PolicyHolderInterface policyHolder){
       this.setPolicyId(policyId);
       this.setPremiumAmount(premiumAmount);// by use the know construct type i initialized the value by parameter
       this.setPolicyHolder(policyHolder);
   }


    public void freeHealthCheckup(){
        System.out.println("Free Health Checkup Added");
    }

}