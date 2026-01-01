/*_________________________________________ALGORITHAM_________________________________________________________________
3 entity
1.PolicyHolder,2.HealthInsurance,3. LifeInsurance
create a class for 3 entity
1. policyHolder
has 4 variable
know-* policyType
      * years           (g/s)
 unknow-* policyId
        * premiumAmount
2.HealthInsurance
has 2 variable
know-* policyId         (g/s)
      * premiumAmount
 it also has 3 method * activatePolicy(int years)
[ * HEALTH: premiumAmount = years * 4000
* Print: "Policy Activated"
  * "Premium Amount: " + premiumAmount]---logic

                      * terminatePolicy()---Prints "Policy Terminated"
                      * freeHealthCheckup()---Unique Method----prints *"Free Health Checkup Added"*
3. LifeInsurance
has 2 variable
know-* policyId         (g/s)
      * premiumAmount
 it also has 3 method * activatePolicy(int years)
 [* LIFE: premiumAmount = years * 7000
* Print:* "Policy Activated"
* "Premium Amount: " + premiumAmount]---logic

                      * terminatePolicy()----Prints "Policy Terminated"
                      *familyCoverage()---Unique Method----*"Family Coverage Enabled"*
 IN MAIN[using if condition for policyType check]
 is the policyType is  HealthInsurance the HealthInsurance,java file is executed
  LifeInsurance-----LifeInsurance.java
      POLICY HOLDER 1  know value by costructor
       POLICY HOLDER 2 known value by set method
 ----------------------------Level 1-------------------------------------
 in leve 1 i the communication is like(policyHolder to main to Insurance) vice versa
 to avoid this we said to Insurance about policyHolder
 and policyHolder about Insurance so for that we created the variable inside the java file
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("======Holder1========");
        PolicyHolderInterface policyHolder1=new PolicyHolder("HealthInsurance",2);
        PolicyHolderInterface policyHolder2=new PolicyHolder();
        policyHolder2.setPolicyType("LifeInsurance");
        policyHolder2.setYears(20);
        if(policyHolder1.getPolicyType()=="HealthInsurance"){
            HealthInsuranceInterface healthInsurance=new HealthInsurance("M123",4000,policyHolder1);
            policyHolder1.setHealthInsurance(healthInsurance);//by this we set the address inside the policyHolder contained
                                                                    //variable healthInsurance
            healthInsurance.activatePolicy();
            healthInsurance.terminatePolicy();
            healthInsurance.freeHealthCheckup();
        }
        else {
            System.out.println("======Holder1========");
            LifeInsuranceInterface lifeInsurance=new LifeInsurance("D123",7000,policyHolder1);
            policyHolder1.setLifeInsurance(lifeInsurance);
            lifeInsurance.activatePolicy();
            lifeInsurance.terminatePolicy();
            lifeInsurance.familyCoverage();

        }
        if(policyHolder2.getPolicyType()=="HealthInsurance"){
            System.out.println("======Holder2========");
            HealthInsuranceInterface healthInsurance=new HealthInsurance("M123",4000,policyHolder2);
            policyHolder2.setHealthInsurance(healthInsurance);//by this we set the address inside the policyHolder contained
                                                                //variable healthInsurance
            healthInsurance.activatePolicy();
            healthInsurance.terminatePolicy();
            healthInsurance.freeHealthCheckup();
        }
        else {
            System.out.println("======Holder2========");
            LifeInsuranceInterface lifeInsurance=new LifeInsurance("A123",7000,policyHolder2);
            policyHolder2.setLifeInsurance(lifeInsurance);
            lifeInsurance.activatePolicy();
            lifeInsurance.terminatePolicy();
            lifeInsurance.familyCoverage();

        }


        // here the policyHolder call Insurance and print the ID,AMOUNT
        System.out.println("======Holder1========");
        System.out.println("PolicyId:");
        System.out.println(policyHolder1.getHealthInsurance().getPolicyId());
        System.out.println("Amount:");
        System.out.println(policyHolder1.getHealthInsurance().getPremiumAmount());
        System.out.println("======Holder2========");
        System.out.println("PolicyId:");
        System.out.println(policyHolder2.getLifeInsurance().getPolicyId());
        System.out.println("Amount:");
        System.out.println(policyHolder2.getLifeInsurance().getPremiumAmount());

    }
}