import java.util.Scanner;

public class LotteryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		LotteryCalculation lottery = new LotteryCalculation();
		
		System.out.print("Enter which lottery game you are playing 1=PowerBall, 2=Mega Millions, 3=SuperLotto: ");
		
		int lotteryGameType = input.nextInt();
		
		while(lotteryGameType < 1 || lotteryGameType > 3) {
			System.out.print("Error: Value is out of bounds. Enter a new value: ");
			lotteryGameType = input.nextInt(); 
		} 
		
		System.out.print("Enter the number of plays desired from 1 to 100: ");
		int rows = input.nextInt();
		while(rows < 1 || rows > 100) {
			System.out.print("Error: Value is out of bounds. Enter a new value: ");
			lotteryGameType = input.nextInt(); 
		}
		
		lottery.setGameType(lotteryGameType);
		lottery.setRows(rows);
		lottery.setGamePlay(lotteryGameType);
		lottery.printGameName(lotteryGameType);
		lottery.numbers();
		
		input.close();
	}

}
