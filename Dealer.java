import java.util.Scanner;


public class Dealer 
{
	private Deck theDeck;
	private Scanner input;
	
	public Dealer()
	{
		this.theDeck = new Deck();
		this.input = new Scanner(System.in);
	}
	
	public void restart()
	{
		this.theDeck.shuffle();
	}
	
	public Card deal()
	{
		return this.theDeck.getCard();
	}
	
	public boolean hitOrStay(Player p)
	{
		p.showHand();
		if(p.getValueOfHand() >= 21)
		{
			return false;
		}
		System.out.print("Do you want another card (y/n)? ");
		String answer = this.input.nextLine();
		return answer.equals("y");
	}
}
