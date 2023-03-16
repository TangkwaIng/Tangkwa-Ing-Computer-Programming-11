import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        School school = new School();

        //Adding 10 students
        Student firstStudent = new Student("Mark", "Crimson", 11);
        school.addStudent(firstStudent);
        Student secondStudent = new Student("John", "Smith", 10);
        school.addStudent(secondStudent);
        Student thirdStudent = new Student("Dana", "Te", 12);
        school.addStudent(thirdStudent);
        Student fourthStudent = new Student("Yumiki", "Tong", 8);
        school.addStudent(fourthStudent);
        Student fifthStudent = new Student("Sarah", "Chan", 12);
        school.addStudent(fifthStudent);
        Student sixthStudent = new Student("Konrad", "Cheung", 11);
        school.addStudent(sixthStudent);
        Student seventhStudent = new Student("Iris", "Tong", 12);
        school.addStudent(seventhStudent);
        Student eighthStudent = new Student("Kanade", "Tong", 8);
        school.addStudent(eighthStudent);
        Student ninthStudent = new Student("Bob", "Man", 9);
        school.addStudent(ninthStudent);
        Student tenthStudent = new Student("Bonbon", "Bach", 10);
        school.addStudent(tenthStudent);

        //Adding 3 teachers
        Teacher firstTeacher = new Teacher("Brain","Smith", "Math");
        school.addTeacher(firstTeacher);
        Teacher secondTeacher = new Teacher("Long","Dean", "Graphic Design");
        school.addTeacher(secondTeacher);
        Teacher thirdTeacher = new Teacher("Heather","Wong", "Ceramics");
        school.addTeacher(thirdTeacher);

        //Displaying the students list
        ArrayList<Student> firstStudentList = school.getStudents();
        System.out.println("\nList of Students: ");
        for (Student infos : firstStudentList) {
            System.out.println(infos.toString());
        }

        //Displaying the teachers list
        ArrayList<Teacher> firstTeacherList = school.getTeachers();
        System.out.println("\nList of Teachers: ");
        for (Teacher infos : firstTeacherList) {
            System.out.println(infos.toString());
        }

        //Removing 2 students
        school.removeStudent(firstStudent);
        school.removeStudent(secondStudent);

        //Removing 1 teacher
        school.removeTeacher(firstTeacher);

        //Displaying the students list
        ArrayList<Student> secondStudentList = school.getStudents();
        System.out.println("\nList of Students(modified): ");
        for (Student infos : secondStudentList) {
            System.out.println(infos.toString());
        }

        //Displaying the teachers list
        ArrayList<Teacher> secondTeacherList = school.getTeachers();
        System.out.println("\nList of Teachers(modified): ");
        for (Teacher infos : secondTeacherList) {
            System.out.println(infos.toString());
        }
    }
}