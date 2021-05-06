package gameProject.abstracts;

import gameProject.entities.Gamer;

public interface GameSaleService {
	void gameSale(Gamer gamer);
	void gameRefund(Gamer gamer);
}
