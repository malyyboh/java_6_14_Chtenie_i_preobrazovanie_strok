package it.campe;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String name2 = scanner.nextLine();
        String name3 = scanner.nextLine();

        System.out.println(name.toLowerCase());
        System.out.println(name2.toUpperCase());
        System.out.println(name3);

    }
}
