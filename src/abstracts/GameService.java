package abstracts;

import entities.Game;

public interface GameService {
	void add(Game game);
	void update(int id, double price);
	void delete(int id);
	void getAll();
}
