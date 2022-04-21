package cardgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import cardgame.GameEngine;
import cardgame.Card.Rank;
import cardgame.Card.Suit;

public class StrategyOne {
	public void play(Card topPileCard,LinkedHashMap<String, List<Card>> map,List<Card> cards) {
		int count=0;
		if(count<=1) {
		for (Map.Entry<String, List<Card>> e : map.entrySet()) {
          System.out.println(e.getKey()+e.getValue());
       
          for(int i=0;i<e.getValue().size();i++) {
        	  if(e.getValue().get(i).getSuit().equals(topPileCard.getSuit()) || e.getValue().get(i).getRank().equals(topPileCard.getRank())) {
        		  topPileCard=e.getValue().get(i);
        		  e.getValue().remove(e.getValue().get(i));
        		  System.out.println(e.getKey()+e.getValue());
        		  break;
        	  }
        	  else {
        		  if(e.getValue().get(i).getRank()==Rank.EIGHT) {
        			  topPileCard=e.getValue().get(i);
        			  e.getValue().remove(e.getValue().get(i));
        			  System.out.println(e.getKey()+e.getValue());
        			  List<Suit> max=new ArrayList<>();
        			  for(int j=0;j<e.getValue().size();j++) {
        				 max.add(e.getValue().get(i).getSuit());
        			  }
        			  int index=((int)(Math.random() * Suit.values().length));
        			  System.out.println(max.get(index));  
        			  break;
        		  }
        		  else {
        			  int cout=0;
        			  while(cout<3) {
        			  if(cards.get(cards.size()-1).getSuit().equals(topPileCard.getSuit())|| cards.get(cards.size()-1).getRank().equals(topPileCard.getRank())){
        				  topPileCard=cards.get(cards.size()-1);
        				  cards.remove(cards.size()-1); 
        				  
        				  break;
        			  }
        			  else {
        				  e.getValue().add(cards.get(cards.size()-1));
        				  System.out.println(e.getValue());
        				  
        				
        				  //break;
        				  }
        			  cout++;
        			  }
        			  break;
        			  }
        		  }
        	  }
          }
				
			
		}
		}

}
