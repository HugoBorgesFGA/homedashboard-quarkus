package tech.hugobp.resources.dashboards;

import org.bson.types.ObjectId;
import tech.hugobp.resources.rails.Rail;

import java.util.List;

public class Dashboard {

    private ObjectId id;
    private String title;
    private List<Rail> rails;

    public Dashboard() {
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

    public List<Rail> getRails() {
        return rails;
    }

    public void setRails(List<Rail> rails) {
        this.rails = rails;
    }
}
