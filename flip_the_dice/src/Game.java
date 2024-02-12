import java.util.Random;

public class Game {
    public void play(){
        Dice dice = new Dice();

        if(dice.throwDice() == dice.throwDice()){
            System.out.println("SAME");
        } else{
            System.out.println("DIFFERENT");
        }
    }
}
