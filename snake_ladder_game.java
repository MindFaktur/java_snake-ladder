public class snake_ladder_game{
	static int numDice, totalPoints, noPlay=0, ladder=1, snake = 2;

	public static void main(String[] args){

		while ( totalPoints < 100 ){
			int choice = random_num(3,0);
			int dice = random_num(6,1);

			if ( choice == ladder ){
				int c = ((totalPoints + dice) > 100) ? (totalPoints += 0): (totalPoints += dice);
				numDice ++;
				System.out.println("Total number of times dice rolled is " + numDice + " & Player position is " + totalPoints);
			}else if ( choice == snake ){
				int d = ((totalPoints - dice) <= 0) ? (totalPoints = 0): (totalPoints -= dice);
				numDice ++;
				System.out.println("Total number of times dice rolled is " + numDice + " & Player position is " + totalPoints);
			}else {
				totalPoints += 0;
				numDice ++;
				System.out.println("Total number of times dice rolled is " + numDice + " & Player position is " + totalPoints);
			}
		}
		System.out.println("Player has won by Total points of " + totalPoints);
	}

	public static int random_num(int x, int y){
		return (int)((Math.random() * 10 % x) +y);
	}
}
