package concrete;

import java.util.List;

import abstracts.GameCampaignService;
import entities.GameCampaign;

public class GameCampaignManager implements GameCampaignService {
	
	boolean gameCampaignOnThere = false;
	List<GameCampaign> gameCampaigns;
	
	public GameCampaignManager(List<GameCampaign> gameCampaigns)
	{
		this.gameCampaigns = gameCampaigns;
	}
	@Override
	public void add(GameCampaign gameCampaign) {
		for (GameCampaign gameCampaignInList : gameCampaigns) {
			if(gameCampaignInList.getId() == gameCampaign.getId())
			{
				gameCampaignOnThere = true;
				System.out.println("Game Campaign could not be added for this reason :"
							+ " There is a game campaign has the same id on the list.");
			}
		}
		if(!gameCampaignOnThere)
		{
			gameCampaigns.add(gameCampaign);
			System.out.println("Game campaign added successfully");
		}
		
	}

	@Override
	public void update(int id, int discount) {
		for (GameCampaign gameCampaign : gameCampaigns) {
			if(gameCampaign.getId() == id)
			{
				gameCampaignOnThere = true;
				gameCampaign.setDiscountPercent(discount);
				System.out.println("Game campaign updated. New game campaign discount percent is : %" 
				+ gameCampaign.getDiscountPercent());
			}
		}
		//means false
		if(!gameCampaignOnThere)
		{
			System.out.println("There is no such game on the list.");
		}
		
	}

	@Override
	public void delete(int id) {
		for (GameCampaign gameCampaign : gameCampaigns) {
			if(gameCampaign.getId() == id)
			{
				gameCampaignOnThere =true;
				gameCampaigns.remove(gameCampaign);
				System.out.println("Game campaign deleted : " + gameCampaign.getName());
			}
		}
		if(!gameCampaignOnThere)
		{
			System.out.println("There is no such game campaign on the list.");
		}
		
	}

	@Override
	public void getAll() {
		for (GameCampaign gameCampaign : gameCampaigns) {
			System.out.println(gameCampaign.getName() + " " + gameCampaign.getDiscountPercent());
		}
		
	}

}
