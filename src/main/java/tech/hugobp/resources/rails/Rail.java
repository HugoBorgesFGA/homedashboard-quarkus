package tech.hugobp.resources.rails;

import org.bson.types.ObjectId;
import tech.hugobp.resources.cards.Card;

import java.util.List;

public class Rail {

    private ObjectId id;
    private String title;
    private List<Card> cards;

    public Rail() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
