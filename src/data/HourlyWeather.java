package data;

public class HourlyWeather {
    private long dt;
    private Main main;
    private Weather[] weather;
    private Clouds clouds;
    private Wind wind;
    private int visibility;
    private double pop;
    private Sys sys;
    private String dt_txt;

    public HourlyWeather() {
    }

    public long getDt() {
        return dt;
    }

    public Main getMain() {
        return main;
    }

    public Weather[] getWeather() {
        return weather;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public Wind getWind() {
        return wind;
    }

    public int getVisibility() {
        return visibility;
    }

    public double getPop() {
        return pop;
    }

    public Sys getSys() {
        return sys;
    }

    public String getDt_txt() {
        return dt_txt;
    }
}