import java.util.ArrayList;

public class Player {

    Hand hand;

    String playerName;

    int bid;

    Player teammate;

    public Player() {
    }

    public Player(Hand hand, String playerName, int bid, Player teammate) {

        this.hand = hand;
        this.playerName = playerName;
        this.bid = bid;
        this.teammate = teammate;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public Player getTeammate() {
        return teammate;
    }

    public void setTeammate(Player teammate) {
        this.teammate = teammate;
    }

    public void addCatToHand(ArrayList<Card> cat) {
        ArrayList<Card> playersHand = Hand.playersHand;
        playersHand.addAll(cat);
    }

    public void passCards(ArrayList<Card> passedCards) {
        ArrayList<Card> playersHand = Hand.playersHand;
        playersHand.removeAll(passedCards);
    }

    public void takeCards(ArrayList<Card> passedCards) {
        ArrayList<Card> playersHand = Hand.playersHand;
        playersHand.addAll(passedCards);
    }
}