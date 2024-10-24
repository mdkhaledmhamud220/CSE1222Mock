package q1;

public class TestClasses {
    public static void main(String[] args) {
        Worker worker = new Worker("Khaled", 50000);
        Supervisor supervisor = new Supervisor("Mahmud", 75000, "Sales");
        Director director = new Director("PK", 100000, "Operations");

        System.out.println(worker);
        System.out.println(supervisor);
        System.out.println(director);
    }
}