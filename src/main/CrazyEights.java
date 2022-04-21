package cardgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrazyEights {

	public static void main(String[] args) {
		GameEngine engine=new GameEngine();
		List<String> playerNames=new ArrayList<>();
		Scanner inp=new Scanner(System.in);
		for(int i=1;i<=4;i++) {
			System.out.print("Enter the player"+i+"name:");
			String name=inp.nextLine();
			playerNames.add(name);
		}
		engine.init(playerNames);
		

	
	}

}
