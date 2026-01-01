public interface InsuranceInterface {
    public String getPolicyId();
    public void setPolicyId(String policyId);
    public int getPremiumAmount();
    public PolicyHolderInterface getPolicyHolder();
    public void setPolicyHolder(PolicyHolderInterface policyHolder);
    public void setPremiumAmount(int premiumAmount);
    public void activatePolicy();
    public void terminatePolicy();
}