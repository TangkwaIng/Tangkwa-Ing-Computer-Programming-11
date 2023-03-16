//Class for teachers and their information
public class Teacher {

    //Fields
    private String name;
    private String firstName;
    private String lastName;
    private String subject;

    //Constructors
    Teacher() {
        name = "";
        firstName = "";
        lastName = "";
        subject = "";
    }
    Teacher (String firstName, String lastName, String subject) {
        this.name = firstName + " " + lastName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    //To print out
    public String toString() {
        return "Name: " + this.name + "\tSubject: " + this.subject;
    }

}
