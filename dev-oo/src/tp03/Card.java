package tp03;

public class Card {
    private Color color;
    private Rank rank;

    public Color getColor() {
        return color;
    }

    public Rank getRank() {
        return rank;
    }

    public Card(Color color, Rank rank) {
        this.color = color;
        this.rank = rank;
    }

    public Card(String color, String rank) {
        this.color = Color.valueOf(color);
        this.rank = Rank.valueOf(rank);
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int compareColor(Card otherCard) {
        return this.color.ordinal() - otherCard.color.ordinal();
    }

    public int compareRank(Card otherCard) {
        return this.rank.ordinal() - otherCard.rank.ordinal();
    }

    public boolean isBefore(Card otherCard) {
        return this.rank.ordinal() < otherCard.rank.ordinal();
    }

    public boolean equals(Object otherCard) {
        if (otherCard instanceof Card) {
            Card other = (Card) otherCard;
            return this.color == other.color && this.rank == other.rank;
        }
        return false;
    }

    public String toString() {
        return "Card [color=" + color + ", rank=" + rank + "]";
    }
}
