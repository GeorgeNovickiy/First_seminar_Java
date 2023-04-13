package homework1;

import homework1.task.Task1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число : ");
        String  number = scanner.next();
        System.out.println("Треугольное число равно ");
        System.out.println(Task1.triangleNum(Integer.parseInt(number)));
    }
}
