package cardgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import cardgame.Card.Suit;

public class GameEngine implements PlayerStrategy{
	public void init(List<String> player_names) {
		// TODO Auto-generated method stub
		List<Card> cardDeck = new ArrayList<>();
		cardDeck=Card.getDeck();
		for(int i=1,j=0;i<=player_names.size();i++,j++) {
			System.out.println("player"+i+player_names.get(j)+"Shuffle the card deck");
			Collections.shuffle(cardDeck);
			receiveInitialCards(cardDeck,player_names);
		}
	}

	@Override
	public void receiveInitialCards(List<Card> cards,List<String> player) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, List<Card>> map = new LinkedHashMap<>();
		for(int i=0;i<=player.size()-1;i++) {
			 List<Card> playerCard=new ArrayList<>();
			 for(int j=1;j<=player.size()*5;j=j+4) {
				 
				 playerCard.add(cards.get(cards.size()-j));
				 cards.remove(cards.size()-j);
				 System.out.println(cards.size());
				 map.put(player.get(i), playerCard);
				 
			 }System.out.println("-----");
		 }
//		for (Map.Entry<String, List<Card>> e : map.entrySet())
//            System.out.println("Key: " + e.getKey()
//                               + " Value: " + e.getValue());
//		System.out.println(cards.size());
		StrategyOne play=new StrategyOne();
		Card topPileCard=cards.get(cards.size()-1);
		cards.remove(cards.size()-1);
//		System.out.println(cards);
		play.play(topPileCard,map,cards);
		
		System.exit(0);
	
}

	@Override
	public boolean shouldDrawCard(Card topPileCard, Suit changedSuit) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void receiveCard(Card drawnCard) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Card playCard() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Suit declareSuit() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void processOpponentActions(List<PlayerTurn> opponentActions) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		System.out.println("its end");
	}

}
