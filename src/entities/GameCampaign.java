package entities;

import abstracts.Entity;

public class GameCampaign implements Entity {
	private int id;
	private String name;
	private int discountPercent;
	
	public GameCampaign()
	{
		
	}
	public GameCampaign(int id, String name, int discountPercent) {
		this.id = id;
		this.name = name;
		if(discountPercent > 0){
			this.discountPercent = discountPercent;
		}
		else {
			throw new IllegalArgumentException("Discount percent cannot be lower than 0");
		}
	}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getDiscountPercent() {
	return discountPercent;
}
public void setDiscountPercent(int discountPercent) {
	if(discountPercent > 0) {
		this.discountPercent = discountPercent;
	}
}
public int getId() {
	return id;
}
}
