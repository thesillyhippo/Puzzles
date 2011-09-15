public class ListGame
{	

	public static void startGame(ST<Key, Value> list)
	{
		int points = 0;
		System.out.println("The rules of the game are simple.");
		System.out.println("Type as many of the pokemon names");
		System.out.println("as you can. Each time you get one");
		System.out.println("you receive a point. You don't lose");
		System.out.println("any points, but you need 150 to win");
		System.out.println("Type all pokemon with lowercase letters");
		System.out.println("Type 'stop' to exit and see how well you did");
		System.out.println("Begin!");
		
		String poke_guess = StdIn.readString();
		while(!poke_guess.equals("stop"))
		{
			
			if (list.contains(poke_guess))
			{
				if (list.get(poke_guess) = 1)
					System.out.println("You've already said " + poke_guess "!");
				else
				{
					list.put(pokemon_guess, 1);
					System.out.println("Great!");
				}
			}
			else System.out.println("That's not a pokemon!");
			String poke_guess = StdIn.readString();
		}
		
		
	}
	public static void main(String[] args)
	{
		In in_pokemon = new In("pokemon.txt");
		//In in_states = new In("states.txt");
		
		ST<String, Integer> pokemon_list = new ST<String, Integer>;
		while (!in_pokemon.isEmpty())
		{
		st.put(in_pokemon.readString(), 0);
		}
		
		System.out.println("Which game would you like to play?");
		System.out.println("Pokemon, US States, US President");
		String s = StdIn.readString();
		if (s.equals("Pokemon"))
		{
			startGame(pokemon_list);
			
		}
		
	}
}