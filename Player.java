
public class Player 
{
	private Hand theHand;
	
	public Player()
	{
		this.theHand = new Hand();
	}
	
	public void restart()
	{
		this.theHand.restart();
	}
	
	public void receiveCard(Card c)
	{
		this.theHand.addCard(c);
	}
	
	public int getValueOfHand()
	{
		return this.theHand.getValue();
	}
	
	public void showHand()
	{
		this.theHand.display();
		System.out.println("Current Value: " + this.theHand.getValue());
	}
}
