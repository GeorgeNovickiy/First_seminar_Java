package homework1.task;
//4. Реализовать простой калькулятор
public class Task4 {
    public static double calculator(double  x, double  act, double  y) {
        double  result = 0;
        if (act == 1) result = x + y;
        else if (act == 2) result = x - y;
        else if (act == 3) result = x * y;
        else result = x / y;
        return  result;
    }
}
