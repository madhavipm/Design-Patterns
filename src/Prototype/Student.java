package Prototype;

public class Student implements Prototype<Student> {

    private String name;
    private int age;
    private String batch;
    private double psp;
    private double avgpsp;
    Student(){

    }
    Student(Student student){
        this.name = student.name;
        this.age = student.age;
        this.batch = student.batch;
        this.psp = student.psp;
        this.avgpsp = student.avgpsp;
    }
    Student(String name, int age, String batch, double psp, double avgpsp) {
        this.name = name;
        this.age = age;
        this.batch = batch;
        this.psp = psp;
        this.avgpsp = avgpsp;
    }


    @Override
    public Student clone() {
        return new Student(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }
    public void setAvgpsp(double avgpsp) {
        this.avgpsp = avgpsp;
    }
}
