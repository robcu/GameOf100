import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    private ArrayList<Card> deck;

//   public ArrayList<Card> generateDeck() {
//        while (deck.size() < 53) {
//            for (int i = 0; i < 4; i++)
//                for (int k = 0; k < 13; k++) {
//
//                    }
//                }
//        }
//        return deck;
//   }

    public ArrayList<Card> shuffle() {               //should this take ArrayList<Card> as param?
        long seed = System.nanoTime();
        Collections.shuffle(deck, new Random(seed));
        return deck;
    }

    public Card dealOne() {
        Card card = deck.get(0);
        //deck.subList(0, passedInteger)
        deck.remove(0);
        return card;              //will return null card if deck is empty
    }

    public static void main(String[] args) {

    }
}
