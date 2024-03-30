import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Game game = new Game();
        Dice dice = new Dice();

        int numberPlayers=0;            //Set number of playres
        do{
            try{
                System.out.println("Insert number of players (>0): ");
                numberPlayers = Integer.parseInt(sc.nextLine());
            } catch(Exception e){
                System.out.println("ERROR: "+e.getMessage());
            }
        } while(numberPlayers<=0);

        int rounds = dice.throwDice();  //Set number of rounds
        System.out.println("Number of rounds: "+rounds);

        game.play(numberPlayers, rounds);
    }
}
