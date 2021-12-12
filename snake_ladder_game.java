
public class snake_ladder_game {
    static int player1, player1DiceRolls, player2, player2DiceRolls, counter = 0;
    static String playerFirst = "playerOne", playerSecond = "playerTwo" ;

    public static void main(String[] args) {
        while ( player1 < 100 && player2 < 100 ){
            int playerSelection = rand_num(2,0);
            if ( counter == 0 ){
                counter = 1;
                int dice = rand_num(6,1);
                int choice = rand_num(3,0);
                if ( choice == 0 ){
                    System.out.println("player1 is playing and the play is no play");
                    player1DiceRolls++;
                    System.out.println("player1 points is " + player1);
                    System.out.println("player1 has thrown dice " + player1DiceRolls + " number of times");
                }else if ( choice == 1 ){
                    System.out.println("player1 is playing and the play is ladder play");
                    int lastDice = dice, lastChoice = 1;
                    while ( lastChoice == 1 ){
                        if ( (player1 + dice) > 100 ){
                            player1DiceRolls++;
                            lastDice = rand_num(6, 1);
                            lastChoice = rand_num(3, 1);
                        }else {
                            player1 += lastDice;
                            player1DiceRolls++;
                            lastDice = rand_num(6, 1);
                            lastChoice = rand_num(3, 1);
                        }
                    }
                    player1DiceRolls++;
                    System.out.println("player1 points is " + player1);
                    System.out.println("player1 has thrown dice " + player1DiceRolls + " number of times");
                }else{
                    System.out.println("player1 is playing and the play is snake play");
                    if ( (player1 - dice) < 0 ){
                        player1DiceRolls++;
                    }else{
                        player1 = (player1 - dice);
                        player1DiceRolls++;
                    }
                    System.out.println("player1 points is " + player1);
                    System.out.println("player1 has thrown dice " + player1DiceRolls + " number of times");
                }
            }else{
                counter = 0;
                int dice = rand_num(6,1);
                int choice = rand_num(3,0);
                if ( choice == 0 ){
                    System.out.println("player2 is playing and the play is no play");
                    player2DiceRolls++;
                    System.out.println("player2 points is " + player2);
                    System.out.println("player2 has thrown dice " + player2DiceRolls + " number of times");
                }else if ( choice == 1 ){
                    System.out.println("player2 is playing and the play is ladder play");
                    int lastDice = dice, lastChoice = 1;
                    while ( lastChoice == 1 ){
                        if ( (player2 + dice) > 100 ){
                            player2DiceRolls++;
                            lastDice = rand_num(6, 1);
                            lastChoice = rand_num(3, 1);
                        }else {
                            player2 += lastDice;
                            player2DiceRolls++;
                            lastDice = rand_num(6, 1);
                            lastChoice = rand_num(3, 1);
                        }
                    }
                    player2DiceRolls++;
                    System.out.println("player2 points is " + player2);
                    System.out.println("player2 has thrown dice " + player2DiceRolls + " number of times");
                }else{
                    System.out.println("player2 is playing and the play is snake play");
                    if ( (player2 - dice) < 0 ){
                        player2DiceRolls++;
                    }else{
                        player2 = (player2 - dice);
                        player2DiceRolls++;
                    }
                    System.out.println("player2 points is " + player2);
                    System.out.println("player2 has thrown dice " + player2DiceRolls + " number of times");
                }
            }

        }
        String winner = ( player1 > player2 ) ? ("player1") : ("player2");
        System.out.println(" The Winner is " + winner);
    }
    public static int rand_num(int numOfDigits, int zeroOrOne){
        return ((int)(Math.random()*10%numOfDigits)+zeroOrOne);
    }
}

