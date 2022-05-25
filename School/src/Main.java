import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher(1,"Rush",1000);
        Teacher t2 = new Teacher(2,"ingale",800);
        Teacher t3 = new Teacher(3,"vanita",900);

        Student s1 = new Student(1,"Sumit",5);
        Student s2 = new Student(2,"Mudit",6);
        Student s3 = new Student(3,"Aman",7);

        ArrayList<Teacher> t_arr = new ArrayList<>();
        ArrayList<Student> s_arr = new ArrayList<>();
        t_arr.add(t1);
        t_arr.add(t2);
        t_arr.add(t3);
        s_arr.add(s1);
        s_arr.add(s2);
        s_arr.add(s3);

        School pis = new School(t_arr,s_arr);
        System.out.println(pis.getTotalMoneyEarned());
        s1.payFees(10000);
        System.out.println(pis.getTotalMoneyEarned());

        //paying teacher salary:
        t1.updateSalary(t1.getSalary());
        System.out.println(pis.getTotalMoneyEarned());

        System.out.println(s1);

    }
}
