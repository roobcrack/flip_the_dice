import java.util.Random;

class Dice {
    private Random rd;

    public Dice() {
        this.rd = new Random();
    }
    public int rollDice() {
        return rd.nextInt(6)+1;
    }
    public boolean matchDice(){
        return rollDice() == rollDice();
    }
}