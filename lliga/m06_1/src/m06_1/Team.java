package m06_1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Team implements Serializable{
	
	public Team() {
		super();
		
		players = new ArrayList<Player>();
	}


	private List<Player> players;
	
	
	public void AddPlayer(Player player) {
		players.add(player);
	}


	@Override
	public String toString() {

		String resposta = new String ("");
		
		for ( Player p: players) {
			
			resposta += p + "\n";
		}
		return resposta;
	}

}
