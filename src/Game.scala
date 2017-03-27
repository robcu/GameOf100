import scala.collection.mutable

class Game {
    val player1 = new Player()
    val player2 = new Player
    val player3 = new Player
    val player4 = new Player

    val bids = mutable.HashMap("player1" -> 0,
                                "player2" -> 0,
                                "player3" -> 0,
                                "player4" -> 0)

    var cat: mutable.MutableList[Card] = new mutable.MutableList[Card]
    var currentBidder: Player = _
    var winningBidder: Player = _
    var winningBid: Int = _

    var leader: Player = _
    var trump: String = _
    var currentRound: Int = 1

    def deal(): Unit = {
        Deck.create()
        player1.takeCards(Deck.dealMany(12))
        player2.takeCards(Deck.dealMany(12))
        player3.takeCards(Deck.dealMany(12))
        player4.takeCards(Deck.dealMany(12))
        Deck.dealMany(5).forEach(card => cat += card)
    }
}
