package DTO;
public class RouteSummary {
    private String startingIsland;
    private String destinationIsland;

    public RouteSummary(String startingIsland, String destinationIsland) {
        this.startingIsland = startingIsland;
        this.destinationIsland = destinationIsland;
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
    
    
}
