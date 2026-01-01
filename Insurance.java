public abstract class Insurance implements InsuranceInterface{
    private String policyId;
    private int premiumAmount;
    private PolicyHolderInterface policyHolder;


    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public int getPremiumAmount() {
        return premiumAmount;
    }
    public PolicyHolderInterface getPolicyHolder() {
        return policyHolder;
    }

    public void setPolicyHolder(PolicyHolderInterface policyHolder) {
        this.policyHolder = policyHolder;
    }

    public void setPremiumAmount(int premiumAmount) {
        this.premiumAmount = premiumAmount;
    }
    public void activatePolicy(){
        this.premiumAmount =this.policyHolder.getYears() *this.premiumAmount;//here the insurance call policyholder and years
        System.out.println("Policy Activated");
    }
    public void terminatePolicy(){
        System.out.println("Policy Terminated");
    }
}