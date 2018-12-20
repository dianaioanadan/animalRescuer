package org.fasttrackit;

public class RecreationalActivity {
    String name;
    int durrationInMin;
    String place;

    public RecreationalActivity(String name) {
        this.name = name;
    }

    public int getDurrationInMin() {
        return durrationInMin;
    }

    public void setDurrationInMin(int durrationInMin) {
        this.durrationInMin = durrationInMin;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
