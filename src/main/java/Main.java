import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\"");
            System.out.println("Для завершения введите \"end\"");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] parts = input.split(",");

            if (students.add(new Student(parts[0], parts[1], parts[2]))) {
                System.out.println("Студент добавлен");
            } else {
                System.out.println("Такой студент уже есть");
            }
        }
        System.out.println("Список студентов: ");
        System.out.println(students.toString().replace(",", "").replace("[", "").replace("]", ""));
    }
}