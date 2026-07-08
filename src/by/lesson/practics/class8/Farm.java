package by.lesson.practics.class8;

import java.io.*;

public class Farm implements Externalizable {
    //private static final int id = 0;    //статический айдишник
    private String name;
    private int countAnimals;

    public Farm() {
    }

    public Farm(String name, int countAnimals) {
        this.name = name;
        this.countAnimals = countAnimals;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        //System.out.println(((Farm)out).getName());        //Выдает ошибку несовместимых классов, нужно по другому
        out.writeUTF(this.name);
        out.write(this.countAnimals);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.name = in.readUTF();
        this.countAnimals = in.read();
    }

    public String getName() {
        return name;
    }

    public int getCountAnimals() {
        return countAnimals;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "name='" + name + '\'' +
                ", countAnimals=" + countAnimals +
                '}';
    }
}
