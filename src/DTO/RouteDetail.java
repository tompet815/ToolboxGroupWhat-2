package DTO;

import java.sql.Time;

public class RouteDetail {
    private String ferryName;
    private String startingIsland;
    private String destinationIsland;
    private Time time;

    public RouteDetail(String ferryName, String startingIsland, String destinationIsland, Time time) {
        this.ferryName = ferryName;
        this.startingIsland = startingIsland;
        this.destinationIsland = destinationIsland;
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

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
    
    
}
