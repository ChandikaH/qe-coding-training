import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * @author chandikah
 * on 2022-03-15
 */
public class Student {
    private int age;
    private String name;

    public Student() {

    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void showStudent() {
        System.out.println("Student Age = " + age);
        System.out.println("Student Name = " + name);
    }

    public void StudentNamesLoop() {
        String[] names = {"Kevin", "Dan", "Yel", "Neo", "Aell"};
        Collections.sort(Arrays.asList(names));
        //Collections.reverse(Arrays.asList(names));

        for (String name : names) {
            System.out.println("Names of the array are: " + name);
        }
    }

    public void StudentNumbersLoop() {
        int[] numbers = {2,1,-2,10,7,8,4,8};
        Arrays.sort(numbers);

        for (int number : numbers) {
            System.out.println("Numbers of the array are: " + number);
        }
    }
}
