package oopExam1;

public class HourlyEmployee extends Employee{
    public HourlyEmployee(String name, Size size) {
        super(name);
        this.hourlyEmployeeSize = size;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    private Size hourlyEmployeeSize;

    public Size getHourlyEmployeeSize() {
        return this.hourlyEmployeeSize;
    }

    public void setHourlyEmployeeSize(Size hourlyEmployeeSize) {
        this.hourlyEmployeeSize = hourlyEmployeeSize;
    }


    @Override
    public double calculateDiscount(Clothing discount) {
        return 0;
    }
}
