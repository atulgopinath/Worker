public class Employee extends Worker {

    public long employeeId;
    public String hireDate;


    public Employee() {
        this(1001,"26-May-1982");

    }

    public Employee(long employeeId, String hireDate)
    {
        super("Atul","26-May-1982","NO End Date");
        this.employeeId=employeeId;
        this.hireDate=hireDate;
    }

    public Employee(String name, String birthDate, String endDate, long employeeId, String hireDate) {
        super(name, birthDate, endDate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }
}
