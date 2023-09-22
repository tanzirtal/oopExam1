package oopExam1;

public abstract class Employee extends Customer implements Discountable{
    public static final double DISCOUNT = 0.1;

    public Employee(String name) {
        super(name);
    }

    public void printEmployeePriceAfterDiscount(Clothing priceAfterDiscount){

    }
}
