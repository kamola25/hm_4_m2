import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static LinkedList<String> stringName = new LinkedList<>();
    public static void main(String[] args) {
        System.out.println("Введите свое имена для списка А:");
        Scanner scan = new Scanner(System.in);
        ArrayList<String> names_A = new ArrayList<>();
        ArrayList<String> names_B = new ArrayList<>();
        ArrayList<String> names_C = new ArrayList<>();
        int length,increment,decrement;

        for (int i = 0; i < 5; i++) {
            names_A.add(scan.next());

        }
        System.out.println("Список A (токлько мужские имена):" + names_A);
        System.out.println("\nВведите свое имена для списка B:");
        for (int i = 0; i < 5; i++) {
            names_B.add(scan.next());

        }System.out.println("Список B (токлько женские имена):" + names_B);
        System.out.println("\nВведите свое имена для списка C:");
        for (int i = 0; i < 5; i++) {
            names_C.add(scan.next());
        }
        System.out.println("Список B (токлько женские имена):" + names_C);









    }
}
