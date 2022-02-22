import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import exception.BirthDayException;
import exception.EmailException;
import exception.PhoneException;

public class Main {
    public static void main(String[] args) throws PhoneException, BirthDayException, EmailException {
        Scanner scanner = new Scanner(System.in);
        Manage manage = new Manage();
        Employee employee = new Employee();
        while (true) {
            System.out.println("---------- menu---------");
            System.out.println("1: To add employee.");
            System.out.println("2: To fix information employee.");
            System.out.println("3: To delete employee.");
            System.out.println("4: To show all experience.");
            System.out.println("5: To show all fresher.");
            System.out.println("6: To show all Intern.");
            System.out.println("7: To exit.");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":{
                    System.out.print("ID: "); String ID = scanner.nextLine();
                    System.out.print("Fullname: "); String fullname = scanner.nextLine();
                    System.out.print("Birth day: "); String birthDayInput = scanner.nextLine();
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Date birthDay = null;
                    try {
                        birthDay = dateFormat.parse(birthDayInput);
                    } catch (Exception e) {
                        BirthDayException exception = new BirthDayException("Wrong syntax, enter again please.");
                        System.out.println("Error: " + exception.getError());
                    }
                    System.out.print("Phone: "); String phone = scanner.nextLine();
                    try {
                        if(phone.length() == 10){
                        }
                    } catch (Exception e) {
                        PhoneException exception = new PhoneException("Wrong syntax, enter again please.");
                        System.out.println("Error: " + exception.getError());
                    }
                    System.out.print("Email: "); String email = scanner.nextLine();
                    try {
                        String[] string = email.split("@");
                        if(string[1] == "gmail.com"){
                            System.out.println("You just successfully setup.");
                        }
                    } catch (Exception e) {
                        EmailException emailException = new EmailException("Wrong syntax, enter again please.");
                        System.out.println("Error: " + emailException.getError());
                    }
                    System.out.print("Number certificates: "); int numberCertificate = scanner.nextInt(); scanner.nextLine();
                    while (numberCertificate > 0) {
                        System.out.println("------Information of each certificate------");
                        System.out.print("Certificate ID: "); String certificateID = scanner.nextLine();
                        System.out.print("Certificate name: "); String certificateName = scanner.nextLine();
                        System.out.print("Certificate rank: "); String certificateRank = scanner.nextLine();
                        System.out.print("Certificate date: "); String certificatedDate = scanner.nextLine();
                        Certificate certificateConstructor = new Certificate(certificateID, certificateName, certificateRank, certificatedDate);
                        employee.addCertificate(certificateConstructor);
                        numberCertificate--;
                    }
                    System.out.print("Employee type: "); String employeeType = scanner.nextLine();
                    if(employeeType == "0"){
                        employeeType = "Experience";
                        System.out.print("Experience in year: "); int experienceInYear = scanner.nextInt(); scanner.nextLine();
                        System.out.print("Pro skill: "); String proSkill = scanner.nextLine();
                        Employee experience = new Experience(ID, fullname, birthDay, phone, email, employeeType, employee.getCertificates(), experienceInYear, proSkill);
                        System.out.println(experience.toString());
                        manage.addEmployee(experience);
                        manage.countNumberEmployee();
                    } else if(employeeType == "1") {
                        employeeType = "Fresher";
                        System.out.print("Graduation date: "); String graduationDate = scanner.nextLine();
                        System.out.print("GraduationRank : "); String graduationRank = scanner.nextLine();
                        System.out.print("Education: "); String education = scanner.nextLine();
                        Fresher fresher = new Fresher(ID, fullname, birthDay, phone, email, employeeType, employee.getCertificates(), graduationDate, graduationRank, education);
                        System.out.println(fresher.toString());
                        manage.addEmployee(fresher);
                        manage.countNumberEmployee();

                    } else if (employeeType == "2"){
                        employeeType = "Intern";
                        System.out.print("Majors: "); String majors = scanner.nextLine();
                        System.out.print("Semester: "); int semester = scanner.nextInt();
                        System.out.print("University name: "); String universityName = scanner.nextLine();
                        Employee intern = new Intern(ID, fullname, birthDay, phone, email, employeeType, employee.getCertificates(), majors, semester, universityName);
                        System.out.println(intern.toString());
                        manage.addEmployee(intern);
                        manage.countNumberEmployee();

                    }
                    break;
                }
                case "2":{
                    System.out.print("Enter ID of employee: "); String ID = scanner.nextLine();
                    manage.fix(ID);
                    break;
                }
                case "3":{
                    System.out.print("Enter ID of employee: "); String ID = scanner.nextLine();
                    System.out.println(manage.deleteEmployee(ID));
                    manage.countNumberEmployee();

                    break;
                }
                case "4":{
                    manage.showAllEmployeeAreExperience();
                    break;
                }
                case "5":{
                    manage.showAllEmployeeAreFresher();
                    break;
                }
                case "6":{
                    manage.showAllEmployeeAreIntern();
                    break;
                }
                case "7":{
                    scanner.close();
                    return;
                }
                default:
                System.out.println("Invalid.");
                    break;
            }
        }
    }
}
