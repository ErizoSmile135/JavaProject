package by.lesson.practics.class5;

public interface ElectricalAppliances {
    void work();

    default void start(){
        System.out.println("Электроприбор стартует");
    }
}
