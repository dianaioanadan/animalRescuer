package org.fasttrackit;

public class RecreationalActivity {
    String name;
    int durrationInMin;
    String place;

    public RecreationalActivity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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

    @Override
    public String toString() {
        return super.toString();
    }
}
