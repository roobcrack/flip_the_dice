import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dice dice = new Dice();

        //Insert number of players
        int numPlayers=0;
        do {
            try{
                System.out.print("Insert number of players: ");
                numPlayers = Integer.parseInt(sc.nextLine());
                if(numPlayers<=0)
                    throw new IllegalArgumentException("number must be greater than 0");
            } catch(NumberFormatException e){
                System.out.println("  ERROR: Please enter a valid number");
            } catch(IllegalArgumentException e){
                System.out.print("  ERROR: "+e.getMessage());
            }
        } while (numPlayers <= 0);

        //Add each player
        Player[] players = new Player[numPlayers];
        for(int i=0; i<numPlayers; i++){
            System.out.print(i+1+".Insert player: ");
            players[i] = new Player(sc.nextLine());
        }
    }
}
