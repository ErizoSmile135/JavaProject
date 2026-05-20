package by.lesson.practics.class3;

public class Task4 {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        Book[] oldBooks;
        Book[] books2;

        books = fillArrayBooks();

        System.out.println("INFO ALL BOOKS");
        for (Book book : books) {
            book.info();
        }

        System.out.println();
        System.out.println("OLD BOOKS:");
        oldBooks = books[0].getOldBooks(books, 2000);
        for (Book book : oldBooks) {
            if (book == null) break;
            book.info();
        }

        System.out.println();
        System.out.println("REMOVE BOOKS:");
        books2 = books[0].removeBook(books, 3);
        for (Book book : books2) {
            book.info();
        }

       /* 1. Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
          2. Распечатать последний символ строки. Используем метод String.charAt().
          3. Проверить, заканчивается ли ваша строка подстрокой “java!”. Используем метод String.endsWith().
          4. Проверить, начинается ли ваша строка подстрокой “Добро пож”. Используем метод String.startsWith().
          5. Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
          6. Найти позицию подстроки “Java” в строке “I like Java!!!”.
          7. Заменить все символы “а” на “о”.
          8. Преобразуйте строку к верхнему регистру.
          9. Преобразуйте строку к нижнему регистру.
          10. Вырезать строку Java c помощью метода String.substring().
        */

        methodStr("I like Java!!!");

    }

    private static Book[] fillArrayBooks() {
        Book[] books = new Book[5];
        for (int i = 0; i < 5; i++) {
            books[i] = new Book(i
                    , "name" + i
                    , "author" + i
                    , "House" + i
                    , 1998 + i
                    , 25 * (i + 1)
                    , 16.99 + i);
        }
        return books;
    }

    public static void methodStr(String str) {
        // 2
        System.out.println("last char = " + str.charAt(str.length()-1));
        // 3
        System.out.println("ends str = 'java!'? - " + str.endsWith("java!"));
        // 4
        System.out.println("starts str = 'Добро пож'? - " + str.startsWith("Добро пож"));
        // 5
        System.out.println("include str = 'Java'? - " + str.contains("Java"));
        // 6
        System.out.println("position str 'Java' = " + str.indexOf("Java"));
        // 7
        System.out.println("a -> o = " + str.replace("a", "o"));
        // 8
        System.out.println("Lower = " + str.toLowerCase());
        // 9
        System.out.println("Upper = " + str.toUpperCase());
        // 10
        String newStr = str.substring(str.indexOf("Java"), str.indexOf("Java") + "Java".length());
        System.out.println("new str = " + newStr);
    }
}
