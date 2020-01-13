package Lesson5.kg.object;

 public class Car {
    int year;
    double volume;
    String color;
    String signal;
    Chair chair;
    public Car(int year, double v, String color) {
        this.year = year;
        volume = v;
        this.color = color;
    }
    public void makeSignal(){
        System.out.println(signal);
    }
    public Car(){
        makeSignal();
    }
}
