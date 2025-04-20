public class SalariedEmployee extends Employee{

    public double annualSalary;
    public boolean isRetired;

public void retire()
{
    //code to retire the emp
    System.out.println("is retired..."+isRetired);
}

    public SalariedEmployee() {
        super();
    }

    public SalariedEmployee(String name, String birthDate, String endDate, long employeeId, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, endDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }
}
