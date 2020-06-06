package tech.hugobp.resources.dashboards;

import org.bson.types.ObjectId;
import tech.hugobp.Routes;
import tech.hugobp.resources.rails.Rail;
import tech.hugobp.resources.rails.RailsRepository;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path(Routes.Resources.Rails.BASEPATH)
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RailController {

    @Inject
    RailsRepository railsRepository;

    @GET
    public List<Rail> getAll() {
        return railsRepository.listAll();
    }

    @GET
    @Path(Routes.Resources.RELATIVE_BY_ID)
    public Rail getById(
            @PathParam(Routes.Resources.PARAM_ID) ObjectId id
    ) {
        return railsRepository.findById(id);
    }

    @POST
    public void insert(Rail rail) {
        railsRepository.persist(rail);
    }

    @DELETE
    @Path(Routes.Resources.RELATIVE_BY_ID)
    public void deleteById(
            @PathParam(Routes.Resources.PARAM_ID) ObjectId id
    ) {
        railsRepository.deleteById(id);
    }

    @PUT
    public void update(Rail rail) {
        railsRepository.update(rail);
    }
}
