import java.lang.reflect.Array;
import java.util.ArrayList;

public class School {

    public static int noOfTeachers = 50;
    private ArrayList<Teacher> teachers;
    private static int noOfStudents = 500;
    private ArrayList<Student> students;

    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public School(ArrayList<Teacher> teachers, ArrayList<Student> students) {
        this.teachers = teachers;
        this.students = students;
        this.totalMoneySpent = 0;
        this.totalMoneyEarned = 0;
    }

    public void addStudent(Student s){
        students.add(s);
//        totalMoneyEarned+=s.getFee_paid();
    }
    public void addTeacher(Teacher t){
        teachers.add(t);
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
    public int getTotalMoneyEarned(){
        return totalMoneyEarned;
    }
    public int getTotalMoneySpent(){
        return totalMoneySpent;
    }
    public static void updateTotalMoneyEarned(int x){
        School.totalMoneyEarned+=x;
    }
    public static void updateTotalMoneySpent(int y){
        School.totalMoneyEarned-=y;
        School.totalMoneySpent+=y;
    }

}
