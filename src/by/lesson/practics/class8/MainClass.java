package by.lesson.practics.class8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainClass {
    /*  Дан русский текст: Сериализация объектов - это процесс сохранения состояния объектов в виде последовательности байтов, а также процесс восстановления в дальнейшем из этих байтов "живых" объектов. Java Serialization API предоставляет разработчикам Java стандартный механизм управления сериализацией объектов. API мал и легок в применении, а его классы и методы просты для понимания.
        Использовать Reader, Writer
        1. Записать его в файл прописал относительный путь.
        2. Записать его в файл прописав абсолютный путь.
        3. Вычитать текст из первого файла.
        4. Вычитать текст из второго файла
        5. Создать объект Ферма с полями. Выполнить сериализацию 2 ферм и десериализацию в файл. (интерфейс Externelizibel)

        1. Создать 5 потоков, каждый из которых вычисляет среднее арифметическое коллекции из 5 случайных целых чисел
            и выводит на экран. Потоки решать двумя способоами через класс Thread и интерфейс Runnable

     */

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\maxya\\IdeaProjects\\JavaProject\\src\\out1.txt");
        File fileAbs = new File("src", "out2.txt");

        //ЗАПИСЬ
        System.out.println("*** ЗАПИСБ ***");
        try (FileWriter fileWriter = new FileWriter(file)){
            System.out.println("Запись по пути");
            fileWriter.write("Сериализация объектов - это процесс сохранения состояния объектов в виде последовательности байтов, а также процесс восстановления в дальнейшем из этих байтов \"живых\" объектов. Java Serialization API предоставляет разработчикам Java стандартный механизм управления сериализацией объектов. API мал и легок в применении, а его классы и методы просты для понимания.");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        try (FileWriter fileWriter = new FileWriter(fileAbs)){
            System.out.println("Запись по абс пути");
            fileWriter.write("Сериализация объектов - это процесс сохранения состояния объектов в виде последовательности байтов, а также процесс восстановления в дальнейшем из этих байтов \"живых\" объектов. Java Serialization API предоставляет разработчикам Java стандартный механизм управления сериализацией объектов. API мал и легок в применении, а его классы и методы просты для понимания.");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        //ЧТЕНИЕ
        System.out.println("*** ЧТЕНИЕ ***");
        try (FileReader fileReader = new FileReader(file)) {
            System.out.println("Чтение файл 1");
            System.out.println(fileReader.readAllAsString());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        try (FileReader fileReader = new FileReader(fileAbs)) {
            System.out.println("Чтение файл 2");
            System.out.println(fileReader.readAllAsString());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        //ФЕРМА
        System.out.println("*** ФЕРМА ***");
        Farm farm1 = new Farm("FunnyFarm", 15);
        Farm farm2 = new Farm("notFunnyFarm", 1);

        File fileFarm = new File("src", "farm.txt");
        List<Farm> farms = new ArrayList<>();
        farms.add(farm1);
        farms.add(farm2);

        serialize(fileFarm, farms);
        farms.clear();
        System.out.println(deserialize(fileFarm));
    }

    static void serialize(File file, List<Farm> farms){
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))){       //FileOutputStream просит проверять исключения
            //ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            System.out.println("Сериализация ферм");
            objectOutputStream.writeObject(farms);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    static List<Farm> deserialize(File file){
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))){       //FileOutputStream просит проверять исключения
            //ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);                 //оба потока (file и object) ресурс занес

            System.out.println("Десериализация ферм");
            return (List<Farm>) objectInputStream.readObject();

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        return null;
    }

}
