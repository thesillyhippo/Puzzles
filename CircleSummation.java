import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

public class CircleSummation
{
	

	public static void main(String[] args)
	{
		//Reads in number of test cases, N, M
		Scanner sc = new Scanner(System.in);
		int test_cases = sc.nextInt();
		int[] N = new int[test_cases];
		int[] M = new int[test_cases];
		
		//Creates an array of LinkedLists
		LinkedList<Integer>[] circle = (LinkedList<Integer>[]) new LinkedList[test_cases];
		
		//Reads in the Circle Data
		for (int i = 0; i < test_cases; i++)
		{
			
			N[i] = sc.nextInt();
			M[i] = sc.nextInt();
			circle[i] = new LinkedList<Integer>();
			for (int j = 0; j < N[i]; j++)
			{
				
				Integer input_integer = new Integer(sc.nextInt());
				circle[i].add(input_integer);
				
			}
			
			
			
			
			for (int ith = 0; ith < N[i]; ith++)
			{
				//Copies current linkedlist
				LinkedList<Integer> copy = new LinkedList<Integer>();
				for (int a = 0; a < circle[i].size(); a++)
				{
					copy.add(circle[i].get(a));
				}
				
				
				int jth = ith;
				int rounds = M[i];
				
				//Begins the Circular Summation process for M rounds
				while(rounds > 0)
				{
					if (jth == copy.size()) 
					{
						jth = 0;
					}
					Integer current_sum = new Integer(0);
			
						if (jth == 0)
						{
							current_sum = copy.get(0) + copy.get(1)
							+ copy.getLast();
						}
						else if (jth == N[i] - 1)
						{
							current_sum = copy.get(N[i] - 2) + copy.get(jth)
							+ copy.getFirst();
						}
						else
						{
							current_sum = copy.get(jth - 1) + copy.get(jth)
							+ copy.get(jth + 1);
							
						}
						copy.set(jth, current_sum);
				
					jth++;
					rounds--;
				}
				
				//Prints out the current, summed linkedlist	
				for(int j = 0; j < N[i]; j++)
				{
					System.out.print(copy.get(j) + " ");
				}
				System.out.println();	
				
			}	
				
		}
	}
}