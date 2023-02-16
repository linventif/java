package tp03;

public class Card {
    private Color color;
    private Rank rank;

    public Color getColor() {
        return color;
    }

    public Card(Color color, Rank rank) {
        this.color = color;
        this.rank = rank;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String toString() {
        return "Card [color=" + color + ", rank=" + rank + "]";
    }
}
