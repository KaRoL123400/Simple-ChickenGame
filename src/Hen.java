import java.util.concurrent.atomic.AtomicInteger;

public class Hen {
     public void feedChickens(AtomicInteger money, int saturation){

        if(money.get() >= 50){
            saturation += 1;
            money.set(money.get() - 50);
            System.out.println("You feed your chickens!");
        } else{
            System.out.println("You dont have money!");
        }
    }

    public void goHen(int eggs){
        System.out.println("You have: " + eggs + " chickens");
    }

}
