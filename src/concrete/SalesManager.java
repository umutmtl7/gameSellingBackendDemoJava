package concrete;

import java.util.List;

import abstracts.SalesService;
import entities.Customer;
import entities.Game;
import entities.GameCampaign;
import entities.Sales;

public class SalesManager implements SalesService{

	boolean salesOnThere = false;
	List<Sales> sellings;
	
	public SalesManager(List<Sales> sellings)
	{
		this.sellings = sellings;
	}
	
	@Override
	public void add(Sales sales) {
		for (Sales salesInList : sellings) {
			if(salesInList.getId() == sales.getId() )
			{
				salesOnThere = true;
				System.out.println("Selling could not be added for this reason :"
							+ " There is a selling has the same id on the list.");
			}			
		}
		if(!salesOnThere)
		{
			sellings.add(sales);
			System.out.println("Selling added successfully");
		}
	}

	@Override
	public void update(int id, Customer customer, Game game) {
		for (Sales sales : sellings) {
			if(sales.getId() == id)
			{
				salesOnThere = true;
				sales.setCustomer(customer);
				sales.setGame(game);
				System.out.println("Selling updated. New selling contents : " 
						+ customer.getFirstName() + " " + customer.getLastName() + " " + game.getName());
			}
		}
		if(!salesOnThere)
		{
			System.out.println("There is no such selling on the list.");
		}
		
	}

	@Override
	public void delete(int id) {
		for (Sales sales : sellings) {
			if(sales.getId() == id)
			{
				salesOnThere = true;
				sellings.remove(sales);
				System.out.println("Selling deleted."); 
			}
		}
		if(!salesOnThere)
		{
			System.out.println("There is no such selling on the list.");
		}
		
	}

	@Override
	public void getAll() {
		for (Sales sales : sellings) {
				System.out.println(sales.getCustomer().getFirstName() + " " + sales.getCustomer().getLastName() 
						+ " " + sales.getGame().getName()
						+ " " + sales.getGame().getPrice());
		}		
	}
}


