package by.lesson.practics.class4;

public class Factory extends IndustrialBuilding {
    private int countOfWorker;
    private String product;

    public Factory(String street, String wallMaterial, int year, String industry, int countOfWorker, String product) {
        super(street, wallMaterial, year, industry);
        this.countOfWorker = countOfWorker;
        this.product = product;
    }
}
