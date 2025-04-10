import java.util.Scanner;

//-------------------------------
//Text Based Fantasy Game
//Designed and coded by: Gio M
//-------------------------------
public class Main {
    public static void main(String[]args){

        //Stat Values
        //Game will function if altered but balancing will change
        //Feel free to experiment with these values for fun
        int health = 100;
        int defense = 1;
        int attack = 1;
        int basic_encounter = 10;
        int intermediate_encounter = 15;
        int master_encounter = 25;
        int miniboss = 35;
        int boss = 50;
        String playerName = "";

        //Setup & Logistics
        //DO NOT ALTER game will not function if altered
        Scanner scan = new Scanner(System.in);


        //Main Game
        //DO NOT ALTER
        //Game may break or function incorrectly
        System.out.print("You awake in an unfamiliar structure, it's dark with crystal radiating what little light is available.");
        System.out.println("You here a faint voice, so faint it almost seems like it's not there.");
        System.out.println("Mysterious Figure: ...Hello? Can you hear me? Are you alright?");
        System.out.println("Type yes or no: ");
        String awaken_response = "";
        awaken_response = scan.next();

        if(awaken_response.equalsIgnoreCase("yes"))
            System.out.println("Mysterious Figure: That's wonderful to hear! The summoning process can be quite rough with some!");
        if(awaken_response.equalsIgnoreCase("no"))
            System.out.println("Mysterious Figure: I'm sorry, the summoning process can be unforgiving! You should feel better quite soon thankfully.");
        else
            System.out.println("Restalt: Umm... Alright then... We'll just see what happens I suppose...");
        System.out.println("Mysterious Figure: Oh! How rude of me! Allow me to introduce myself!");
        System.out.println("Restalt: I am Restalt, Grand Mage of the Temple of Recursion. It is a pleasure to meet you.");


        System.out.println("Restalt: Tell me, what is your name!");
        System.out.println("Enter your name: ");
        playerName = scan.next();
        System.out.println("Restalt: Ah, " + playerName + ", what a wonderful name!");


        System.out.println("Restalt: We don't have much time, we are being being invaded by an army, a powerful army.");
        System.out.println("Restalt: We need you to help, only the innate magic essence of a summoned being call help us.");
        System.out.println("Restalt: Will you help us?");
        System.out.println("Enter yes or no: ");
        String helpChoice = "";
        helpChoice = scan.next();
        if(helpChoice.equalsIgnoreCase("yes"))
            System.out.println("Restalt:Oh thank you!");
        if(helpChoice.equalsIgnoreCase("no")){
            System.out.println("Restalt: Ah, I see, I suppose I'll have to find someone else...");
            System.exit(0);
        }


        
    }
}
