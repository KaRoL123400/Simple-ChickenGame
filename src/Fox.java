public class Fox {
    public int foxeat(int chickeneat, int eggs, boolean close){
        chickeneat = Main.rnd.nextInt(1, 4);
        if(eggs <= 0){
            close = false;
            System.out.println("Your chickens are eat by a fox");
        }
        else if (chickeneat > eggs){
            foxeat(eggs, chickeneat, close);
            if (chickeneat <= eggs){
                eggs -= chickeneat;
                chickeneat = 0;
            }
        }


        return eggs;
    }
}
