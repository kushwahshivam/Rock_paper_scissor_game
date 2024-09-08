import java.util.Scanner;
import java.util.Random;

public class Rock_paper_scissor_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to Rock-Paper-Scissor");
        System.out.println("1 for Rock \n 2 for Paper \n 3 for Scissor");
        int UserInput = sc.nextInt();
        int ComputerInput = random.nextInt(3)+1;
        if (UserInput == ComputerInput){
            System.out.println("tie");
        }
        else if (ComputerInput == 1 && UserInput == 3 ||
                ComputerInput == 2 && UserInput == 1 ||
                ComputerInput == 3 && UserInput == 2)
        {
            System.out.println("Computer Wins");
        }
        else if (UserInput == 1 && ComputerInput == 3 ||
                UserInput == 2 && ComputerInput == 1 ||
                UserInput == 3 && ComputerInput == 2 )

        {
            System.out.println("human Wins");
        }

    }
}
