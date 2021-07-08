import java.util.Scanner;

public class UserManager {
    public static Scanner scanner = new Scanner(System.in);

    public static void registerUser() {

        System.out.println("---- Register a new user ----");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Surname: ");
        String surname = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Phone Number: ");
        long phoneNumber = scanner.nextLong();
        scanner.nextLine();

        Person person = new Person(name, surname, cpf, phoneNumber);
        person.createAccount(person, 1);
        System.out.println(person.toString());
    }

    public static void main(String[] args) {

        System.out.println("---- What do you want to do? ----");
        System.out.println("1 - Register a new user");
        System.out.println("2 - Edit an existing user");
        System.out.println("3 - Delete an user");
        System.out.println("0 - Go back to main menu");          

        int opt = -1;
        while(opt != 0) {
            opt = scanner.nextInt();
            scanner.nextLine();
            switch (opt) {
                case 1:
                    registerUser();
                    opt = 0;
                    break;
            
                default:
                    System.out.println("No valid option\nTry again");
                    break;
            }
        }
        scanner.close();
    }
}
