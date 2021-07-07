import java.util.Scanner;

public class Register {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
    }
}
