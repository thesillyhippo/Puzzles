import java.util.Scanner;

public class Quadrant
{
	public final static int x = 0;
	public final static int y = 1;
	
	public static void count(int[][] points, int a, int b)
	{
		int q1, q2, q3, q4;
		q1 = 0;
		q2 = 0;
		q3 = 0;
		q4 = 0;
		
		for (int i = a - 1; i < b; i++)
		{
		
			if (points[i][x] > 0)
			{
				if (points[i][y] > 0) {	q1++; }
				
				else {q4++;}	
			}
			else
			{
				if (points[i][y] > 0) {q2++;}
				
				else {q3++;}
			}
		}
		
		System.out.println(q1 + " " + q2 + " " + q3 + " " + q4);
	}
	
	public static void reflectX(int[][] points, int a, int b)
	{
		for (int i = a - 1; i < b; i++)
		{
			points[i][y] = -points[i][y];
		}
		
	}
	
	public static void reflectY(int[][] points, int a, int b)
	{
		for (int i = a - 1; i < b; i++)
		{
			points[i][x] = -points[i][x];
		}
		
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] point= new int[N][2];
		
		//Read in points
		for (int i = 0; i < N; i++)
		{
			point[i][x] = sc.nextInt();
			point[i][y] = sc.nextInt();
		}
		
		int Q = sc.nextInt();
		
		String[] query_type = new String[Q];
		int[][] query = new int[Q][2];
		
		//Read in queries
		for (int i = 0; i < Q; i++)
		{
			query_type[i] = sc.next();
			query[i][x] = sc.nextInt();
			query[i][y] = sc.nextInt();
		}
		
		for (int i = 0; i < Q; i++)
		{
			if (query_type[i].equals("C"))
			{
				count(point, query[i][x], query[i][y]);
			}
			else if (query_type[i].equals("X"))
			{
				reflectX(point, query[i][x], query[i][y]);
			}
			else
			{
				reflectY(point, query[i][x], query[i][y]);
			}
		}
		
		
	}
}