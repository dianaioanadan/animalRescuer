package org.fasttrackit;

public class Veterinarian {
    String name;
    String specialization;
    String telephoneNo;
    boolean canComeHome;

    public Veterinarian(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getTelephoneNo() {
        return telephoneNo;
    }

    public void setTelephoneNo(String telephoneNo) {
        this.telephoneNo = telephoneNo;
    }

    public boolean isCanComeHome() {
        return canComeHome;
    }

    public void setCanComeHome(boolean canComeHome) {
        this.canComeHome = canComeHome;
    }
}
