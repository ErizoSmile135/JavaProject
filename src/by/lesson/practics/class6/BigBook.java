package by.lesson.practics.class6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BigBook{
    /*  5. Создайте класс Книга. Поля Название книги, Автор, Список Страниц List<Page> pages
    5.1 Создать Класс Page страница. У страницы есть номер страницы, тип бумаги.
    5.2 Реализуйте метод по удалению одной страницы из книги в классе Книга.
    5.3 В классе книга реализуйте метод по подсчёту страниц типа пергамент
    5.4 Отфильтруйте книги по Автору (Пушкин). Реализуйте метод по поиску книг по автору
    5.5 Выведите все книги, у которых количество страниц больше 100. Реализуйте этот метод в классе Книга


    Задача 5. Создай очередь задач (Queue<String>), где каждая строка — это название задачи
    (например, "Сделать домашку", "Позвонить маме"). Реализуй метод, который обрабатывает задачи одну за другой,
    пока очередь не станет пустой.
*/
    private String title;
    private String author;
    private List<Page> pages;

    public BigBook(String title, String author, List<Page> pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void removePage(Page page){
        this.pages.remove(page);
        System.out.println("Удалена страница " + page.toString());
    }

    public int countPergament(){
        int count = 0;
        for (Page page: this.pages){
            if (page.getTypePaper().equals("Пергамент")) count++;
        }

        return count;
    }

    //а она для всех
    public static List<BigBook> getAuthorBooks(List<BigBook> books, String author){
        List<BigBook> listAuthorBooks = new ArrayList<>();

        for (BigBook book: books){
            if (book.thisAuthor(author)) listAuthorBooks.add(book);
        }

        return listAuthorBooks;
    }

    public boolean thisAuthor(String author){
        return this.author.equals(author);
    }

    @Override
    public String toString(){
        String result = this.title + " (" + this.author + ")";
        return result;
    }
}

