import java.util.ArrayList;

import adapters.MernisServiceAdapter;
import concrete.CustomerManager;
import concrete.GameCampaignManager;
import concrete.GameManager;
import concrete.SalesManager;
import entities.Customer;
import entities.Game;
import entities.GameCampaign;
import entities.Sales;

public class Main {

	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		ArrayList<Game> games = new ArrayList<Game>();
		ArrayList<GameCampaign> gameCampaigns = new ArrayList<GameCampaign>();
		ArrayList<Sales> sellings = new ArrayList<Sales>();
		
		
		Customer customer = new Customer(1,"33344208412","Umut","Mutlu",1996);
		Customer customer2 = new Customer(2,"15468975152","Ahmet","Yýldýrým",1856);
		GameCampaign christmasCampaign = new GameCampaign(1, "Christmas Discount", 45);
		Game heartsofIronFour = new Game(1,"Hearts of Iron 4",40.50);
		Game ageOfEmpiresTwoDefinitive = new Game(2,"Age of Empires 2 Definitive Edition",88,christmasCampaign);
		Sales sales = new Sales(1,customer,heartsofIronFour);
		Sales sales2 = new Sales(2,customer,ageOfEmpiresTwoDefinitive);
		Sales sales3 = new Sales(3,customer2,heartsofIronFour);
		
		CustomerManager customerManager = new CustomerManager(customers,new MernisServiceAdapter());
		GameCampaignManager campaignManager =  new GameCampaignManager(gameCampaigns);
		GameManager gameManager = new GameManager(games);
		SalesManager salesManager = new SalesManager(sellings);
		
		
		customerManager.add(customer);
		customerManager.add(customer2);
		campaignManager.add(christmasCampaign);
		gameManager.add(heartsofIronFour);
		gameManager.add(ageOfEmpiresTwoDefinitive);
		customerManager.getAll();
		salesManager.add(sales);
		salesManager.add(sales2);
		salesManager.add(sales3);
		salesManager.getAll();
		gameManager.getAll();
		
		
		

	}

}
