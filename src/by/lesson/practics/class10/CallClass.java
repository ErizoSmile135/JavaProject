package by.lesson.practics.class10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class CallClass implements Callable<String> {

    public CallClass() {
    }

    @Override
    public String call() throws Exception {
        System.out.println("Start " + this.hashCode());//.currentThread().getName());

        Collection<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * 100));
        }

        //Thread.sleep((int) (Math.random() * 1000));
        Thread.sleep(1000);

        Optional<Integer> streamSum = numbers.stream().reduce(Integer::sum);
        Integer sum = streamSum.orElse(-999999999);

        //return String.valueOf(sum);
        return this.hashCode() + ", sum = " + sum;
    }
}
