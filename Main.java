import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manage manage = new Manage();
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
                    System.out.print("Fullname: "); String name = scanner.nextLine();
                    System.out.print("Birth day: "); String birthDayInput = scanner.nextLine();
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    try {
                        Date birthDay = dateFormat.parse(birthDayInput);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    System.out.print("");
                    break;
                }
                case "2":{

                    break;
                }
                case "3":{

                    break;
                }
                case "4":{

                    break;
                }
                case "5":{

                    break;
                }
                case "6":{

                    break;
                }
                case "7":{

                    break;
                }
                default:
                System.out.println("Invalid.");
                    break;
            }
        }
    }
}
