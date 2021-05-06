package gameProject.abstracts;

import gameProject.entities.Gamer;

public interface GameCampaignService {
	void Add(Gamer gamer);
    void Update(Gamer gamer);
    void Delete(Gamer gamer);
}
