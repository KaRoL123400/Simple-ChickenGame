public class Shop {

    //shop logic
    static int buyEgg(int eggs, int bought, int money, int balcalc) throws InterruptedException {
        System.out.print("How many chickens do you want?: ");
        bought = Main.snr.nextInt();

        while (balcalc <= money){
            balcalc++;
        }

        balcalc /= 100;

        if(!(balcalc == bought)){
            System.out.println("You don't have money!");
        } else if (eggs == 3){
            System.out.println("You can't get more chickens!");
        } else{
            eggs += bought;

            money -= 100;

            bought = 0;

            Thread.sleep(1000);
        }
        return eggs;
    }

    //selling eggs
    static void selleggs(int money, int sellgg){

        money += 50 * sellgg;

        sellgg = 0;
    }

}
