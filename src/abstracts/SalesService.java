package abstracts;

import entities.Customer;
import entities.Game;
import entities.GameCampaign;
import entities.Sales;

public interface SalesService {
	void add(Sales sales);
	void update(int id,Customer customer,Game game);
	void delete(int id);
	void getAll();
}
