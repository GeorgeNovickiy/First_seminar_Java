package homework1;

import homework1.task.Task1;
import homework1.task.Task2;
import homework1.task.Task3;
import homework1.task.Task4;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число n: ");
//        String  number = scanner.next();

//        Решение первой задачи:
//        System.out.println("Треугольное число равно ");
//        System.out.println(Task1.triangleNum(Integer.parseInt(number)));

//        Решение второй задачи:
//        System.out.println("Произведение чисел от 1 до n равно");
//        System.out.println(Task2.factorial(Integer.parseInt(number)));


//        Решение третьей задачи:
//        System.out.println("Простые числа от 1 до n: ");
//        Task3.primeNum(Integer.parseInt(number));

//        Решение четвертой задачи:
        System.out.println("Введите первое число: ");
        String  num1 = scanner.next();
        System.out.println("Введите действие, которое нужно выполнить: " +
                "1 - сложение" +
                "2 - вычитание" +
                "3 - умножение" +
                "4 - деление ");
        String  action = scanner.next();
        System.out.println("Введите второе число: ");
        String  num2 = scanner.next();
        System.out.println("Результат: ");
        System.out.println(Task4.calculator(Double.parseDouble(num1),Double.parseDouble(action),Double.parseDouble(num2)));

    }
}
