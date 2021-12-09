public class snake_ladder_game{
	static int totalPoints, noPlay=0, ladder=1, snake = 2;

	public static void main(String[] args){

		while ( totalPoints <= 100 ){
			int choice = random_num(3,0);
			int dice = random_num(6,1);

			if ( choice == ladder ){
				totalPoints += dice;
			}else if ( choice == snake ){
				int c = ((totalPoints - dice) <= 0) ? (totalPoints = 0): (totalPoints -= dice);
			}else {
				totalPoints += 0;
			}
		}
		System.out.println("Player has won by Total points of " + totalPoints);
	}

	public static int random_num(int x, int y){
		return (int)((Math.random() * 10 % x) +y);
	}
}
