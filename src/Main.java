public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        SalariedEmployee sEmp =
                new SalariedEmployee("Atul", "26-05-1982",
                        "no end date", 1001, "07-07-2020",
                        9000000, false);

        sEmp.getAge(); // added a comment
        sEmp.collectPay();
        sEmp.retire();
    }
}