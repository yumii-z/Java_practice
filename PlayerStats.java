import java.util.Scanner;
public class PlayerStats {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);


    System.out.print("Enter your name: ");  
        String playerName = input.nextLine();
    System.out.println("Welcome " + playerName + " !!!");

    System.out.print("Enter your class: ");
        String playerClass = input.nextLine();
            if (playerClass.equals("Warrior")) {
    System.out.println("An amazing journey awaits you " + playerName + "!!!");
    System.out.println("You received 1x basic sword");

            }

           else if (playerClass.equals("Mage")) {
    System.out.println("A wise mage you are " + playerName);
    System.out.println("You received 1x basic staff");
            
            }

            else if (playerClass.equals("Archer")) {
                System.out.println("A swift and fast archer you are " + playerName);
                System.out.println("You received 1x basic bow");
                System.out.println("You received 20x basic arrow");
                
            }

            else {
                System.out.println("Unknown class!");

            }
        

    input.close();

    }
}
