package gameProject;

import gameProject.abstracts.BaseGamerManager;
import gameProject.adapters.MernisServiceAdapter;
import gameProject.concretes.GameCampaignManager;
import gameProject.concretes.GameSaleManager;
import gameProject.concretes.GamerManager;
import gameProject.entities.Gamer;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseGamerManager baseGamerManager=new GamerManager(new MernisServiceAdapter());
		Gamer gamer=new Gamer(1, "BURCU", "ARSLAN", 2001, "tc no");
    	baseGamerManager.Add(gamer); 
    	GameSaleManager gameSaleManager=new GameSaleManager();
    	gameSaleManager.gameSale(gamer);
    	//gameSaleManager.gameRefund(gamer);
    	GameCampaignManager gameCampaignManager=new GameCampaignManager();
    	gameCampaignManager.Add(gamer);
    	//gameCampaignManager.Delete(gamer);
    	//gameCampaignManager.Update(gamer);
	}

}
