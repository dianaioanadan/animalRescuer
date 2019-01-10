package org.fasttrackit;

public class Animal {
    String name;
    int ageInMonths;
    int healthyLvl;
    int hungryLvl;
    int moodLvl;
    AnimalFood favoriteFoodName;
    RecreationalActivity favoriteRecreationalActivity;
    int friendlyLvl;
    boolean loveKids;

    public Animal(String name) {
        this.name = name;
    }

    public void moodSpirit(String name,String spirit){
        System.out.println(name + spirit);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgeInMonths() {
        return ageInMonths;
    }

    public void setAgeInMonths(int ageInMonths) {
        this.ageInMonths = ageInMonths;
    }

    public int getHealthyLvl() {
        return healthyLvl;
    }

    public void setHealthyLvl(int healthyLvl) {
        this.healthyLvl = healthyLvl;
    }

    public int getHungryLvl() {
        return hungryLvl;
    }

    public void setHungryLvl(int hungryLvl) {
        this.hungryLvl = hungryLvl;
    }

    public int getMoodLvl() {
        return moodLvl;
    }

    public void setMoodLvl(int moodLvl) {
        this.moodLvl = moodLvl;
    }

    public AnimalFood getFavoriteFoodName() {
        return favoriteFoodName;
    }

    public void setFavoriteFoodName(AnimalFood favoriteFoodName) {
        this.favoriteFoodName = favoriteFoodName;
    }

    public RecreationalActivity getFavoriteRecreationalActivity() {
        return favoriteRecreationalActivity;
    }

    public void setFavoriteRecreationalActivity(RecreationalActivity favoriteRecreationalActivity) {
        this.favoriteRecreationalActivity = favoriteRecreationalActivity;
    }

    public int getFriendlyLvl() {
        return friendlyLvl;
    }

    public void setFriendlyLvl(int friendlyLvl) {
        this.friendlyLvl = friendlyLvl;
    }

    public boolean isLoveKids() {
        return loveKids;
    }

    public void setLoveKids(boolean loveKids) {
        this.loveKids = loveKids;
    }

}
