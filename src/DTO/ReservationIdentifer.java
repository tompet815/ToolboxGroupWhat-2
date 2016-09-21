package DTO;

import java.io.Serializable;

public class ReservationIdentifer implements Serializable {

    private long id;

    public ReservationIdentifer(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

}
