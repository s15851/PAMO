package com.s15851.bmi_calc;

public class CoronavirusData {
    String region;
    int infected;

    public CoronavirusData(String region, int infected) {
        this.region = region;
        this.infected = infected;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getInfected() {
        return infected;
    }

    public void setInfected(int infected) {
        this.infected = infected;
    }
}
