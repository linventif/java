package tp03;

public class TestCard {
    public static void main(String[] args) {
        // test all methods of Card
        Card card1 = new Card(Color.CLUB, Rank.SEVEN);
        Card card2 = new Card(Color.DIAMOND, Rank.EIGHT);
        Card card3 = new Card(Color.HEART, Rank.NINE);
        Card card4 = new Card(Color.SPADE, Rank.TEN);
        Card card5 = new Card(Color.CLUB, Rank.JACK);
        Card card6 = new Card(Color.DIAMOND, Rank.QUEEN);
        Card card7 = new Card(Color.HEART, Rank.KING);
        Card card8 = new Card(Color.SPADE, Rank.ACE);
        Card card9 = new Card(Color.SPADE, Rank.ACE);
        Card card10 = new Card(Color.SPADE, Rank.KING);

        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
        System.out.println(card4);
        System.out.println(card5);
        System.out.println(card6);
        System.out.println(card7);
        System.out.println(card8);
        System.out.println(card9);
        System.out.println(card10);

        System.out.println("Card 1 is before card 2: " + card1.isBefore(card2));
        System.out.println("Card 2 is before card 3: " + card2.isBefore(card3));
        System.out.println("Card 3 is before card 4: " + card3.isBefore(card4));
        System.out.println("Card 4 is before card 5: " + card4.isBefore(card5));
        System.out.println("Card 5 is before card 6: " + card5.isBefore(card6));
        System.out.println("Card 6 is before card 7: " + card6.isBefore(card7));
        System.out.println("Card 7 is before card 8: " + card7.isBefore(card8));
        System.out.println("Card 8 is before card 9: " + card8.isBefore(card9));
        System.out.println("Card 9 is before card 10: " + card9.isBefore(card10));
        System.out.println("Card 10 is before card 1: " + card10.isBefore(card1));
    }
}
