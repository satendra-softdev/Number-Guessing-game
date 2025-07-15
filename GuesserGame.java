import java.util.Scanner;
class Guesser{
    int GuesserNum;
    public int GuesserNumb(){
        System.out.println("Guesser kindly guess your number:");
        Scanner sc=new Scanner(System.in);
        GuesserNum=sc.nextInt();
        return GuesserNum;
    }
}

class Player{
    int PlayerNum;
    public int PlayerNumb(){
        Scanner sc=new Scanner(System.in);
        PlayerNum=sc.nextInt();
        return PlayerNum;
    }
}

class Umpire{
    int Guessernum;
    int Playernum1;
    int Playernum2;
    int Playernum3;
    // This method collect the number chosen by the guesser
    public void CollectNumFromGuesser(){
        Guesser guesser  = new Guesser();
        Guessernum = guesser.GuesserNumb();
    }
    // This method collect the number guessed by the players
    public void CollectNumFromPlayers(){
        System.out.println("Player1 guess your number:");
        Player p1 = new Player();
        Playernum1 = p1.PlayerNumb();

        System.out.println("Player2 guess your number:");
        Player p2 = new Player();
        Playernum2 = p2.PlayerNumb();

        System.out.println("Player3 guess youur number:");
        Player p3 = new Player();
        Playernum3 = p3.PlayerNumb();   
    }
    // This method compares the number guessed by the players with the number chosen by the guesser
    public void Compare(){
        if(Guessernum==Playernum1){
            if(Guessernum==Playernum2 && Guessernum==Playernum3){
                System.out.println("All players won the game...");
            }
            else if(Guessernum==Playernum2){
                System.out.println("Player1 and Player2 won the game...");
            }
            else if(Guessernum==Playernum3){
                System.out.println("Player1 and Player3 won the game...");
            }
            else{
                System.out.println("Player1 won the game...");
            }
        }
        else if(Guessernum==Playernum2){
            if(Guessernum==Playernum3){
                System.out.println("Player2 and Player3 won the game...");
            }
            else{
                System.out.println("Player2 won the game...");
            }
        }
        else if(Guessernum==Playernum3){
            System.out.println("Player3 won the game...");
        }
        else{
            System.out.println("All players lost the game...");
        }
    }
}

public class GuesserGame{
    public static void main(String[] args) {
        System.out.println("-------- GAME STARTED ----------");
        Umpire ump = new Umpire();
        ump.CollectNumFromGuesser();
        ump.CollectNumFromPlayers();
        ump.Compare();
        System.out.println("-------- GAME OVER -----------"); 
    }
}
