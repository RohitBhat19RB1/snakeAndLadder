import java.util.Random;
 public class SnakeNLadderTest 
{
	public static void main(String[] args) 
	{
				s.calculatePlayerValue(int player, int diceValue)
   		System.out.println("Game has started with single player at start position 0");
		SnakeNLadder s = new SnakeNLadder();
		s.startGame();

	}
}
class SnakeNLadder
{
	final static int WINPOINT = 100;

	public void startGame() {
		int player1 = 0, count1 = 0;
		int diceValue = 0;
		Scanner s = new Scanner(System.in);
		while (player1 <= WINPOINT) {
			diceValue = rollDice();
				count1++;
				player1 = calculatePlayerValue(player1, diceValue);
				System.out.println("Player position 1: " + player1);
				if (player1 == 100) {
					System.out.println("Player1 Won");
					System.out.println("Die rolled " + count1 + " times to win");
					break;
				}
			}

		}

		int rollDice()
		{
                        int n = 0;
                        Random r = new Random();
                        n = r.nextInt(7);
                      return(n == 0 ? 1 : n);
                }

		 int calculatePlayerValue(int player, int diceValue)
         	{
	        	int x = 0;
		        Random r = new Random();
		        x = r.nextInt(3);
		switch (x)
		{
		case 0:
			System.out.println("No play");
			break;
		case 1:
			System.out.println("Ladder");
			player = player + diceValue;
			System.out.println(player);
			System.out.println("rolling dice again");
			player = player + diceValue;
			System.out.println(player);
			break;
		default:
			System.out.println("Snake");
			player = player - diceValue;
			break;
		}
		if (player < 0) {
			player = 0;
		}else if (player > 100) {
			player = player - diceValue;;
		}
		return player;
	}
}
