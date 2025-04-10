import java.util.Random;
public class Dice {

    Random rand = new Random();

    public int roll_d20(){
        int result = rand.nextInt(1, 20);
        return result;
    }

    public int roll_d10(){
        int result = rand.nextInt(1, 10);
        return result;
    }

    public int roll_d8(){
        int result = rand.nextInt(1, 8);
        return result;
    }

    public int roll_d6(){
        int result = rand.nextInt(1, 6);
        return result;
    }

    public int roll_d4(){
        int result = rand.nextInt(1, 4);
        return result;
    }

    public int roll_d2(){
        int result = rand.nextInt(1, 2);
        return result;
    }
}
