import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    static Scanner snr = new Scanner(System.in);
    static Random rnd = new Random();
    public static int eggs = 1;
    public static AtomicInteger money = new AtomicInteger(100);
    public static int balcalc;
    public static int sellgg;
    public static int foxCh;
    public static int chickeneat;
    public static int saturation = 1;
    public static boolean close = true;

    public static void main(String[] args) throws InterruptedException {

        int opt = 0;
        Shop shop = new Shop();
        DaySys daySys = new DaySys();
        Hen hen = new Hen();


        do {
            System.out.println("-----------------");
            System.out.println("The Chicken Game!");
            System.out.println("-----------------");
            System.out.println("Chickens: " + eggs);
            System.out.println("Money: " + money);
            System.out.println("Saturation: " + saturation);
            System.out.println("-----------------");
            System.out.println("Choose option: ");
            System.out.println("1. Buy eggs"); //done
            System.out.println("2. Sell eggs"); //done
            System.out.println("3. Feed the chicken");
            System.out.println("4. Next day"); //done
            System.out.println("5. Go to the henhouse"); //done
            System.out.println("6. Exit"); //done
            System.out.println("-----------------");
            System.out.print("Choose one: ");


            try{
                opt = snr.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Not a number");
                close();
            }

            switch (opt){
                case 1 -> eggs = shop.buyEgg(eggs, money);
                case 2 -> shop.selleggs(money, sellgg);
                case 3 -> hen.feedChickens(money, saturation);
                case 4 -> daySys.nextDay(saturation, close, sellgg, eggs, chickeneat, foxCh);
                case 5 -> hen.goHen(eggs);
                case 6 -> close();
                default -> System.out.println("Invaild option!");
            }
        } while (close);

        snr.close();
    }
    static void close(){
        close = false;
    }
}