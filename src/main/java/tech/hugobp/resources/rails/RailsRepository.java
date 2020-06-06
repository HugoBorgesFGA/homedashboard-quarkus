package tech.hugobp.resources.rails;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RailsRepository implements PanacheMongoRepository<Rail> {
}
