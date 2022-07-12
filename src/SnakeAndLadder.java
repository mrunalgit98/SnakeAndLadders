//Report the number of times the dice was played to win the game and also the position after every die role

import java.util.Scanner;

public class SnakeAndLadder{
	
	public static final int Winning_Position=100;
	
	public static void main(String[] args) {
		int startPosition = 0;
		int rollCounter = 0;
		System.out.println("Enter Name");
		Scanner sc = new Scanner(System.in);
		String Player_Name = sc.next();
		
		while (Winning_Position > startPosition) {
			int dieRoll = (int) (Math.floor(Math.random()*10)%6);
			rollCounter++;
			int toWin = Winning_Position -startPosition;
            int check=(int)(Math.floor(Math.random()*10)%3);
            
            if (toWin >= dieRoll) {
            	
            	switch (check) {
            	
            	case 0:
            		startPosition+=0;
            		break;
            		
            	case 1:
            		startPosition += dieRoll;
            		break;
            		
            		default:
            			startPosition -= dieRoll;
            			
            			if(startPosition <0) {
            				System.out.println("start again");
            				startPosition=0;
            			}
            		
            	}
            }
            System.out.println("Player Position " +startPosition);
	}
	 System.out.println("player " + Player_Name + " Winning Position " +startPosition );
	 System.out.println("dice rolled " +rollCounter);
}
}