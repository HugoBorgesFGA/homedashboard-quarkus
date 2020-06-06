package tech.hugobp.resources.cards;

import org.bson.types.ObjectId;
import tech.hugobp.Routes;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path(Routes.Resources.Cards.BASEPATH)
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CardController {

    @Inject
    CardsRepository cardsRepository;

    @GET
    public List<Card> getAll() {
        return cardsRepository.listAll();
    }

    @GET
    @Path(Routes.Resources.RELATIVE_BY_ID)
    public Card getById(
            @PathParam(Routes.Resources.PARAM_ID) ObjectId id
    ) {
        return cardsRepository.findById(id);
    }

    @POST
    public void insert(Card card) {
        cardsRepository.persist(card);
    }

    @DELETE
    @Path(Routes.Resources.RELATIVE_BY_ID)
    public void deleteById(
            @PathParam(Routes.Resources.PARAM_ID) ObjectId id
    ) {
        cardsRepository.deleteById(id);
    }

    @PUT
    public void update(Card card) {
        cardsRepository.update(card);
    }
}
