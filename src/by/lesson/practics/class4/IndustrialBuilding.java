package by.lesson.practics.class4;

public class IndustrialBuilding extends Building {
    private String industry;

    IndustrialBuilding(String street, String wallMaterial, int year, String industry) {
        super(street, wallMaterial, year);
        this.industry = industry;
    }
}
