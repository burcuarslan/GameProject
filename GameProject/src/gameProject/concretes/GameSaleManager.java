package gameProject.concretes;

import gameProject.abstracts.GameSaleService;
import gameProject.entities.Gamer;

public class GameSaleManager implements GameSaleService {

	@Override
	public void gameSale(Gamer gamer) {
		System.out.println(gamer.getId()+" id'li ki�i oyunu sat�n ald�");
		
	}

	@Override
	public void gameRefund(Gamer gamer) {
		System.out.println(gamer.getId()+" id'li ki�i oyununu iade etti");
		
	}
	
}
