
import java.util.concurrent.atomic.AtomicInteger;

public class Shop {

    //shop logic
    public int buyEgg(int eggs, AtomicInteger money) throws InterruptedException {
        System.out.print("How many chickens do you want?: ");
        int bought = Main.snr.nextInt();
        int eggsCost = bought * 100;

        if (bought <= 0) {
            System.out.println("Please provide a number greater than 0");
            return eggs;
        }

        if (eggsCost > money.get()) {
            System.out.println("You don't have money!");
            return eggs;
        }

        if (eggs >= 3){
            System.out.println("You can't get more chickens!");
            return eggs;
        }

        eggs += bought;
        money.set(money.get() - eggsCost);
        bought = 0;
        Thread.sleep(1000);

        return eggs;
    }

    //selling eggs
    public void selleggs(AtomicInteger money, int sellgg){

        money.set(money.get() + 50 * sellgg);

        sellgg = 0;
    }

}
