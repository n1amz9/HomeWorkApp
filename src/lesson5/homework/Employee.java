package lesson5.homework;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private long salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, long salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

}
