public class Worker {

    public String name;
    public String birthDate;
    public String endDate;

    public int getAge()
    {

        return 43; // should have calculated the age here.
    }

    public double collectPay()
    {

        System.out.println("salary credited");
        return 0;

    }

    public void terminate()
{

}

    public Worker() {

    }

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }
}
