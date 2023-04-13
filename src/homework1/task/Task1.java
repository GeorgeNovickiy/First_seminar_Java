package homework1.task;
//  1. Вычислить n-ое треугольного число (сумма чисел от 1 до n),
public class Task1 {
 public static int triangleNum(int number) {
  int count = number;
  int result = 0;
  while (count > 0){
   result += count;
   count --;
  }
  return result;
 }
}
