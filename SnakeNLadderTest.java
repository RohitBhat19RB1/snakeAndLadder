import java.util.Random;
public class SnakeNLadderTest 
{
	public static void main(String[] args) 
	{
				s.calculatePlayerValue(int player, int diceValue)
   		System.out.println("Game has started with single player at start position 0");
		SnakeNLadder s = new SnakeNLadder();
		int diceValue = s.rollDice();
		System.out.println("Player has rolled the dice and the value he got is " + diceValue );

	}
}
class SnakeNLadder
{


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

	}
}
