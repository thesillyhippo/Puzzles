import java.util.Scanner;

public class Solution
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] numbers = new int[N];
		int solution = 0;
		
		for (int i = 0; i < N; i++)
		{
			numbers[i] = sc.nextInt();
		}
		
		for (int i = 0; i < N; i++)
		{
			for (int j = i + 1; j < N; j++)
			{
				int difference = Math.abs(numbers[i] - numbers[j]);
				if (difference == K) solution++;
			}
		}
		
	System.out.println(solution);
	}
}