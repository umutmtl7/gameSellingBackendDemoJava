package entities;

import abstracts.Entity;

public class Game implements Entity {
	private int id;
	private String name;
	private double price;
	private GameCampaign campaign = new GameCampaign();
	public Game(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public Game(int id, String name,double price,GameCampaign campaign)
	{
		this.id = id;
		this.name = name;
		this.price = price;
		this.campaign = campaign;
	}
	public GameCampaign getCampaign() {
		return campaign;
	}
	public void setCampaign(GameCampaign campaign) {
		this.campaign = campaign;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice(){
		if(campaign.equals(null))
		{
			return price;
		}
		return price - ((price * campaign.getDiscountPercent())/100);

}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
}
