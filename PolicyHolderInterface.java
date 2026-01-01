public interface PolicyHolderInterface {
    public String getPolicyType();
    public void setPolicyType(String policyType);
    public int getYears();
    public void setYears(int years);
    public HealthInsuranceInterface getHealthInsurance();
    public void setHealthInsurance(HealthInsuranceInterface healthInsurance);
    public LifeInsuranceInterface getLifeInsurance();
    public void setLifeInsurance(LifeInsuranceInterface lifeInsurance);
}