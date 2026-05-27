package by.lesson.practics.class4;

public class ApartmentBuilding extends CivilBuilding {
    private int countOfApartments;

    public ApartmentBuilding(String street, String wallMaterial, int year, String function, int numberOfFloors, int countOfApartments) {
        super(street, wallMaterial, year, function, numberOfFloors);
        this.countOfApartments = countOfApartments;
    }
}
