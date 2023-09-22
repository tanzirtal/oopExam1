package oopExam1;

public class Manager extends Employee{
    public Manager(String name, Size size) {
        super(name);
    }

    @Override
    public double calculateDiscount(Clothing discount) {
        return 0;
    }
}
