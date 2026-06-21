package by.lesson.practics.class5;

public class WashingMachine implements KitchenAppliances{
    private String name;
    private String brand;
    private double price;
    private boolean isOn;

    public WashingMachine(String name, String brand, int price, boolean isOn){
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println("Стиральная машина стирает");
    }
}
