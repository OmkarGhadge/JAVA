public class Teacher {
    private  int id;
    private String name;
    private int salary;

    private int salaryEarned;

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String  getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void updateSalary(int sal){
        this.salaryEarned+= sal;
        School.updateTotalMoneySpent(sal);
    }
}
