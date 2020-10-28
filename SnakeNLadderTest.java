import java.util.Random;

public class SnakeNLadderTest {

	public static void main(String[] args) {
		System.out.println("Welcome To SnakeAndLadder Game");
		SnakeNLadder s = new SnakeNLadder();
		s.startGame();

	}

}

class SnakeNLadder {

	final static int WINPOINT = 100;

	public void startGame() {
		int player1 = 0, count1 = 0, player2 = 0, count2 = 0;
		int currentPlayer = -1;
		int diceValue = 0;
		while (player1 <= WINPOINT && player2 <= WINPOINT) {
			diceValue = rollDice();
			if (currentPlayer == -1) {
				count1++;
				player1 = calculatePlayerValue(player1, diceValue);
				System.out.println("Player position 1: " + player1);
				System.out.println("Player position 2: " + player2);
				if (player1 == 100) {
					System.out.println("Player1 Won");
					System.out.println("Die rolled " + count1 + " times to win");
					break;
				}
			} else {
				count2++;
				player2 = calculatePlayerValue(player2, diceValue);
				System.out.println("Player position 1: " + player1);
				System.out.println("Player position 2: " + player2);
				if (player2 == 100) {
					System.out.println("Player2 Won");
					System.out.println("Die rolled " + count2 + " times to win");
					break;
				}
			}
			currentPlayer = -currentPlayer;
		}

	}

	public int rollDice() {
		int n = 0;
		Random r = new Random();
		n = r.nextInt(7);
		return (n == 0 ? 1 : n);
	}

	public int calculatePlayerValue(int player, int diceValue) {
		int x = 0;
		Random r = new Random();
		x = r.nextInt(3);
		switch (x) {
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
		} else if (player > 100) {
			player = player - diceValue;
			;
		}
		return player;
	}

}

