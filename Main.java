//-------------------------------
//Text Based Fantasy Game
//Designed and coded by: Gio M
//@GioM645 on GitHub
//@girastuff on TikTok
//-------------------------------

import java.util.Scanner;

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
        //The number inside the stat assigner can be changed to alter your roll modifier limits
        StatAssigner playerStats = new StatAssigner(4);
        Dice rollDice = new Dice();
        System.out.println("Your strength stat bonus is: " + playerStats.getStr());
        System.out.println("Your agility stat bonus is: " + playerStats.getAgi());
        System.out.println("Your charisma stat bonus is: " + playerStats.getChr());
        System.out.println("Your intelligence stat bonus is: " + playerStats.getSmrt());



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
        System.out.println("Restalt: We need you to help, only the innate magic essence of a summoned being can help us.");
        System.out.println("Restalt: Will you help us?");
        System.out.println("Enter yes or no: ");
        String helpChoice = "";
        helpChoice = scan.next();
        if(helpChoice.equalsIgnoreCase("yes"))
            System.out.println("Restalt:Oh thank you!");
        if(helpChoice.equalsIgnoreCase("no")){
            System.out.println("Restalt: Ah, I see, I suppose I'll have to find someone else...");
            System.exit(0);
        }else{
            System.out.println("Restalt: I'll just take that as a yes...");
        }

        System.out.println("\n");

        System.out.println("Restalt: Okay, I am going to send you to their waypoint temple, its how they are bringing their troops to this realm.");
        System.out.println("Restalt: Good luck, I'll be in contact once you arrive!");
        System.out.println("Your vision becomes bright, before a large stone structure appears in your vision.");
        System.out.println("Restalt: Glad to see that you made it!");
        System.out.println("Restalt: Listen I can't talk long, not after I was weakened by... uh... never mind that.");
        System.out.println("Restalt: You'll need to get to the center of the summoning grounds and destroy their transport nexus, good luck.");
        System.out.println("You walk to the base of the spire, you see three guards, they look humanoid but with tails and horns.");
        System.out.println("You see three potential methods to get pass.");
        System.out.println("Method 1: You see someone you believe to be a mercenary be allow in, you could convince them you're one too. (1 in 8 + CHR)");
        System.out.println("Method 2: You wagons going in to bring supplies, you can try to sneak inside one. (1 in 8 + AGI)");
        System.out.println("Method 3: Hit and run, the guards don't look tough, you can take them. (1 in 8 + STR)");


    }
}
