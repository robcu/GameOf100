
public class Card {
    private String name;
    private String suit;
    private String rank;

    public Card(String name, String suit, String rank) {
        this.name = name;
        this.suit = suit;
        this.rank = rank;
    }

    public Card() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}