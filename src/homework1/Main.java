package homework1;

import homework1.task.Task1;
import homework1.task.Task2;
import homework1.task.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        String  number = scanner.next();

//        Решение первой задачи:
//        System.out.println("Треугольное число равно ");
//        System.out.println(Task1.triangleNum(Integer.parseInt(number)));

//        Решение второй задачи:
//        System.out.println("Произведение чисел от 1 до n равно");
//        System.out.println(Task2.factorial(Integer.parseInt(number)));


//        Решение третьей задачи:
        System.out.println("Простые числа от 1 до n: ");
        Task3.primeNum(Integer.parseInt(number));
    }
}
