package concrete;

import java.util.List;

import abstracts.GameService;
import entities.Game;

public class GameManager implements GameService{
	
	boolean gameOnThere = false;
	List<Game> games;
	
	public GameManager(List<Game> games)
	{
		this.games = games;
	}	
	@Override
	public void add(Game game) {
		for (Game gameInList : games) {
			if(gameInList.getId() == game.getId())
			{
				gameOnThere = true;
				System.out.println("Game could not be added for this reason :"
							+ " There is a game has the same id on the list.");
			}
		}
		if(!gameOnThere)
		{
			games.add(game);
			System.out.println("Game added successfully");
		}
	}

	@Override
	public void update(int id, double price) {
		for (Game game : games) {
			if(game.getId() == id)
			{
				gameOnThere = true;
				game.setPrice(price);
				System.out.println("Game updated. New game price : " 
				+ game.getPrice());
			}
		}
		//means false
		if(!gameOnThere)
		{
			System.out.println("There is no such game on the list.");
		}
		
	}

	@Override
	public void delete(int id) {
		for (Game game : games) {
			if(game.getId() == id)
			{
				gameOnThere = true;
				games.remove(game);
				System.out.println("Customer deleted : " + game.getName()); 
			}
		}
		if(!gameOnThere)
		{
			System.out.println("There is no such game on the list.");
		}
		
	}

	@Override
	public void getAll() {
		for (Game game : games) {
			System.out.println(game.getName() + " " + game.getPrice());
		}
		
	}

}
