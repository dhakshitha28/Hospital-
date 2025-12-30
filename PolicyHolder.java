public class PolicyHolder {
    private String policyType;
    private int years ;
//    private String policyId;              //this two variable get the value directly to the INSURANCE
//    private int premiumAmount;               when we sad what are the INSURANCE are available to the policyHolder


    private HealthInsurance healthInsurance;//by this  policyHolder1 and policyHolder2 can directly communicate
    private LifeInsurance lifeInsurance;    //and get the value of policyId and premiumAmount,we can achieve this
                                                //by passing the address of the Insurance,the policyholder get value using
                                                //address of the insurance like what we have done in main

    public PolicyHolder(String policyType,int years){//user defined constructor
        this.policyType=policyType;
        this.years=years;
    }
    public PolicyHolder(){//user defined  constructor but with default value ,get know value by setter method

    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public HealthInsurance getHealthInsurance() {
        return healthInsurance;
    }

    public void setHealthInsurance(HealthInsurance healthInsurance) {
        this.healthInsurance = healthInsurance;
    }

    public LifeInsurance getLifeInsurance() {
        return lifeInsurance;
    }

    public void setLifeInsurance(LifeInsurance lifeInsurance) {
        this.lifeInsurance = lifeInsurance;
    }

//    public String getPolicyId() {
//        return policyId;
//    }
//
//    public void setPolicyId(String policyId) {           // this (g/s) are not used when the policy Holder know the
//        this.policyId = policyId;                             what are the Insurance
//    }
//
//    public int getPremiumAmount() {
//        return premiumAmount;
//    }
//
//    public void setPremiumAmount(int premiumAmount) {
//        this.premiumAmount = premiumAmount;
//    }
}