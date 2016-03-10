
public class Hand 
{
	private Card[] theCards;
	private int numCards;
	
	public Hand()
	{
		this.numCards = 0;
		this.theCards = new Card[9];
	}
	
	public void restart()
	{
		this.numCards = 0;
	}
	
	public void addCard(Card c)
	{
		this.theCards[this.numCards] = c;
		this.numCards++;
	}
	
	public int getValue()
	{
		int total = 0;
		int[] val;
		int numAces = 0;
		for(int i = 0; i < this.numCards; i++)
		{
			val = this.theCards[i].getValue();
			if(val[1] == -1)
			{
				total += val[0];
			}
			else
			{
				numAces++;
			}
		}
		for(int i = 0; i < numAces; i++)
		{
			if(total + 11 > 21)
			{
				total += 1;
			}
			else
			{
				total += 11;
			}
		}
		return total;
	}
	
	public void display()
	{
		for(int i = 0; i < this.numCards; i++)
		{
			this.theCards[i].display();
		}
	}
}
