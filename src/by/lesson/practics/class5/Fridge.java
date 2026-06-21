package by.lesson.practics.class5;

public class Fridge implements KitchenAppliances {
    private String name;
    private String mark;
    private double price;
    private boolean isOn;

    public Fridge(String name, String mark, int price, boolean isOn){
        this.name = name;
        this.mark = mark;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println("Холодильник морозит");
    }
}
