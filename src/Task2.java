import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите имя");
        String firstName = scanner.nextLine();
        System.out.println("Введите фамилию");
        String firstMiddle = scanner1.nextLine();
        System.out.println("Введите отчество");
        String lastName = scanner2.nextLine();
        if (firstName.isBlank() == true) {
            throw new RuntimeException("Вы не ввели имя");
        }
        if (firstMiddle.isBlank() == true) {
            throw new RuntimeException("Вы не ввели фамилию");
        }
        if (lastName.isBlank() == true) {
            throw new RuntimeException("Вы не ввели отчество");
        }

        String fullName = firstName + " " + firstMiddle + " " + lastName;

        System.out.println(fullName.toUpperCase());
    }
}
