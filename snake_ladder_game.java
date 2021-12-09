public class snake_ladder_game{
	static int noPlay=0, ladder=1, snake = 2;
	public static void main(String[] args){
		int choice = random_num(3,0);
		int dice = random_num(6,1);

		if ( choice == ladder ){
			System.out.println("The play is ladder, hence the player has moved forward by " + dice + " points");
		}	else if ( choice == snake ){
			System.out.println("The play is snake, hence the player has moved back by " + dice + " points");
		}  else {
			System.out.println("The play is no play, hence the player has not moved " );
		}
	}

	public static int random_num(int x, int y){
		return (int)((Math.random() * 10 % x) +y);
	}
}
