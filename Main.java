class Main {
  public static void main(String[] args) {
    Employee ebene = new Employee("Ebenezer", "Oyenuga", 2000000);
    Employee lan = new Employee("Olanrewaju", "Landoke", 1500000);
    int ebeneYearlySalary = ebene.getMonthlySalary() *12;
    System.out.printf("The yearly salary for the employee %s, %s is %d", ebene.getLastName(), ebene.getFirstName(), ebeneYearlySalary);
     System.out.println();
int lanYearlySalary = lan.getMonthlySalary() *12;

    System.out.printf("The yearly salary for the employee %s, %s is %d", lan.getLastName(), lan.getFirstName(), lanYearlySalary);
    System.out.println();
    float ebeneYearlyRaise = ebeneYearlySalary + (0.1f * ebeneYearlySalary);
    float lanYearlyRaise = lanYearlySalary + (0.1f * lanYearlySalary);

    System.out.printf("The new yearly salary for the employee %s, %s after the 10 percent raise is %.2f", ebene.getLastName(), ebene.getFirstName(), ebeneYearlyRaise);
    System.out.println();
    System.out.printf("The new yearly salary for the employee %s, %s after the 10 percent raise is %.2f", lan.getLastName(), lan.getFirstName(), lanYearlyRaise);

  }
}

class Employee{
  private String firstName;
  private String lastName;
  private int monthlySalary;

  public Employee(String fName, String lName, int mSalary){
    firstName = fName;
    lastName = lName;
    monthlySalary = mSalary;
  }
  public void setFirstName(String firstNam){
    firstName = firstNam;
  }
  public String getFirstName(){
    return firstName;
  }
  public void setLastName(String lastNam){
    lastName = lastNam;
  }
public String getLastName(){
    return lastName;
  }
  public void setMonthlySalary(int monthSalary){
    if (monthSalary < 0)
         monthlySalary = 0;
    else
      monthlySalary = monthSalary;
  }
  public int getMonthlySalary(){
    return monthlySalary;
  }
}