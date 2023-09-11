package data;

public class JsonResult {
    private String cod;
    private int message;
    private int cnt;
    private HourlyWeather[] list;
    private City city;

    public JsonResult() {
    }

    public String getCod() {
        return cod;
    }

    public int getMessage() {
        return message;
    }

    public int getCnt() {
        return cnt;
    }

    public HourlyWeather[] getList() {
        return list;
    }

    public City getCity() {
        return city;
    }
}