package oopExam1;

public class Clothing {

    public String description;
    public double price;
    public Size size;

    public Clothing(String typeOfClothing, double price, Size size) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String toString(){
        return null;
    }
}
