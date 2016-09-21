package DTO;

import java.io.Serializable;

public class RouteIdentifer implements Serializable {

    private long id;

    public RouteIdentifer(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
