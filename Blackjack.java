
public class Blackjack 
{
	private Dealer theDealer;
	private Player thePlayer;
	private int numGames;
	private int numBlackJacks;
	public Blackjack()
	{
		this.numGames = 0;
		this.numBlackJacks = 0;
		this.theDealer = new Dealer();
		this.thePlayer = new Player();
	}
	
	public void play()
	{

		this.numGames++;
		this.thePlayer.receiveCard(this.theDealer.deal());
		this.thePlayer.receiveCard(this.theDealer.deal());

		while(this.theDealer.hitOrStay(this.thePlayer))
		{
			this.thePlayer.receiveCard(this.theDealer.deal());
		}

		//the player has their final hand
		if(this.thePlayer.getValueOfHand() > 21)
		{
			System.out.println("Sorry, but you lose!");
		}
		else if(this.thePlayer.getValueOfHand() == 21)
		{
			System.out.println("BLACKJACK!!!!");
			this.numBlackJacks++;
		}
		else
		{
			System.out.println("Your final hand value was: " + this.thePlayer.getValueOfHand());
		}
		this.theDealer.restart();
		this.thePlayer.restart();
		this.play();
	}
}
