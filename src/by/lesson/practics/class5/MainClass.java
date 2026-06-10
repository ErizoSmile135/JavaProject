package by.lesson.practics.class5;

public class MainClass {
    /*  Электроприборы
        1. Создать Интерфейс Электроприборы. В интерфейсе Электроприборы реализовать абстрактный метод:  work();
        2. Создать дефолтный метод в интерфейсе Электроприборы., start() который выводит текст «Электроприбор стартует».
        3. Создать класс Кофемашина. Поля наименование. Список функционала. Стоимость, Boolean isOn (включен)
            Класс кофемашина имплементирует интерфейс Электроприборы. Переопределите метод ворк так, чтобы методы выводил «Кофемашина варит кофе».
        4. Создать класс Холодильник. Поля: наименование, марка, стоимость, Boolean isOn (включен).
            Класс холодильник имплементирует интерфейс Электроприборы. Переопределите метод work так, чтобы методы
            выводил «Холодильник морозит».
        5. Создать класс Стиральная машина. Поля наименование, бренд, стоимость, Boolean isOn. Класс стиральная
            машина имплементирует интерфейс Электроприборы. Переопределите метод ворк так, чтобы метод выводил «Стиральная машина стирает».
        6. Создать класс Пылесос. Поля наименование, бренд, стоимость, Boolean isOn. Класс Пылесос имплементирует
            интерфейс Электроприборы. Переопределите метод ворк так, чтобы метод выводил «Пылесос убирает».

        7. В классе main cоздайте по паре объектов на основании вышесозданных классов. Создайте в классе main
            создайте выставку из электроприбров и продемонстрируйте способности каждого электроприбора
        8. Создайте интерфейс Кухонная техника. От этого интерфейса выполните имплементацию у классов Холодильник и Стиральная машина
        9.  В классе main сделать выставку только из Кухонной техники. Продемонстрировать спосбоности всех электроприборов в этой выставке.
        10. В классе main сделать выставку кофемашин. Продемонстрировать способности всех кофе машин.
        11. На любой кофемашине вызовете метод start(). После этого переопределите метод start так, чтобы этот
            метод включал прибор (менял значение Boolean isOn на true.) Выведите результат в консоль

        1. Создать класс Персонаж. Поля Имя, фамилия.
        2. Создать класс Студент. Поля факультет
        3. Создать класс Сотрудник. Поля, зарплата
        4. Создать класс Отдел. Имя id отдела. Отдела.
        5. Создать класс стол. Этот класс будет состоять из двух дженериков. Первый дженерик будет отображать инвертарный номер стола(Integer), второй дженерик будет отображать персонажа, который за ним будет сидеть
        6. Реализовать метод в классе стол, который будет выводить имя персонажа, который сидит за столом.
        7. В классе main Создать три стола, за которыми будут сидеть студент и сотрудник.
        8. Вывести поочередно имена персонажей, которые сидят за столом.

     */

    public static void main(String[] args) {
        ListOfFunctions[] functions = new ListOfFunctions[2];
        functions[0] = ListOfFunctions.COOK;
        functions[1] = ListOfFunctions.BUZZ;
        CoffeeMachine coffeeMachine = new CoffeeMachine("CofeMach", functions, 100, true);
        CoffeeMachine coffeeMachineBroke = new CoffeeMachine("CofeMachBroke", new ListOfFunctions[]{ListOfFunctions.BUZZ}, 35, true);
        Fridge fridge1 = new Fridge("Fridge1", "mark1", 66, true);
        Fridge fridge2 = new Fridge("Fridge2", "mark2", 77, true);
        VacuumСleaner vacuumСleaner1 = new VacuumСleaner("VacuumСleaner1", "brand1", 44, true);
        VacuumСleaner vacuumСleaner2 = new VacuumСleaner("VacuumСleaner2", "brand2", 22, true);
        WashingMachine washingMachine1 = new WashingMachine("WashingMachine1", "brand1", 88, true);
        WashingMachine washingMachine2 = new WashingMachine("WashingMachine2", "brand2", 99, true);

        ElectricalAppliances[] appl = new ElectricalAppliances[8];

        appl[0] = coffeeMachine;
        appl[1] = coffeeMachineBroke;
        appl[2] = fridge1;
        appl[3] = fridge2;
        appl[4] = vacuumСleaner1;
        appl[5] = vacuumСleaner2;
        appl[6] = washingMachine1;
        appl[7] = washingMachine2;

        System.out.println("*************");
        System.out.println("Выставка:");
        for(ElectricalAppliances el: appl){
            el.work();
        }
        System.out.println("*************");

        System.out.println("\n*************");
        System.out.println("Выставка Кухонных:");
        KitchenAppliances[] kichArr = new KitchenAppliances[]{fridge1, fridge2, washingMachine1, washingMachine2};
        /*for(ElectricalAppliances el: appl){
            if (el instanceof KitchenAppliances) el.work();
        }*/
        //честно говоря 9 и 10 понимаю что суть в том, чтобы посмотреть на имплементацию разных интерфейсов
        //но как показать не совсем понял. Сделал вот так. Пункт 10 сделал просто по определению есть/нет класс,
        // если переписывать будет так же как в п.9
        for(KitchenAppliances el: kichArr){
            System.out.println("///////////////");
            System.out.println(el.getClass());
            el.workKichen();
            el.work();
        }
        System.out.println("*************");

        System.out.println("\n*************");
        System.out.println("Выставка Кофемашин:");
        for(ElectricalAppliances el: appl){
            if (el instanceof CoffeeMachine) el.work();
        }
        System.out.println("*************");

        /* 11. На любой кофемашине вызовете метод start(). После этого переопределите метод start так, чтобы этот
            метод включал прибор (менял значение Boolean isOn на true.) Выведите результат в консоль */
        //немного не понял посследовательность действий по описанию...
        coffeeMachine.start();


    }
}
