import java.util.Scanner;
public class PlayerStats {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);


    System.out.print("Enter your name: ");  
        String playerName = input.nextLine();
    System.out.println("Welcome " + playerName + " !!!");

    boolean characterCreated = false;

    int health = 0;
    int mana = 0;
    int attack = 0;
    int defense = 0;


    String weapon = "";


    System.out.print("Enter your class: ");
        String playerClass = input.nextLine();
            if (playerClass.equalsIgnoreCase("Warrior")) {
                characterCreated = true;
                health = 200;
                mana = 3;
                attack = 10;
                defense = 15;
                weapon = "Basic Sword";

    System.out.println("An amazing journey awaits you " + playerName);
            }

            else if (playerClass.equalsIgnoreCase("Mage")) {
                characterCreated = true;
                health = 100;
                mana = 20;
                attack = 6;
                defense = 5;
                weapon = "Basic Grimoire";

    System.out.println("A wise mage you are " + playerName);
            }

            else if (playerClass.equalsIgnoreCase("Archer")) {
                characterCreated = true;
                health = 100;
                mana = 5;
                attack = 10;
                defense = 12;
                weapon = "Basic Bow";

    System.out.println("Breeze through the wind " + playerName);
                
            }

            else {
                health = 0;
                mana = 0;
                attack = 0;
                defense = 0;
                weapon = "N/A";

            }


        if (characterCreated) {   
System.out.println("Succesfully Created a Character!");
    System.out.println("========== CHARACTER ==========");
    System.out.println("Name: " + playerName);
    System.out.println("Player Class: " + playerClass);
System.out.println();
    System.out.println("Health: " + health);
    System.out.println("Mana: " + mana);
    System.out.println("Attack: " + attack);
    System.out.println("Defense: " + defense);
    System.out.println("Weapon: " + weapon);
    System.out.println("===============================");
        }

        else {
            System.out.println();
    System.out.println("Character Failed!");
            System.out.println();
System.out.println("Please try again.");

        }
        

    input.close();

    }
}
