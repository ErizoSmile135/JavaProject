package by.lesson.practics.class9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AvrThread extends Thread {
    private int num;
    public AvrThread(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int number = random.nextInt(100);       //(int) (Math.random() * 100) - тоже вариант
            numbers.add(number);
            sum += number;
        }

        double average = (double) sum / numbers.size();
        System.out.println("(AvrThread) - " + this.num + " Среднее = " + average);
    }
}
