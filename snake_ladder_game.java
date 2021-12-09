public class snake_ladder_game{
	public static void main(String[] args){
		System.out.println("The number on the dice is " + random_num());
	}

	public static int random_num(){
		return (int)((Math.random() * 10 % 6) +1);
	}
}
