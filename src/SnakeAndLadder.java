//Player then checks for a Option. They are No Play, Ladder or Snake. - Use ((RANDOM)) to check for Options

import java.util.Scanner;

public class SnakeAndLadder{
    public static void main(String[] args) {
        int startPosition = 0;
        System.out.println("Enter your name-- ");
        Scanner sc = new Scanner(System.in);
        String Player_Name = sc.next();

        int dieRoll = (int) (Math.floor(Math.random() * 10) % 6);
        System.out.println("Dice Roll number --" + dieRoll);

        int check = (int) (Math.floor(Math.random() * 10) % 3);

        switch (check)

        {
            case 0:
                System.out.println("Snake");
                startPosition = dieRoll;
                break;

            case 1:
                System.out.println("Ladder");
                startPosition = dieRoll;
                break;

            default:
                System.out.println("NO PLAY");
                startPosition = 0;
        }
        System.out.println(" Player " + Player_Name + " On Position :" + startPosition);


    }
}