//Trump is a suit containing the following cards: Ace, King, "Opposite King" (same color King of another suit), Queen, Jack, Opposite Jack, 10, 9, Opposite Nine, 8, 7, 6, 5, Opposite Five, 4, 3, 2, Joker (only one joker card).
//
//        Cards have point values:
//        Ace = 1 point
//        King and Opposite King = 25
//        Queen = 0
//        Jack's = 1 point each
//        10 = 1
//        9's = 9 each
//        5's = 5 each
//        2 = 1
//        Joker = 17 points
//        All other cards have zero points

public class Card {
    private String name;
    private int suit;
    private int rank;
    private Integer pointValue;
    private Float rankValue;

    public Card(int suit, int rank) {
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

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Integer getPointValue() {
        return pointValue;
    }

    public void setPointValue(Integer pointValue) {
        this.pointValue = pointValue;
    }

    public Float getRankValue() {
        return rankValue;
    }

    public void setRankValue(Float rankValue) {
        this.rankValue = rankValue;
    }
}