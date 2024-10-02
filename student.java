package SOAL;

public class student extends person {

    private String major;
    private int studentNumber;
    private int score;

    public student(String name, int age, String major, int studentNumber, int score) {
        super(name , age);
        this.major = major;
        this.studentNumber = studentNumber;
        this.score = score;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void print(){
        System.out.println("----Student-----");
        super.print();
        System.out.println("Major : " + major);
        System.out.println("Student Number : " + studentNumber);
        System.out.println("Score : " + score);
    }
}
