import java.util.Date;
import java.util.List;

public class Experience extends Employee{
    private int experienceInYear;
    private String proSkill;

    

    public Experience(String ID, String fullname, Date birthDay, String phone, String email, String employeeType, List<Certificate> certificates, int experienceInYear, String proSkill) {
        super(ID, fullname, birthDay, phone, email, employeeType, certificates);
        this.experienceInYear = experienceInYear;
        this.proSkill = proSkill;
    }

    public Experience(int experienceInYear, String proSkill) {
        this.experienceInYear = experienceInYear;
        this.proSkill = proSkill;
    }

    public int getExperienceInYear() {
        return experienceInYear;
    }

    public void setExperienceInYear(int experienceInYear) {
        this.experienceInYear = experienceInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "information of experience[ "+ " ID: "+ ID + ", Fullname: " + fullname + ", Birth day: " +  birthDay + ", Phone: " + phone + ", Email: " + email + ", Experience in year: " + experienceInYear + ", Pro skill: " + proSkill + " ]";
    }
}
