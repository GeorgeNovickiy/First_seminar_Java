package homework1.task;

public class Task2 {
    public static int factorial(int num) {
        int count = num;
        int result = 1;
        while (count > 1){
            result = result * count;
            count --;
        }
        return result;
    }
}
