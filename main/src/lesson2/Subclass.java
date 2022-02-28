package lesson2;

import java.util.Arrays;
import java.util.List;

public class Subclass extends SuperClass {
    private String[] sentences;

    public int getAge() {
        System.out.println("Subclass.getAge");
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public Subclass(String[] sentences){
        this.sentences = sentences;
    }

    @Override
    public void example() {

    }

    public static void main(String[] args) {
        System.out.println("args = " + Arrays.deepToString(args));
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        List<String> names = List.of();
    }
}
