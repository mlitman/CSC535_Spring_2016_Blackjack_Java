import java.util.Random;


public class Deck 
{
	private Card[] theCards;
	private int top;
	public Deck()
	{
		this.top = 0;
		this.theCards = new Card[312];
		String[] vals = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		String[] suits = {"spades", "clubs", "diamonds", "hearts"};
		int pos = 0;
		for(int k = 0; k < 6; k++)
		{
			for(int i = 0; i < vals.length; i++)
			{
				for(int j = 0; j < suits.length; j++)
				{
					this.theCards[pos] = new Card(suits[j], vals[i]);
					pos++;
				}
			}
		}
		this.shuffle();
	}
	
	public Card getCard()
	{
		Card theTopCard = this.theCards[this.top];
		this.top++;
		return theTopCard;
	}
	
	public void shuffle()
	{
		this.top = 0;
		int pos1;
		int pos2;
		Card temp;
		Random r = new Random();
		for(int i = 0; i < 100000; i++)
		{
			pos1 = r.nextInt(this.theCards.length);
			pos2 = r.nextInt(this.theCards.length);
			temp = this.theCards[pos1];
			this.theCards[pos1] = this.theCards[pos2];
			this.theCards[pos2] = temp;
		}
	}
	
	public void display()
	{
		for(int i = 0; i < this.theCards.length; i++)
		{
			this.theCards[i].display();
		}
	}
}
