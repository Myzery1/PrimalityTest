import java.util.Scanner;
// Задача:
// ввод — целое число
// вывод — простые числа и количество простых чисел строго меньше введенного числа

public class PrimalityTest {
    public static void main(String[] args) {
        //задаем целое число
        System.out.println("Введите любое положительное целое число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // подсчет количества простых чисел
        int m = 0;
        boolean check = true;
        // если число >2 делится без дробей на любое меньшее число, то отбрасываем
        for (int i = 2; i < n; i++) {
            for (int j = 2; j < i; j++) {
                 if (i % j == 0) {
                     check = false;
                     break;
                }
            }
        // если true, выводим число и увеличиваем счетчик
        if (check) {
            System.out.println(i);
                m++;
        } else check = true;
        }
        // вывод количества простых чисел
        System.out.println("Количество простых чисел: " + m);
    }
}