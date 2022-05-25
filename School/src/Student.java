public class Student {
    private int id;
    private String name;
    private int grade;
    private int fee_paid;
    final private int fee_total = 30_000;

    public Student(int id, String name, int grade) {
        this.fee_paid = 0;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public void setGrade(int g){
        this.grade = g;
    }

    public void payFees(int fee_add){
        this.fee_paid+=fee_add;
        System.out.println("Fee paid - "+this.fee_paid);
        System.out.println("Fee remain - "+ (this.fee_total - this.fee_paid));
        School.updateTotalMoneyEarned(fee_add);
    }

    public int getFee_paid(){
        return this.fee_paid;
    }

    @Override
    public String toString() {
        return name;
    }
}
