package gameProject.abstracts;

import gameProject.entities.Gamer;

public abstract class BaseGamerManager implements GamerService {

	@Override
	public void Add(Gamer gamer) {
		System.out.println("Saved to db : " + gamer.getFirstName());
		
	}

	@Override
	public void Update(Gamer gamer) {
		System.out.println("Kayýt Güncellendi : "+gamer.getFirstName());
		
	}

	@Override
	public void Delete(Gamer gamer) {
		System.out.println("Kayýt Silindi : "+gamer.getFirstName());
		
	}

}
