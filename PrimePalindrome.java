public class PrimePalindrome
{

	public static int highestPrimePalindrome(int a)
	{
		int highest = 2;
		for (int i = 2; i < a; i++)
		{
			boolean prime = true;
			boolean prime_palindrome = true;
			
			
			for (int j = 2; j < i / 2; j++) 	//finds next prime
			{
				if (i % j == 0)
				{
					prime = false;
				}
				
			}
			

			if (prime)							//if prime, determines if prime palindrome
			{
			
				int prime_number = i;
				String prime_string = prime_number + "";
				
				for (int j = 0; j < prime_string.length() / 2; j++)
				{
					if (prime_string.charAt(j) != prime_string.charAt(prime_string.length() - j - 1))
					{
						prime_palindrome = false;
					}
				}
				
				if (prime_palindrome)
				{
					highest = prime_number;
				}
			}
		}
		return highest;
	}
	
	public static void main(String[] args)
	{
	 	int N = Integer.parseInt(args[0]);
		int highest = highestPrimePalindrome(N);
		System.out.println("Highest Prime Palindrome: " + highest);
	}
}