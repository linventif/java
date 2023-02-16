package tp03;

public class TestCard {
    public static void main(String[] args) {
        Card[] tableCards = new Card[4];
        for (int i = 0; i < tableCards.length; i++) {
            tableCards[i] = new Card(Color.values()[i % 4], Rank.values()[i % 8]);
        }
        for (int i = 0; i < tableCards.length; i++) {
            System.out.println("Card : " + tableCards[i]);
            System.out.println("Color : " + tableCards[i].getColor());
            System.out.println("Rank : " + tableCards[i].getRank());
        }
    }
}
