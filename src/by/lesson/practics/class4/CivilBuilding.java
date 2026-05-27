package by.lesson.practics.class4;

public class CivilBuilding extends Building {
    private String function;
    private int numberOfFloors;

    CivilBuilding(String street, String wallMaterial, int year, String function, int numberOfFloors){
        super(street, wallMaterial, year);
        this.function = function;
        this.numberOfFloors = numberOfFloors;
    }
}
