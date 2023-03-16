import java.util.ArrayList;

//School class for both ArrayLists (students and teachers) and additional methods
public class School {

    //Fields
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    private String name;
    private String height;
    private String weight;

    //Method to add a new teacher
    public void addTeacher(Teacher newTeacher) {
        teachers.add(newTeacher);
    }

    //Method to remove a teacher
    public void removeTeacher(Teacher unwantedTeacher) {
        teachers.remove(unwantedTeacher);
    }

    //Method to show teachers
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    //Method to add a new student
    public void addStudent(Student newStudent) {
        students.add(newStudent);
    }

    //Method to remove a student
    public void removeStudent(Student unwantedStudent) {
        students.remove(unwantedStudent);
    }

    //Method to show all students
    public ArrayList<Student> getStudents() {
        return students;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    //Constructor - will not interfere with the main class
    public School() {
    }
}