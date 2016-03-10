
public class Card 
{
	private String suit;
	private String displayValue;
	
	public Card(String suit, String displayValue)
	{
		this.suit = suit;
		this.displayValue = displayValue;
	}

	public int[] getValue()
	{
		int[] answer = {-1,-1};
		if(this.displayValue.equals("J") ||
		   this.displayValue.equals("Q") ||
		   this.displayValue.equals("K"))
		{
			answer[0] = 10;
		}
		else if(this.displayValue.equals("A"))
		{
			answer[0] = 1;
			answer[1] = 11;
		}
		else
		{
			answer[0] = Integer.parseInt(this.displayValue);
		}
		return answer;
	}
	
	public void display()
	{
		System.out.println(this.displayValue + " of " + this.suit);
	}
	
	public String getSuit() {
		return suit;
	}

	public String getDisplayValue() {
		return displayValue;
	}
}
