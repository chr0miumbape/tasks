import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие: ");
            System.out.println("1.Деление");
            System.out.println("2.Умножение");
            System.out.println("3.Сложение");
            System.out.println("4.Вычитание");
            System.out.println("5.Выйти");
            int choise = s.nextInt();
            if (choise > 5){
                System.out.println("Такой операции не существует");

            }
            else if (choise < 1){
                System.out.println("Такой операции не существует");

            }
            switch (choise){
                case 5:
                    System.out.println("Вы вышли из программы");
                    System.exit(0);
                    case 1 :
                Scanner d = new Scanner(System.in);
                System.out.println("Введите число:");
                int dOne = d.nextInt();
                if (dOne == 0) {
                    System.out.println("Ошибка, на 0 делить нельзя");
                }
                System.out.println("Введите число:");
                int dSec = d.nextInt();
                if (dSec == 0) {
                    System.out.println("Ошибка, на 0 делить нельзя");
                }
                System.out.println("Результат деления: " + dOne / dSec);
                break;
                    case 2 :
                Scanner y = new Scanner(System.in);
                System.out.println("Введите число:");
                int yOne = y.nextInt();
                System.out.println("Введите число:");
                int ySec = y.nextInt();
                System.out.println("Результат Умножения: " + yOne * ySec);
                break;
                    case 3 :
                Scanner p = new Scanner(System.in);
                System.out.println("Введите число:");
                int pOne = p.nextInt();
                System.out.println("Введите число:");
                int pSec = p.nextInt();
                int res = pOne + pSec;
                System.out.println("Результат Сложения: " + res);
                break;
                    case 4:
                Scanner m = new Scanner(System.in);
                System.out.println("Введите число:");
                int mOne = m.nextInt();
                System.out.println("Введите число:");
                int mSec = m.nextInt();
                int res2 = mOne - mSec;
                System.out.println("Результат Вычитания: " + res2);
                break;
            }
        }
    }
}

