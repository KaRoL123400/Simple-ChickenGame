public class DaySys {

    static void nextDay(int saturation, boolean close, int sellgg, int eggs, int chickeneat, int foxCh){

        System.out.println("Next day!");

        if(eggs == 0){
            System.out.println("You didn't get anything because you don't have chickens!");
        } else if (saturation <= 0) {
            System.out.println("Your chickens die because they don't have food!");
            close = false;
        } else{
            sellgg = Main.rnd.nextInt(1, 5);
            System.out.println("You earn " + sellgg + " eggs!");
            saturation--;
        }

        foxCh = Main.rnd.nextInt(1, 4);

        int rand = 0;

        rand += eggs;


        switch (foxCh){
            case 1, 2 -> System.out.println("Your chickens are fine!");
            case 3, 4, 5, 6, 7, 8, 9 -> Fox.foxeat(eggs, chickeneat, close);
        }

        System.out.println("Fox eats " + chickeneat + " of your chickens!");

    }

}
