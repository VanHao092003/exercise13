import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import exception.BirthDayException;
import exception.EmailException;
import exception.PhoneException;

public class Manage {
    Scanner scanner = new Scanner(System.in);
    private List<Employee> employees;

    public Manage(){
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }

    public void fix(String ID) throws BirthDayException, PhoneException, EmailException{

        Employee employee = this.employees.stream().filter(o -> o.getID().equals(ID)).findFirst().orElse(null);
        if(employee != null){
            while (true) {
                System.out.println("You are want to fix: ");
                System.out.println("--------------------------");
                System.out.println("1 : name");
                System.out.println("2: birth day");
                System.out.println("3 : phone");
                System.out.println("4 : email");
                System.out.println("5 : employee type");
                System.out.println("6 : certificates");
                System.out.println("7 : Exit.");
                String choose = scanner.nextLine();
                switch (choose) {
                    case "1":{
                        System.out.println("old name: " + employee.getFullname());
                        System.out.print("new name: " ); String name = scanner.nextLine();
                        employee.setFullname(name);
                        System.out.println("You just successfully setup.");
                        break;
                    }
                    case "2":{
                        System.out.println("old birth day: " + employee.getBirthDay());
                        System.out.print("new birth day: "); String birthDay = scanner.nextLine();
                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                        enter: {
                            for(;;){
                                try {
                                    java.util.Date date = dateFormat.parse(birthDay);
                                    employee.setBirthDay(date);
                                    System.out.println("You just successfully setup.");
                                    break enter;
                                } catch (Exception e) {
                                    BirthDayException birthDayException = new BirthDayException("Wrong syntax. Enter again please.");
                                    System.out.println(birthDayException.getError());
                                }
                            }
                        }
                        break;
                    }
                    case "3":{
                        System.out.println("old phone: " + employee.getPhone());
                        System.out.print("new phone: "); String phone = scanner.nextLine();
                        enter: {
                            for(;;){
                                try {
                                    if(phone.length() != 10){
                                        employee.setPhone(phone);
                                        throw new PhoneException();
                                    }
                                    System.out.println("You just successfully setup.");
                                    break enter;
                                } catch (Exception e) {
                                    System.out.println("Wrong syntax. Enter again please.");
                                }
                            }
                        }
                        break;
                    }case "4":{
                        System.out.println("old email: " + employee.getEmail());
                        System.out.print("new email: "); String email = scanner.nextLine();
                        enter:{
                            for(;;){
                                try {
                                    String[] string = email.split("@");
                                    if(string[1] != "gmail.com"){
                                        employee.setEmail(email);
                                        throw new EmailException();
                                    }
                                    System.out.println("You just successfully setup.");
                                    break enter;
                                } catch (Exception e) {
                                    System.out.println("Wrong syntax. Enter again please.");
                                }
                            }
                        }
                        break;
                    }case "5":{
                        System.out.println("old employee type: " + employee.getEmployeeType());
                        System.out.println("-----choose-----");
                        System.out.println("Press 0: setup -> experience.");
                        System.out.println("Press 1: setup -> fresher.");
                        System.out.println("Press 2: setup -> intern.");
                        System.out.print("new employee: "); String employeeType = scanner.nextLine();
                        employee.setEmployeeType(employeeType);
                        break;
                    }case "6":{
                        employee.getCertificates().forEach(o -> System.out.println(o));
                        System.out.println("--------------------------");
                        System.out.println("1 : add certificate.");
                        System.out.println("2 : delete certificate.");
                        System.out.println("3 : delete all.");
                        String choose2 = scanner.nextLine();
                        switch (choose2) {
                            case "1":{
                                System.out.println("-----Information certificate-----");
                                System.out.print("Certificate ID: "); String certificateID = scanner.nextLine();
                                System.out.print("Certificate name: "); String certificateName = scanner.nextLine();
                                System.out.print("Certificate rank: "); String certificateRank = scanner.nextLine();
                                System.out.print("Certificate date: "); String certificatedDate = scanner.nextLine();
                                Certificate certificate2 = new Certificate(certificateID, certificateName, certificateRank, certificatedDate);
                                employee.addCertificate(certificate2);
                                break;
                            }
                            case "2":{
                                System.out.print("Enter ID certificate: "); String certificateID = scanner.nextLine();
                                employee.deleteCertificate(certificateID);
                                break;
                            }
                            case "3":{
                                employee.deleteAll();
                                break;
                            }
                            default:
                            System.out.println("Value dose not exit.");
                                break;
                        }
                        break;
                    }case "7":{
                        return;
                    }
                    default:
                    System.out.println("Invalid.");
                        break;
                }
            }
        }
    }
    public void countNumberEmployee(){
        int count = employees.size();
        System.out.println("Total number of employee: " + count);
    }
    public Employee deleteEmployee(String ID){
        Employee employee = employees.stream().filter(o -> o.getID().equals(ID)).findFirst().orElse(null);
        if(employee != null){
            employees.remove(employee);
            return employee;
        }
        else{
            System.out.println("Valid dose not exit.");
            return null;
        }
    }

    public void showAllExperienceByType(String employeeType){
        employees.stream().filter(o -> o.getEmployeeType().equals(employeeType)).collect(Collectors.toList()).forEach(o -> System.out.println(o));
    }
    
    public void showAllEmployeeAreExperience(){
        for(Employee employee : employees){
            if (employee instanceof Experience) {
                System.out.println(employee);
            }
        }
    }
    public void showAllEmployeeAreFresher(){
        for(Employee employee : employees){
            if(employee instanceof Fresher ){
                System.out.println(employee);
            }
        }
    }
    public void showAllEmployeeAreIntern(){
        for(Employee employee : employees){
            if (employee instanceof Intern) {
                System.out.println(employee);
            }
        }
    }
}
