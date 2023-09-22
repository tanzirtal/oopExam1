package oopExam1;

public class Student extends Customer implements Discountable{
    public long studentID;
    public static final double DISCOUNT = 0.5;

    public Student(String name) {
        super(name);
    }

    @Override
    public double calculateDiscount(Clothing discount) {
        return 0;
    }
}
