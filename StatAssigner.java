//-----------------------------------------------------------
//Simple stat assignment system for basic role-playing games
//Coded and Designed by: Gio Mendoza
//@GioM645 on GitHub
//@girastuff on TikTok
//-----------------------------------------------------------

import java.util.Scanner;
public class StatAssigner {
    int str=0, agi=0, chr=0, smrt=0;
    public StatAssigner(int maxStats){
        int maxStop = 0;
        System.out.println("You will assign stat point for 4 stats: Strength (str), Agility (agi), Charisma (chr), and Intelligence (smrt)");
        System.out.println("You have " + maxStats + " points to distribute, these will be used one stat at a time");
        Scanner scan = new Scanner(System.in);
        int set=-1;
        while(set < 0){
            System.out.println("Please choose the amount of points for strength: ");
            set=scan.nextInt();
            if(set <= maxStats)
                str = set;
            if(set > maxStats){
                System.out.println("Not enough points!");
                set = -1;
            }
        }

        maxStop=str+agi+smrt+chr;
        if(maxStop == maxStats){
            System.out.println("All stat points assigned!");
            return;
        }


        set = -1;
        while(set < 0){
            System.out.println("Please choose the amount of points for agility: ");
            set=scan.nextInt();
            if(set <= maxStats-maxStop)
                agi = set;
            if(set > maxStats-maxStop){
                System.out.println("Not enough points!");
                set = -1;
            }
        }

        maxStop=str+agi+smrt+chr;
        if(maxStop == maxStats){
            System.out.println("All stat points assigned!");
            return;
        }

        set = -1;
        while(set < 0){
            System.out.println("Please choose the amount of points for charisma: ");
            set=scan.nextInt();
            if(set <= maxStats-maxStop)
                chr = set;
            if(set > maxStats-maxStop){
                System.out.println("Not enough points!");
                set = -1;
            }
        }

        maxStop=str+agi+smrt+chr;
        if(maxStop == maxStats){
            System.out.println("All stat points assigned!");
            return;
        }

        set = -1;
        while(set < 0){
            System.out.println("Please choose the amount of points for intelligence: ");
            set=scan.nextInt();
            if(set <= maxStats-maxStop)
                smrt = set;
            if(set > maxStats-maxStop){
                System.out.println("Not enough points!");
                set = -1;
            }
        }

        System.out.println("Stat points assignment finished!");

    }

    public int getStr(){
        return str;
    }

    public int getChr(){
        return chr;
    }

    public int getAgi(){
        return agi;
    }

    public int getSmrt(){
        return smrt;
    }
}
