package abstracts;

import entities.GameCampaign;

public interface GameCampaignService {
	void add(GameCampaign gameCampaign);
	void update(int id, int discount);
	void delete(int id);
	void getAll();
}
