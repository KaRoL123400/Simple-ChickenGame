public class Hen {
    static void feedChickens(int money, int saturation){

        if(money >= 50){
            saturation += 1;
            money -= 50;
            System.out.println("You feed your chickens!");
        } else{
            System.out.println("You dont have money!");
        }
    }

    static void goHen(int eggs){
        System.out.println("You have: " + eggs + " chickens");
    }

}
