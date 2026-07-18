package by.lesson.practics.class9;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MainClass {

    public static void main(String[] args) {
        //0.1 - Thread
        /*for (int i = 0; i < 5; i++) {
            AvrThread thread = new AvrThread(i);
            thread.start();     //через i проследил, что это параллельно, а run() последовательно
            //thread.run();
        }

        //0.1 - Runnable
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new AvrRunnable(i));
            thread.start();
            //thread.run();
        }

        //1
        Multiplication multiplication = (a, b) -> a * b;
        Integer result = multiplication.multiplication(5, 10);
        System.out.println("result = " + result);*/


        //2
        Car car1 = new Car(1, "Brand1", 10000, 1990, 100, 10000);
        Car car2 = new Car(2, "Brand2", 20000, 1991, 110, 11000);
        Car car3 = new Car(3, "Brand3", 30000, 1992, 120, 12000);
        Car car4 = new Car(4, "Brand4", 40000, 1993, 130, 13000);
        Car car5 = new Car(5, "Brand5", 50000, 1994, 140, 14000);
        Car car6 = new Car(6, "Brand3", 60000, 1995, 150, 15000);
        Car car7 = new Car(7, "Brand7", 70000, 1996, 160, 16000);
        Car car8 = new Car(8, "Brand3", 80000, 1997, 170, 17000);
        Car car9 = new Car(9, "Brand3", 90000, 1998, 180, 18000);
        Car car10 = new Car(10, "Brand10", 100000, 1999, 190, 19000);
        List<Car> cars = List.of(car1, car2, car3, car4, car5, car6, car7, car8, car9, car10);

        //Stream<Car> carStream = cars.stream();     //хотел, но его пересоздавать все равно нужно     //это для сравнений - Comparator.comparing(Car::getMaxSpeed)
        System.out.println("1.2 - " + cars.stream()
                .max(Comparator.comparing(Car::getMaxSpeed))
                .get()
                .getId());                    //max вернет Optional, чтобы если ответ пустой то не сломався

        System.out.println("1.3 - " + cars.stream()
                .min(Comparator.comparing(Car::getMaxSpeed))
                .get()
                .getId());

        System.out.println("1.4 - " + cars.stream()
                .min(Comparator.comparing(Car::getYear))
                .get()
                .getId());

        System.out.println("1.5 - " + cars.stream()
                .max(Comparator.comparing(Car::getYear))
                .get()
                .getId());

        System.out.println("1.6 - " + cars.stream()
                .filter(car -> car.getMileage() >= 50000 && car.getMileage() <= 100000)
                .toList());

        System.out.println("1.7 - " + cars.stream()
                .max(Comparator.comparing(Car::getPrice))
                .get()
                .getId());

        System.out.println("1.8 - " + cars.stream()
                .min(Comparator.comparing(Car::getPrice))
                .get()
                .getId());

        System.out.println("1.9 ASC - " + cars.stream()
                .sorted(Comparator.comparing(Car::getMileage))
                .toList());

        System.out.println("1.9 DESC - " + cars.stream()
                .sorted(Comparator.comparing(Car::getMileage).reversed())
                .toList());

        System.out.println("1.10 ASC - " + cars.stream()
                .sorted(Comparator.comparing(Car::getPrice))
                .toList());

        System.out.println("1.10 DESC - " + cars.stream()
                .sorted(Comparator.comparing(Car::getPrice).reversed())
                .toList());

        System.out.println("1.11 - " + cars.stream()
                .filter(car -> (car.getMileage() >= 20000 && car.getMileage() <= 100000) &&
                                    (car.getPrice() >= 10000 && car.getPrice() <= 20000))
                .toList());

        System.out.println("1.12 - " + cars.stream()
                .map(Car::getBrand)
                .distinct()
                .toList());

        Stream<Car> carStream = cars.stream()
                .filter(car -> (car.getPrice() >= 10000 && car.getPrice() <= 20000) &&
                        car.getBrand().equals("Brand2") &&      //Brand3 для положительного
                        (car.getMileage() >= 50000 && car.getMileage() <= 100000) &&
                        (car.getYear() >= 1990 && car.getYear() <= 2000));

        Car car = carStream.findFirst()         //это Optional
                .orElseThrow(() -> new RuntimeException("Машина не найдена"));      //а это Car (или искл)
        System.out.println("1.13 - " + car.getId());
    }
}

/*      1. Создать 5 потоков, каждый из которых вычисляет среднее арифметическое коллекции из 5 случайных целых чисел и выводит на экран.
        Потоки решать двумя способоами через класс Thread и интерфейс Runnable

        Задание №1
        1. Создать функциональный интерфейс. В этом интерфейсе будет метод, который будет возвращать результат умножения двух чисел.
        Наименование метода: Integer multiplication(int a, int b);
        2. В классе main используя ваш функциональный интерфейс, создате лямбда выражение и посчитайте произведение 5 на 10.
        3. Результат выведите в консоль.
        Задание №2
        1. Создать класс авто. Поля: id, марка, пробег, год выпуска, максимальная скорость, цена.
        1.1 Создать коллекцию из авто.
        1.2 Найти самую быструю машину.
        1.3 Найти самую медленную машину.
        1.4 Найти самую старую
        1.5 Найти самую новую
        1.6 Найти машины, у которых пробег от 50000 до 100000.
        1.7 Найти самую дорогую машину.
        1.8 Найти самую дешёвую машину.
        1.9 Отсортировать машины по пробегу (по возрастанию и по убыванию
        1.10 Отсортировать машины по стоимости (по возрастанию и по убыванию)
        1.11 Найти машины в диапазоне пробега от 20000 до 100000 и в диапазоне цен от 10000 до 20000.
        1.12 Получить не повторяющиеся значения марок авто (distinct).
        1.13 Найти машину в задданом дипазоне цен, определённой марки, с заданным дипазоном пробега, в заданном диапазон год выпуска.
            Если таких нет, выбросить своё исключение.

     */