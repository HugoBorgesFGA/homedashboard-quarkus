package tech.hugobp.resources.dashboards;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DashboardsRepository implements PanacheMongoRepository<Dashboard> {
}
