import java.util.Random;
public class SnakeNLadderTest 
{
	public static void main(String[] args) 
	{
		System.out.println("   ***** Welcome To Snake And Ladder Game *****");
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

}
