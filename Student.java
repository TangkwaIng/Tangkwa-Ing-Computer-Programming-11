//Class for students and their information
public class Student {

    //Fields
    private String name;
    private String firstName;
    private String lastName;
    private int grade = 0;
    private static int studentID = 0;
    private int number;

    //Constructors
    Student() {
        name = "";
        firstName = "";
        lastName = "";
        grade = 0;
        studentID++;
        number = studentID;
    }
    Student (String firstName, String lastName, int grade) {
        this.name = firstName + " " + lastName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentID++;
        this.number = studentID;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    //To print out
    public String toString() {
        return "Name: " + this.name + "\tGrade: " + this.grade + "\tStudent Number: " + this.number;
    }

}