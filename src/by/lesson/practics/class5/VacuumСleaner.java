package by.lesson.practics.class5;

public class VacuumСleaner  implements ElectricalAppliances{
    private String name;
    private String brand;
    private double price;
    private boolean isOn;

    public VacuumСleaner(String name, String brand, int price, boolean isOn){
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println("Пылесос убирает");
    }
}
