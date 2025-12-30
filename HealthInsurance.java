public class HealthInsurance {
   private String policyId;
   private int premiumAmount;
   private PolicyHolder policyHolder;
   public HealthInsurance(String policyId,int premiumAmount,PolicyHolder policyHolder){
       this.policyId=policyId;
       this.premiumAmount=premiumAmount;// by use the know construct type i initialized the value by parameter
       this.policyHolder=policyHolder;
   }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public int getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(int premiumAmount) {
        this.premiumAmount = premiumAmount;
    }
    public void activatePolicy(){
        this.premiumAmount = policyHolder.getYears() *this.premiumAmount;//here the insurance call policyholder and years
        System.out.println("Policy Activated");
    }
    public void terminatePolicy(){
        System.out.println("Policy Terminated");
    }
    public void freeHealthCheckup(){
        System.out.println("Free Health Checkup Added");
    }

    public PolicyHolder getPolicyHolder() {
        return policyHolder;
    }

    public void setPolicyHolder(PolicyHolder policyHolder) {
        this.policyHolder = policyHolder;
    }
}