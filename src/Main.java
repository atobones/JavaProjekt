import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Напишите свое имя: ");
        String name = scan.nextLine();
        System.out.print("Введите год рождения: ");
        int age = scan.nextInt();
        int x = 2023;

        String suffix = "ХУЙ";
        if (age >= 2008) {
            suffix = " лет";
        }else {
            if (age <= 2008) {
                suffix = " года";
            }
        }
        System.out.println("Привет, " + name);
        System.out.println("В данный момент вам " + (x - age) + suffix);
    }
}

