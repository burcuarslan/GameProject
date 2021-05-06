package gameProject.concretes;

import gameProject.abstracts.GameCampaignService;
import gameProject.entities.Gamer;

public class GameCampaignManager implements GameCampaignService{

	@Override
	public void Add(Gamer gamer) {
		System.out.println(gamer.getId()+" id'li kiþiye kampanya verildi");
		
	}

	@Override
	public void Update(Gamer gamer) {
		System.out.println(gamer.getId()+" id'li kiþinin kampanyasý güncellendi");
		
	}

	@Override
	public void Delete(Gamer gamer) {
		System.out.println(gamer.getId()+" id'li kiþinin kampanyasý silindi");
		
	}

}
