package com.parser.program.pasha.model;

public class AutoModel {
    private String marka;
    private String date_vipuska;
    private double coast;

    AutoModel ()
    {

    }

    public double getCoast() {
        return coast;
    }

    public String getDate_vipuska() {
        return date_vipuska;
    }

    public String getMarka() {
        return marka;
    }

    public void setCoast(double coast) {
        this.coast = coast;
    }

    public void setDate_vipuska(String date_vipuska) {
        this.date_vipuska = date_vipuska;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
}
