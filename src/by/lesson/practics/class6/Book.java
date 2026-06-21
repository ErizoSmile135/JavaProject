package by.lesson.practics.class6;

import java.util.Objects;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString(){
        String result = "Book: " + this.title + " (" + this.author + ")";
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        //return false;     //п3.2
        return (this.hashCode() == obj.hashCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.toString());
    }
}
