//The Player rolls the die to get a number between 1 to 6.

public class SnakeAndLadder{
	public static void main(String[] args) {
		int startposition=0;
		int dieRoll=(int)(Math.floor(Math.random() * 10)%6 + 1);
		System.out.println("start position--" +startposition);
		System.out.println("die rolled-- " +dieRoll);
				
	}
}
