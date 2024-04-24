package employees;
// Exercise 9.3: BasePlusCommissionEmployee.java
// BasePlusCommissionEmployee using composition.

public class BasePlusCommissionEmployee extends CommissionEmployee{
   private CommissionEmployee CommissionEmployee; // composition
   private double baseSalary; // base salary per week

   // six-argument constructor
   public BasePlusCommissionEmployee(String firstName, String lastName, 
      String socialSecurityID, double grossSales, double commissionRate, double baseSalary) {

         //Use the super class CommissionEmployee to create the Object
         super(firstName, lastName, socialSecurityID, grossSales, commissionRate);

         if (baseSalary < 0.0) {
            throw new IllegalArgumentException(
               "Base salary must be >= 0.0");
         }

         CommissionEmployee = 
            new CommissionEmployee(firstName, lastName, socialSecurityID, grossSales, commissionRate);

         this.baseSalary = baseSalary;
      }


   // set base salary
   public void setBaseSalary(double baseSalary) {
      if (baseSalary < 0.0) {
         throw new IllegalArgumentException(
            "Base salary must be >= 0.0");
      }

      this.baseSalary = baseSalary;
   }

   // return base-salaried commission employee's base salary
   public double getBaseSalary() {
      return baseSalary;
   }

   // calculate base-salaried commission employee's earnings
   public double earnings() {
      return getBaseSalary() + CommissionEmployee.earnings();
   } 

   // return String representation of BasePlusCommissionEmployee
   @Override
   public String toString() {
      return String.format("%s %s\n%s: %.2f", "base-salaried", 
         CommissionEmployee.toString(), "base salary", getBaseSalary());
   } 
}
