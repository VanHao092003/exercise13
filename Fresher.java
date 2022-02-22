import java.util.Date;
import java.util.List;

public class Fresher extends Employee{
    private String graduationDate;
    private String graduationRank;
    private String education;
    

    


    public Fresher(String ID, String fullname, Date birthDay, String phone, String email, String employeeType, List<Certificate> certificates, String graduationDate, String graduationRank,
            String education) {
        super(ID, fullname, birthDay, phone, email, employeeType, certificates);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }


    public String getGraduationDate() {
        return graduationDate;
    }


    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }


    public String getGraduationRank() {
        return graduationRank;
    }


    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }


    public String getEducation() {
        return education;
    }


    public void setEducation(String education) {
        this.education = education;
    }


    @Override
    public String toString() {
        return "information of Fresher [ "+ " ID: "+ ID + ", Fullname: " + fullname + ", Birth day: " +  birthDay + ", Phone: " + phone + ", Email: " + email + ", Certificates: " + certificates.toString() + ", Graduation date: " + graduationDate + ", Graduation rank: " + graduationRank + ", Education: " + education + " ]";
    }
}
