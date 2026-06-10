package by.lesson.practics.class5;

public interface KitchenAppliances extends ElectricalAppliances{

    default void workKichen(){
        System.out.println("Делает кухонные штуки");
    }
}
