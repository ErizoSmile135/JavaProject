package by.lesson.practics.class3;

public class Book {
    /* 1 Создать класс Book c полями id (тип int), name (тип String), author (тип String), издательство ( тип String ),
          Год издания(тип Int), Количество страниц (тип int), цена (double).Инициализацию книги в классе main выполнять
          через конструктор с параметрами. Также определите конструктор без параметров.
      2 Создать метод, который будет выводить информацию по полям которые есть в классе и назвать его info
      3 Создать метод, который будет изменять цену книги (сам метод в качестве параметра будет принимать новую цену)
      4 В классе main создать массив из пяти книг
      5 Создать метод в классе Book, который будет принимать массив книг и возвращать массив книг, у которых год
          издания ниже переданного года в методе.
      6 Создайте метод, который будет принимать массив книг идентификатор (id)книги,которую надо удалить из этого
          массива. Сам метод будет возвращать массив книг.Сигнатура метода: public Book[]removeBook(Book[]books, int id)
   */

    private int id;
    private String name;
    private String author;
    private String publHouse;
    private int year;
    private int quantity;
    private double price;

    public Book() {
    }

    public Book(int id, String name, String author, String publHouse, int year, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publHouse = publHouse;
        this.year = year;
        this.quantity = quantity;
        this.price = price;
    }

    public void info() {
        System.out.println("info:");
        System.out.println("id = " + this.id);
        System.out.println("name = " + this.name);
        System.out.println("author = " + this.author);
        System.out.println("publHouse = " + this.publHouse);
        System.out.println("year = " + this.year);
        System.out.println("quantity = " + this.quantity);
        System.out.println("price = " + this.price);
        System.out.println("*****************");
    }

    public void setNewPrice(int newPrice) {
        this.price = newPrice;
    }

    public Book[] getOldBooks(Book[] books, int year) {
        Book[] oldBooks = new Book[books.length];
        int i = 0;

        for (Book book : books) {
            if (book.year < year) {
                oldBooks[i] = book;
                i++;
            }
        }

        return oldBooks;
    }

    public Book[] removeBook(Book[] books, int id) {
        Book[] books2 = new Book[books.length - 1];
        int i = 0;

        for (Book book : books) {
            if (book.id != id) {
                books2[i] = book;
                i++;
            }
        }
        return books2;
    }
}
