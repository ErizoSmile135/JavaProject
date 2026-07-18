package by.lesson.practics.class9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AvrRunnable implements Runnable {
    private int num;
    public AvrRunnable(int num) {
        this.num = num;
    }
    @Override
    public void run() {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int number = random.nextInt(100);
            numbers.add(number);
            sum += number;
        }

        double average = (double) sum / numbers.size();
        System.out.println("(AvrRunnable) - " + this.num + " Среднее = " + average);
    }
}
