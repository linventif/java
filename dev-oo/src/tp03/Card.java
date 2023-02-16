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

    public boolean compareColor(Card otherCard) {
        return this.color == otherCard.color;
    }

    public boolean compareRank(Card otherCard) {
        return this.rank == otherCard.rank;
    }

    public Card isBefore(Card otherCard) {
        if (this.rank.ordinal() < otherCard.rank.ordinal()) {
            return this;
        }
        return otherCard;
    }

    public boolean equals(Object otherCard) {
        if (otherCard instanceof Card) {
            Card other = (Card) otherCard;
            return compareColor(other) && compareRank(other);
        }
        return false;
    }

    public String toString() {
        return "Card [color=" + color + ", rank=" + rank + "]";
    }
}
