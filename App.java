
public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Player player1 = new Player("Chris");
		Player player2 = new Player("Sara");
		deck.shuffle();
		
		for (int i = 0; i <= 26; i++) {
			player1.draw(deck);
		
			player2.draw(deck);
			
		}
		
		for (int i=0; i < 26; i++) {
			player1.flip();
		    player2.flip();
		  
		if(player1.flip() > player2.flip()) {
			
			
			player1.incrementScore();
		}
		else {
			player2.incrementScore();
		}
			
			
		
		}if (player1.score > player2.score) {
				System.out.println("Player 1 Wins");
			}
			else if (player2.score > player1.score) {
				System.out.println("Player 2 Wins");
			}else {
				System.out.println("Draw");
			
			
			
				

		
		
	}System.out.println("Player 1 score: " + player1.score);
	System.out.println("Player 2 score: " + player2.score);
}
	
}

