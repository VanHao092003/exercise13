import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Employee{
    protected String ID;
    protected String fullname;
    protected Date birthDay;
    protected String phone; 
    protected String email;
    protected String employeeType;
    protected List<Certificate> certificates;

    public Employee(){
        certificates = new ArrayList<>();
    }

    public Employee(List<Certificate> certificates) {
        this.certificates = certificates;
    }

    public Employee(String iD, String fullname, Date birthDay, String phone, String email, String employeeType, List<Certificate> certificates) {
        this.ID = iD;
        this.fullname = fullname;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        this.employeeType = employeeType;
        this.certificates = certificates;
    }

    public List<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }

    public String getID() {
        return ID;
    }
    public void setID(String iD) {
        ID = iD;
    }
    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public Date getBirthDay() {
        return birthDay;
    }
    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmployeeType() {
        return employeeType;
    }
    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public void addCertificate(Certificate certificate){
        this.certificates.add(certificate);
    }
    public void deleteCertificate(String certificateID){
        Certificate certificate  = this.certificates.stream().filter(o -> o.getCertificateID().equals(certificateID)).findFirst().orElse(null);
        if(certificate != null){
            certificates.remove(certificate);
        }
        else{
            System.out.println("Value dose not exit.");
        }
    }
    public void deleteAll(){
        certificates.removeAll(certificates);
        System.out.println("delete successfully.");
    }
    
}