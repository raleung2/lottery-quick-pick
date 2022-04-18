import java.util.Random;
import java.util.HashSet;

public class LotteryCalculation {
	
	private int gameType;
	private int rows;
	private int upperBound;
	private int upperBoundBonus;
	private int min = 1;

	public int getGameType() {
		return gameType;
	}

	public void setGameType(int gameType) {
		this.gameType = gameType;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}
	
	public void setGamePlay (int gameType) {//need to call these methods
		switch (gameType) {//range of white balls per game
		case 1:
			upperBound = 69;
		case 2: 
			upperBound = 70;
		case 3: 
			upperBound = 47;
		}
		
		switch (gameType) {//range of bonus balls per game
		case 1: 
			upperBoundBonus = 26;
		case 2: 
			upperBoundBonus = 25;
		case 3: 
			upperBoundBonus = 27;
		}
	}
	
	public void printGameName (int gameType) {
		System.out.println(); 
		switch(gameType) {
		case 1: 
			System.out.println("Game: Powerball");
			break;
		case 2:
			System.out.println("Game: Mega Millions");
			break;
		case 3:
			System.out.println("Game: SuperLotto");
		}
	}
	
	public void numbers() {
		
		Random rand = new Random (); //Instance of the Random class
		HashSet <Integer> hash = new HashSet <Integer> (); //Hashset ds is made up of all unique values
		
		
		int max = upperBound;
		int maxBonus = upperBoundBonus;
		int x = 0;
		
		for (int i = 0; i < rows; i++) {
			++x;
			System.out.printf("%-15s", "Play " + x + ": ");
			
			while (hash.size() < 5) {
				hash.add(rand.nextInt(min, max + 1));
			}
			
			System.out.print(hash);
			hash.clear(); //Clears the hash ds to select new numbers for subsequent plays
			
			//Prints the bonus number
			System.out.printf("\t\t%s", "Bonus: ");
			System.out.print(rand.nextInt(min, maxBonus + 1));
			System.out.println(); //Starts new line to print next play
		}
	}
	
}
