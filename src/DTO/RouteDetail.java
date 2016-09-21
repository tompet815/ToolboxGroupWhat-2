package DTO;

import java.sql.Date;
import java.sql.Time;

public class RouteDetail extends RouteIdentifer {

    private String ferryName;
    private String startingIsland;
    private String destinationIsland;
    private Date date;
    private Time time;

    public RouteDetail(long id, String ferryName, String startingIsland, String destinationIsland, Date date, Time time) {
        super(id);
        this.ferryName = ferryName;
        this.startingIsland = startingIsland;
        this.destinationIsland = destinationIsland;
        this.date = date;
        this.time = time;
    }

    public String getFerryName() {
        return ferryName;
    }

    public void setFerryName(String ferryName) {
        this.ferryName = ferryName;
    }

    public String getStartingIsland() {
        return startingIsland;
    }

    public void setStartingIsland(String startingIsland) {
        this.startingIsland = startingIsland;
    }

    public String getDestinationIsland() {
        return destinationIsland;
    }

    public void setDestinationIsland(String destinationIsland) {
        this.destinationIsland = destinationIsland;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

}
