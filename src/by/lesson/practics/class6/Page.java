package by.lesson.practics.class6;

public class Page {
    private int number;
    private String typePaper;

    public Page(int number, String typePaper) {
        this.number = number;
        this.typePaper = typePaper;
    }

    public String getTypePaper(){
        return this.typePaper;
    }
}
