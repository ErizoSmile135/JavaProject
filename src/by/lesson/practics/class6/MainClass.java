package by.lesson.practics.class6;

import java.util.*;

public class MainClass {
    /* Задачи по практике
        1. Условие
        1.1.Создать коллекцию List (реализация ArrayList). Типизация коллекции – String.
        1.2 Добавить пару записей (Привет, Как дела, Праздник, Суфле)
        1.3 Вывести все записи.
        1.4 Проверить, содержит ли коллекция слово Конфета
        1.5 Посчитать количество элементов в коллекции
        2. Условие: Создайте ArrayList<String> для хранения списка покупок. Добавь в него 5 товаров.
            Затем выведите весь список на экран, а после — удалите один товар по названию и снова выведите обновлённый список.
        3. Условие: Создай класс Book с полями:
        • String title
        • String author
        3.1. Создайте 3 книги. И добавьте эти книги в коллекцию. Используйте метод List.of();
        3.2 Переоперделите метод equals на книгах так,чтобы он всегда возвращал false
        3.3. Удалите 1 книгу из коллекции. Выведите все книги и проанализируйте результат.
        4. Условие: Создай класс Book с полями:
        • String title
        • String author
        Создайте множество Set<Book> и добавьте в него несколько книг, включая дубликаты (одинаковое название и автор).
        Переопределите методы equals() и hashCode() так, чтобы книги с одинаковыми значениями title и author считались
        одинаковыми. Выведи содержимое множества и убедись, что дубликаты не добавляются.
    */

    public static void main(String[] args) {
        List<String> collectionStr = new ArrayList<>();

        collectionStr.add("Привет");
        collectionStr.add("Как дела");
        collectionStr.add("Праздник");
        collectionStr.add("Суфле");
        collectionStr.add("Конфета");

        collectionStr.forEach(str -> System.out.println(str));
        //collectionStr.forEach(System.out::println);       мы такое не учили

        System.out.println("******************");
        if (collectionStr.contains("Конфета")) System.out.println("Есть конфета");
        else System.out.println("Нет конфеты");

        System.out.println("******************");
        System.out.println(collectionStr.size());

        System.out.println("******************");
        List<String> list = new ArrayList<>();

        list.add("товар1");
        list.add("товар2");
        list.add("товар3");
        list.add("товар4");
        list.add("товар5");

        System.out.println(list);       //так понравилось, наглядный получается

        list.remove("товар3");
        System.out.println(list);
        System.out.println();

        //Book
        System.out.println("////////Book////////");
        Collection<Book> listBook = new ArrayList<>();   //List.of(new Book("title1", "author1"),
        Book book1 = new Book("title1", "author1");
        Book book2 = new Book("title2", "author2");
        Book book3 = new Book("title3", "author3");

        listBook.add(book1);
        listBook.add(book2);
        listBook.add(book3);

        listBook.forEach(book -> System.out.println(book.toString()));
        System.out.println("******************");
        listBook.remove(book1);
        listBook.forEach(book -> System.out.println(book.toString()));

        System.out.println("/////////Set<Book>//////////");
        Set<Book> setlistBook = new HashSet<>();

        Book book4 = new Book("title2", "author2");
        Book book5 = new Book("title5", "author5");

        setlistBook.add(book1);
        setlistBook.add(book2);
        setlistBook.add(book3);
        setlistBook.add(book4);
        setlistBook.add(book5);

        //setlistBook.forEach(book -> System.out.println(book.toString()));
        //делаю разок просто for, чтобы не ругал что везде forEach
        for (Book book: setlistBook){
            System.out.println(book.hashCode());
            System.out.println(book);
        }

        //BigBook
        System.out.println("////////BigBook////////");
        List<BigBook> listBigBook = new ArrayList<>();
        List<Page> pagesPerg = new ArrayList<>();
        List<Page> pagesKora = new ArrayList<>();
        List<Page> pagesFolga = new ArrayList<>();
        List<Page> pagesAllType = new ArrayList<>();

        pagesPerg.add(new Page(1, "Пергамент"));
        pagesPerg.add(new Page(2, "Пергамент"));
        pagesPerg.add(new Page(3, "Пергамент"));

        pagesKora.add(new Page(1, "Кора"));
        pagesKora.add(new Page(2, "Кора"));
        pagesKora.add(new Page(3, "Кора"));

        pagesFolga.add(new Page(1, "Фольга"));
        pagesFolga.add(new Page(2, "Фольга"));
        pagesFolga.add(new Page(3, "Фольга"));

        pagesAllType.add(new Page(1, "Фольга"));
        pagesAllType.add(new Page(2, "Кора"));
        pagesAllType.add(new Page(3, "Пергамент"));

        listBigBook.add(new BigBook("Книга Лермонтова", "Лермонтов", pagesPerg));
        listBigBook.add(new BigBook("Книга Пушкина", "Пушкин", pagesKora));
        listBigBook.add(new BigBook("Книга Достоевского", "Достоевский", pagesPerg));
        listBigBook.add(new BigBook("Книга Гоголя", "Гоголь", pagesFolga));
        listBigBook.add(new BigBook("Вторая книга Пушкина", "Пушкин", pagesAllType));

        System.out.println(listBigBook.get(1).countPergament());
        System.out.println(listBigBook.get(2).countPergament());
        System.out.println(listBigBook.get(4).countPergament());

        pagesAllType.add(new Page(4, "Пергамент"));
        System.out.println(listBigBook.get(4).countPergament());

        System.out.println(BigBook.getAuthorBooks(listBigBook, "Пушкин"));

        //Стопнул на п 5.4...
    }
}
