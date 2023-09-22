package oopExam1;

import java.util.ArrayList;

public class Shop {
    public double calculateTotal(Clothing[] total){
        return 0.0;
    }

//    public boolean isAFit(Customer customer,Clothing clothing){
//        return something
//    }

    public void printDiscountAmountOff(Discountable[] discountAmount, Clothing clothingType){
        System.out.println();
    }

    public void sortAndPrintClothingItemsByPrice(ArrayList<Clothing> clothingByPrice){
        /*
        sort algo goes in here -- attach price of item to each index of
        arraylist<clothing> and sort indexes from high to low
         */
    }

    public static void main(String[] args) {
        Clothing jeans = new Clothing("Blue Jeans", 20.0, Size.MEDIUM);
        Clothing tShirt = new Clothing("White T Shirt", 5.0,Size.SMALL);
        Clothing buttonUp = new Clothing("Button Up Shirt", 30.0, Size.LARGE);

        //create a managerCart array which contains all three clothing objects
        Clothing[] managerCart = {jeans, tShirt, buttonUp};

        //create a manager object. size = s
        Manager manager = new Manager("Mikaila", Size.SMALL);

        //create an hourlyEmployeeCart array which contains all three clothing objects
        Clothing[] hourlyEmployeeCart = {jeans, tShirt, buttonUp};

        //create an hourlyEmployee object This employee's size should be large
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Tanzir", Size.LARGE);

        //Use the Shop App to Check and print the total of your manager's cart
        double managerCartTotal = 0.0;
        for (Clothing clothing : managerCart){
         managerCartTotal += clothing.getPrice();
        }
        System.out.println("Mikaila's total is: $" + managerCartTotal);

        //Check if the jeans fit the hourly employee
        for(Clothing fitJeans : hourlyEmployeeCart){
            if(fitJeans.getSize() == hourlyEmployee.getHourlyEmployeeSize()){
                System.out.println(fitJeans.getDescription() + " fit " + hourlyEmployee.getName());
            } else {
                System.out.println(fitJeans.getDescription() + " do not fit " + hourlyEmployee.getName());
            }
        }
















    }
}
