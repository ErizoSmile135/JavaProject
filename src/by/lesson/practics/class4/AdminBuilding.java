package by.lesson.practics.class4;

public class AdminBuilding extends CivilBuilding {
    private String adminFunction;
    private int countOfPeople;

    public AdminBuilding(String street, String wallMaterial, int year, String function, int numberOfFloors, String adminFunction, int countOfPeople) {
        super(street, wallMaterial, year, function, numberOfFloors);
        this.adminFunction = adminFunction;
        this.countOfPeople = countOfPeople;
    }

    public void setCountOfPeople(int count) {
        this.countOfPeople = count;
    }
    public int getCountOfPeople() {
        return countOfPeople;
    }
}
