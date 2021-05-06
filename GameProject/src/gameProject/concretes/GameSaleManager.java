package gameProject.concretes;

import gameProject.abstracts.GameSaleService;
import gameProject.entities.Gamer;

public class GameSaleManager implements GameSaleService {

	@Override
	public void gameSale(Gamer gamer) {
		System.out.println(gamer.getId()+" id'li kiþi oyunu satýn aldý");
		
	}

	@Override
	public void gameRefund(Gamer gamer) {
		System.out.println(gamer.getId()+" id'li kiþi oyununu iade etti");
		
	}
	
}
