package homework1.task;
//3. Вывести все простые числа от 1 до 1000
public class Task3 {
    public static void primeNum(int num) {
        boolean flag = true;
        while  (num > 1){
            flag = true;
            for (int j = 2; j < num;){
                if (num % j != 0) {j++;}
                else {
                    flag = false;
                    j++;
                }
            }
            if (flag == true) System.out.println(num);
            num--;
        }
    }
}
