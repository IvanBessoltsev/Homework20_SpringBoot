package LearnUp_SpringBoot;

import java.util.Random;
import java.util.Scanner;

public class Game {



    public void play() {
        int b = new Random().nextInt(1000);
        while (true) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if (a > b) {
                System.out.println("Мое число меньше твоего");
            }
            if (a < b) {
                System.out.println("Мое число побольше твоего");
            }
            if (a == b) {
                System.out.println("Ты угадал, я загадал число " + b);
                break;
            }
        }
    }
}
