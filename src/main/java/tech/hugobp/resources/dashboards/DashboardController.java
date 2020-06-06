package tech.hugobp.resources.dashboards;

import org.bson.types.ObjectId;
import tech.hugobp.Routes;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path(Routes.Resources.Dashboards.BASEPATH)
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DashboardController {
    
    @Inject
    DashboardsRepository dashboardsRepository;

    @GET
    public List<Dashboard> getAll() {
        return dashboardsRepository.listAll();
    }

    @GET
    @Path(Routes.Resources.RELATIVE_BY_ID)
    public Dashboard getById(
            @PathParam(Routes.Resources.PARAM_ID) ObjectId id
    ) {
        return dashboardsRepository.findById(id);
    }

    @POST
    public void insert(Dashboard dashboard) {
        dashboardsRepository.persist(dashboard);
    }

    @DELETE
    @Path(Routes.Resources.RELATIVE_BY_ID)
    public void deleteById(
            @PathParam(Routes.Resources.PARAM_ID) ObjectId id
    ) {
        dashboardsRepository.deleteById(id);
    }

    @PUT
    public void update(Dashboard dashboard) {
        dashboardsRepository.update(dashboard);
    }
}
