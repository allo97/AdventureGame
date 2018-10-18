package com.alek;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;  //and locations has a map with exits

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String, Integer>();
        this.exits.put("Q", 0);
    }

    public void addExit(String direction, int location) {  //and there we can add exits and we have to ensure direction and location in this case value and it will be relating to the locationID which is a key
        exits.put(direction, location);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() { // if the calling program wants to remove mappings from it and the exits mapping field won't be affected
        return new HashMap<String, Integer>(exits); // a new map is created that has all that mapings from the exits map
    }
}
