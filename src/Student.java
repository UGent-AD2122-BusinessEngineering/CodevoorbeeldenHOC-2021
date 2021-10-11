import java.io.Serializable;

public class Student implements Serializable {

    private static long serialVersionID = 5467889;

    private String naam;
    private String voornaam;
    private String studentID;

    public Student(String naam, String voornaam, String studentID) {
        this.naam = naam;
        this.voornaam = voornaam;
        this.studentID = studentID;
    }


    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "naam='" + naam + '\'' +
                ", voornaam='" + voornaam + '\'' +
                ", studentID='" + studentID + '\'' +
                '}';
    }
}
