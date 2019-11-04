package com.codeoftheweb.salvo.Model;

import java.util.ArrayList;
import java.util.List;

public class ShipPlayer {
    private String type;
    private List<String> locations = new ArrayList<>();

    public ShipPlayer(){}
    public ShipPlayer(String type, List<String> locations) {
        this.type = type;
        this.locations = locations;
    }

    //Getters
    public String getType(){return type;}

    public List<String> getLocations() {return locations;}
}
