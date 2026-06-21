package by.lesson.practics.class5;

public class CoffeeMachine implements ElectricalAppliances {
    private String name;
    private ListOfFunctions[] functions;
    private double price;
    private boolean isOn;

    public CoffeeMachine(String name, ListOfFunctions[] functions, int price, boolean isOn){
        this.name = name;
        this.functions = functions;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println("Кофемашина варит кофе");
    }

    @Override
    public void start() {
        this.isOn = true;
        System.out.println("Кофемашина ВКЛ");
    }

    public void off(){
        this.isOn = false;
    }
}
