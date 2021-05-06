package gameProject.concretes;

import gameProject.abstracts.BaseGamerManager;
import gameProject.abstracts.GamerCheckService;
import gameProject.entities.Gamer;

public class GamerManager extends BaseGamerManager {
	GamerCheckService _gamerCheckService;
	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		_gamerCheckService = gamerCheckService;
	}

	@Override
	public void Add(Gamer gamer) {
		if (_gamerCheckService.validate(gamer) == true)
        {
			super.Add(gamer);
        }
        else
        {
           System.out.println("Doðrulma baþarýsýz kayýt baþarýsýz");
        }
		
	}

	@Override
	public void Update(Gamer gamer) {
		super.Update(gamer);
		
	}

	@Override
	public void Delete(Gamer gamer) {
		super.Delete(gamer);
		
	}

}
