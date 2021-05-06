package gameProject.concretes;

import gameProject.abstracts.GameCampaignService;
import gameProject.entities.Gamer;

public class GameCampaignManager implements GameCampaignService{

	@Override
	public void Add(Gamer gamer) {
		System.out.println(gamer.getId()+" id'li ki�iye kampanya verildi");
		
	}

	@Override
	public void Update(Gamer gamer) {
		System.out.println(gamer.getId()+" id'li ki�inin kampanyas� g�ncellendi");
		
	}

	@Override
	public void Delete(Gamer gamer) {
		System.out.println(gamer.getId()+" id'li ki�inin kampanyas� silindi");
		
	}

}
