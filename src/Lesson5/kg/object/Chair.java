package Lesson5.kg.object;

public class Chair {
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0){
            System.out.println("Wrong value.");
        } else this.price = price;
    }

    String material;
    double price;



}
