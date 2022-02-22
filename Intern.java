import java.util.Date;
import java.util.List;

public class Intern extends Employee{
    private String majors;
    private int semester;
    private String universityName;

    

    public Intern(String iD, String fullname, Date birthDay, String phone, String email, String employeeType, List<Certificate> certificates, String majors, int semester, String universityName) {
        super(iD, fullname, birthDay, phone, email, employeeType, certificates);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public Intern(String majors, int semester, String universityName) {
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "information of experience[ "+ " ID: "+ ID + ", Fullname: " + fullname + ", Birth day: " +  birthDay + ", Phone: " + phone + ", Email: " + email + "Certificates: " + certificates + ", Majors: " + majors + ", Semester: " + semester + ", University name: " + universityName+ " ]";
    }
}
