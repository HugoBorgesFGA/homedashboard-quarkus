package tech.hugobp.resources.cards;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CardsRepository implements PanacheMongoRepository<Card> {
}
