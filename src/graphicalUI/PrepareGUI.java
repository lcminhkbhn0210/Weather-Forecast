package graphicalUI;

import control.HandleAPI;
import data.JsonResult;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class PrepareGUI {

    private WeatherApp weather;
    private JsonResult result;
    private int idx = 0;
    private int idxHourly = 0;
    private boolean initializedTemp = false;

    public PrepareGUI() {
        weather = new WeatherApp();
        prepare();
    }

    public WeatherApp getWeather() {
        return weather;
    }

    private void prepare() {
        weather.getBtn_find().setActionCommand("find");
        weather.getBtn_find().addActionListener(new ButtonClick());

        weather.getBtn_next().setActionCommand("next");
        weather.getBtn_next().addActionListener(new ButtonClick());

        weather.getBtn_pre().setActionCommand("pre");
        weather.getBtn_pre().addActionListener(new ButtonClick());
        
        weather.getBtn_swapUnit().setActionCommand("swapUnit");
        weather.getBtn_swapUnit().addActionListener(new ButtonClick());
        
        weather.getBtn_prevHourly().setActionCommand("prevHourly");
        weather.getBtn_prevHourly().addActionListener(new ButtonClick());
        
        weather.getBtn_nextHourly().setActionCommand("nextHourly");
        weather.getBtn_nextHourly().addActionListener(new ButtonClick());
    }

    private void show() {

        String date = "Date " + result.getList()[idx].getDt_txt().substring(0, 10);
        String time = result.getList()[idx].getDt_txt().substring(10, 16);
        String feelsLike = "Feels like " + (int) result.getList()[idx].getMain().getFeels_like() + "°C";
        String visibility = "Visibility " + result.getList()[idx].getVisibility()+ " m";
        String nation = weather.getjTextField_Search().getText().substring(2) + ", ";
        if (result.getCity().getCountry().equals("VN"))
            nation += "VIET NAM";
        else if (result.getCity().getCountry().equals("JP"))
            nation += "JAPAN";
        else if (result.getCity().getCountry().equals("US"))
            nation += "AMERICA";
        else if (result.getCity().getCountry().equals("FR"))
            nation += "FRANCE";
        else
            nation += result.getCity().getCountry();
        String weath = result.getList()[idx].getWeather()[0].getDescription();
        weath = weath.substring(0, 1).toUpperCase() + weath.substring(1);
        String nhietDo = " " + (int)result.getList()[idx].getMain().getTemp() + "°";
        String apXuat = "Pressure " + result.getList()[idx].getMain().getPresure() + " mb";
        String doAm = "Humidity " + result.getList()[idx].getMain().getHumidity()+"%";
        String winSpeed = result.getList()[idx].getWind().getSpeed() + " mph";
        String clouds = "Clouds " + result.getList()[idx].getClouds().getAll() + "%";

        weather.getLb_visibility().setText(visibility);
        weather.getLb_time().setText(time);
        weather.getLb_apXuat().setText(apXuat);
        weather.getLb_cloud().setText(clouds);
        weather.getLb_date().setText(date);
        weather.getLb_doAm().setText(doAm);
        weather.getLb_nation().setText(nation);
        weather.getLb_weather().setText(weath);
        weather.getLb_weather().setFont(weather.getLb_weather().getFont().deriveFont(20.0f));
        weather.getLb_windSpeed().setText(winSpeed);
        
        

        // Day Details
        int doC = (int)result.getList()[idx].getMain().getTemp();
        if (doC > 20 && doC < 25)
            weather.getTextArea_details().setText("\n   Day: Expect partly sunny skies. The high will be 26°\n   Night: The skies will be mostly clear. The low will be 17° \n   Precipitation: In the past 3o years, it rained 15 out of 30 times on this day.\n   Sunrise: 6:14AM\n   Sunset: 5:13PM\n   Moonrise: 11:54 PM\n   Moonset: 12:17 PM\n   Moon Phase: Third Quarter\n   Precipitation: 80%\n   Humidity: 46%\n   UV Index: 6 High\n   Max Wind: 12 km/h");
  //them 6 dong duoi vao.
        if(doC>=11 && doC<=20)
            weather.getTextArea_details().setText("\n Day: Cloudy sky. The high will be 11°\n Night: So cold, suitable for sleeping. The low will be "+String.valueOf(doC-3)+"\n Precipitation:Rainless.\n Sunrise: 6:00 AM\n Sunset 5:30 PM\n Moonrise: 8:00 PM\n Moonset: 12:00 PM \n Precipitation: 10%\n   Humidity: 56%\n   UV Index: 2 High\n   Max Wind: 20 km/h");
        if(doC<11)
            weather.getTextArea_details().setText("\n Day: Cloudy sky. The high will be"+String.valueOf(doC+3)+"\n Night: So cold. The low will be "+String.valueOf(doC-3)+"\n Precipitation:Rainless.\n Sunrise: 6:00 AM\n Sunset 5:30 PM\n Moonrise: 8:00 PM\n Moonset: 12:00 PM \n Precipitation: 0%\n   Humidity: 56%\n   UV Index: 0 High\n   Max Wind: 30 km/h");
        if(doC>=25)
           weather.getTextArea_details().setText("\n   Day: Expect partly sunny skies. The high will be"+ String.valueOf(doC+3)+"\n   Night: The skies will be mostly clear. The low will be"+ String.valueOf(doC-3) +"\n   Precipitation: In the past 3o years, it rained 15 out of 30 times on this day.\n   Sunrise: 6:14AM\n   Sunset: 5:13PM\n   Moonrise: 11:54 PM\n   Moonset: 12:17 PM\n   Moon Phase: Third Quarter\n   Precipitation: 80%\n   Humidity: 46%\n   UV Index: 6 High\n   Max Wind: 12 km/h");
        
        // DAILY WEATHER
        String date1 = result.getList()[0].getDt_txt().substring(0, 10);
        String maxtemp1 = (int) (result.getList()[0].getMain().getTemp_max() + 3) + "°";
        String mintemp1 = (int) (result.getList()[0].getMain().getTemp_min() - 3) + "°";
        String discription1 = result.getList()[0].getWeather()[0].getDescription();
        
        String date2 = result.getList()[8].getDt_txt().substring(0, 10);
        String maxtemp2 = (int) (result.getList()[8].getMain().getTemp_max() + 3) + "°";
        String mintemp2 = (int) (result.getList()[8].getMain().getTemp_min() - 3) + "°";
        String discription2 = result.getList()[8].getWeather()[0].getDescription();
        
        String date3 = result.getList()[16].getDt_txt().substring(0, 10);
        String maxtemp3 = (int) (result.getList()[16].getMain().getTemp_max() + 3) + "°";
        String mintemp3 = (int) (result.getList()[16].getMain().getTemp_min() - 3) + "°";
        String discription3 = result.getList()[16].getWeather()[0].getDescription();
        
        String date4 = result.getList()[24].getDt_txt().substring(0, 10);
        String maxtemp4 = (int) (result.getList()[24].getMain().getTemp_max() + 3) + "°";
        String mintemp4 = (int) (result.getList()[24].getMain().getTemp_min() - 3) + "°";
        String discription4 = result.getList()[24].getWeather()[0].getDescription();
        
        String date5 = result.getList()[32].getDt_txt().substring(0, 10);
        String maxtemp5 = (int) (result.getList()[32].getMain().getTemp_max() + 3) + "°";
        String mintemp5 = (int) (result.getList()[32].getMain().getTemp_min() - 3) + "°";
        String discription5 = result.getList()[32].getWeather()[0].getDescription();
        
        
       ImageIcon icon = new ImageIcon(getClass().getResource("/image/sun (2).png"));
       ImageIcon icon1 = new ImageIcon(getClass().getResource("/image/cloud (1).png"));
       ImageIcon icon2 = new ImageIcon(getClass().getResource("/image/sun-day (1).png"));
       ImageIcon icon3 = new ImageIcon(getClass().getResource("/image/rain (1).png"));
       
        if(discription1.equals("few clouds")) weather.getlb_iconNextToTemp().setIcon(icon1); 
        else if(discription1.equals("scattered clouds")) weather.getlb_iconNextToTemp().setIcon(icon1);
        else if(discription1.equals("broken clouds")) weather.getlb_iconNextToTemp().setIcon(icon3);
        else if(discription1.equals("clear sky")) weather.getlb_iconNextToTemp().setIcon(icon);
        else weather.getlb_iconNextToTemp().setIcon(icon2);
       
        
        if(discription1.equals("few clouds")) weather.getLb_day11().setIcon(icon1);
        else if(discription1.equals("scattered clouds")) weather.getLb_day11().setIcon(icon1);
        else if(discription1.equals("broken clouds")) weather.getLb_day11().setIcon(icon3);
        else if(discription1.equals("clear sky")) weather.getLb_day11().setIcon(icon);
        else weather.getLb_day11().setIcon(icon2);
       
        weather.getLb_day11().setText(date1);
        weather.getLb_day14().setText(discription1.substring(0, 1).toUpperCase() + discription1.substring(1));
        
        
        if(discription2.equals("few clouds")) weather.getLb_day21().setIcon(icon1);
        else if(discription2.equals("scattered clouds")) weather.getLb_day21().setIcon(icon1);
        else if(discription2.equals("broken clouds")) weather.getLb_day21().setIcon(icon3);
        else if(discription2.equals("clear sky")) weather.getLb_day21().setIcon(icon);
        else weather.getLb_day21().setIcon(icon2);
        
        weather.getLb_day21().setText(date2);
        weather.getLb_day24().setText(discription2.substring(0, 1).toUpperCase() + discription2.substring(1));
        
        
        if(discription3.equals("few clouds")) weather.getLb_day31().setIcon(icon1);
        else if(discription3.equals("scattered clouds")) weather.getLb_day31().setIcon(icon1);
        else if(discription3.equals("broken clouds")) weather.getLb_day31().setIcon(icon3);
        else if(discription3.equals("clear sky")) weather.getLb_day31().setIcon(icon);
        else weather.getLb_day31().setIcon(icon2);
        
        weather.getLb_day31().setText(date3);
        weather.getLb_day34().setText(discription3.substring(0, 1).toUpperCase() + discription3.substring(1));
        
        
        if(discription4.equals("few clouds")) weather.getLb_day41().setIcon(icon1);
        else if(discription4.equals("scattered clouds")) weather.getLb_day41().setIcon(icon1);
        else if(discription4.equals("broken clouds")) weather.getLb_day41().setIcon(icon3);
        else if(discription4.equals("clear sky")) weather.getLb_day41().setIcon(icon);
        else weather.getLb_day41().setIcon(icon2);
        
        
        weather.getLb_day41().setText(date4);
        weather.getLb_day44().setText(discription4.substring(0, 1).toUpperCase() + discription4.substring(1));
        
        
        if(discription5.equals("few clouds")) weather.getLb_day51().setIcon(icon1);
        else if(discription5.equals("scattered clouds")) weather.getLb_day51().setIcon(icon1);
        else if(discription5.equals("broken clouds")) weather.getLb_day51().setIcon(icon3);
        else if(discription5.equals("clear sky")) weather.getLb_day51().setIcon(icon);
        else weather.getLb_day51().setIcon(icon2);
        
        weather.getLb_day51().setText(date5);
        weather.getLb_day54().setText(discription5.substring(0, 1).toUpperCase() + discription5.substring(1));
        
        // HOURLY WEATHER
        String temp_hour1 = "  " + (int) result.getList()[idxHourly + 1].getMain().getTemp() + "°";
        String description_hour1 = result.getList()[idxHourly + 1].getWeather()[0].getDescription();
        String wind_hour1 = (int) result.getList()[idxHourly + 1].getWind().getSpeed() + " mph";
        String time_hour1 = "";
        int hour1 = Integer.parseInt(result.getList()[idxHourly + 1].getDt_txt().substring(11, 13));
        if (hour1 >= 12) {
            hour1 = hour1 - 12;
            time_hour1 = hour1 + " pm";
        } else {
            time_hour1 = hour1 + " am";
        }
        
        String temp_hour2 = "  " + (int) result.getList()[idxHourly + 2].getMain().getTemp() + "°";
        String description_hour2 = result.getList()[idxHourly + 2].getWeather()[0].getDescription();
        String wind_hour2 = (int) result.getList()[idxHourly +21].getWind().getSpeed() + " mph";
        String time_hour2 = "";
        int hour2 = Integer.parseInt(result.getList()[idxHourly + 2].getDt_txt().substring(11, 13));
        if (hour2 >= 12) {
            hour2 = hour2 - 12;
            time_hour2 = hour2 + " pm";
        } else {
            time_hour2 = hour2 + " am";
        }
        
        String temp_hour3 = "  " + (int) result.getList()[idxHourly + 3].getMain().getTemp() + "°";
        String description_hour3 = result.getList()[idxHourly + 3].getWeather()[0].getDescription();
        String wind_hour3 = (int) result.getList()[idxHourly + 3].getWind().getSpeed() + " mph";
        String time_hour3 = "";
        int hour3 = Integer.parseInt(result.getList()[idxHourly + 3].getDt_txt().substring(11, 13));
        if (hour3 >= 12) {
            hour3 = hour3 - 12;
            time_hour3 = hour3 + " pm";
        } else {
            time_hour3 = hour3 + " am";
        }
        
        String temp_hour4 = "  " + (int) result.getList()[idxHourly + 4].getMain().getTemp() + "°";
        String description_hour4 = result.getList()[idxHourly + 4].getWeather()[0].getDescription();
        String wind_hour4 = (int) result.getList()[idxHourly + 4].getWind().getSpeed() + " mph";
        String time_hour4 = "";
        int hour4 = Integer.parseInt(result.getList()[idxHourly + 4].getDt_txt().substring(11, 13));
        if (hour4 >= 12) {
            hour4 = hour4 - 12;
            time_hour4 = hour4 + " pm";
        } else {
            time_hour4 = hour4 + " am";
        }
        
        String temp_hour5 = "  " + (int) result.getList()[idxHourly + 5].getMain().getTemp() + "°";
        String description_hour5 = result.getList()[idxHourly + 5].getWeather()[0].getDescription();
        String wind_hour5 = (int) result.getList()[idxHourly + 5].getWind().getSpeed() + " mph";
        String time_hour5 = "";
        int hour5 = Integer.parseInt(result.getList()[idxHourly + 5].getDt_txt().substring(11, 13));
        if (hour5 >= 12) {
            hour5 = hour5 - 12;
            time_hour5 = hour5 + " pm";
        } else {
            time_hour5 = hour5 + " am";
        }
        
        if(description_hour1.equals("few clouds")) weather.getLb_hour11().setIcon(icon1);
        else if(description_hour1.equals("scattered clouds")) weather.getLb_hour11().setIcon(icon1);
        else if(description_hour1.equals("broken clouds")) weather.getLb_hour11().setIcon(icon3);
        else if(description_hour1.equals("clear sky")) weather.getLb_hour11().setIcon(icon);
        else weather.getLb_hour11().setIcon(icon2);
        
        double posible_of_rain = 0;
        double posible_of_rain_acc_des = 0.4;
        double posible_of_rain_acc_hum = 0.6;
        double doam1 = result.getList()[idx].getMain().getHumidity();
        double doam2 = result.getList()[idx+1].getMain().getHumidity();
        double doam3 = result.getList()[idx+2].getMain().getHumidity();
        double doam4 = result.getList()[idx+3].getMain().getHumidity();
        double doam5 = result.getList()[idx+4].getMain().getHumidity();
        
        if(description_hour1.equals("few clouds")) posible_of_rain_acc_des = 0.1*posible_of_rain_acc_des;
        else if(description_hour1.equals("scattered clouds")) posible_of_rain_acc_des = 0.2*posible_of_rain_acc_des;
        else if(description_hour1.equals("broken clouds")) posible_of_rain_acc_des = 0.3*posible_of_rain_acc_des;
        else if(description_hour1.equals("clear sky")) posible_of_rain_acc_des = 0;
        else if(description_hour1.equals("light rain")) posible_of_rain_acc_des = posible_of_rain_acc_des*1;
        else if(description_hour1.equals("overcast clouds")) posible_of_rain_acc_des = 0.5*posible_of_rain_acc_des;
        else posible_of_rain_acc_des = 0.6*posible_of_rain_acc_des;
        
        posible_of_rain_acc_hum = posible_of_rain_acc_hum*doam1;
        
        
        weather.getLb_hour12().setText(description_hour1.substring(0, 1).toUpperCase() + description_hour1.substring(1));
        weather.getLb_hour13().setText(String.valueOf(Math.round((posible_of_rain_acc_des+posible_of_rain_acc_hum))) + "%");
        weather.getLb_hour14().setText(" " + wind_hour1);
        weather.getLb_hour15().setText(time_hour1);
        
        posible_of_rain_acc_des = 0.4;
        posible_of_rain_acc_hum = 0.6;
        
        if(description_hour2.equals("few clouds")) posible_of_rain_acc_des = 0.1*posible_of_rain_acc_des;
        else if(description_hour2.equals("scattered clouds")) posible_of_rain_acc_des = 0.2*posible_of_rain_acc_des;
        else if(description_hour2.equals("broken clouds")) posible_of_rain_acc_des = 0.3*posible_of_rain_acc_des;
        else if(description_hour2.equals("clear sky")) posible_of_rain_acc_des = 0;
        else if(description_hour2.equals("light rain")) posible_of_rain_acc_des = posible_of_rain_acc_des*1;
        else if(description_hour2.equals("overcast clouds")) posible_of_rain_acc_des = 0.5*posible_of_rain_acc_des;
        else posible_of_rain_acc_des = 0.6*posible_of_rain_acc_des;
        
        posible_of_rain_acc_hum = posible_of_rain_acc_hum*doam2;
        
        if(description_hour2.equals("few clouds")) weather.getLb_hour21().setIcon(icon1);
        else if(description_hour2.equals("scattered clouds")) weather.getLb_hour21().setIcon(icon1);
        else if(description_hour2.equals("broken clouds")) weather.getLb_hour21().setIcon(icon3);
        else if(description_hour2.equals("clear sky")) weather.getLb_hour21().setIcon(icon);
        else weather.getLb_hour21().setIcon(icon2);
        
        weather.getLb_hour22().setText(description_hour2.substring(0, 1).toUpperCase() + description_hour2.substring(1));
        weather.getLb_hour23().setText(String.valueOf(Math.round((posible_of_rain_acc_des+posible_of_rain_acc_hum))) + "%");
        weather.getLb_hour24().setText(wind_hour2);
        weather.getLb_hour25().setText(time_hour2);
        
        if(description_hour3.equals("few clouds")) weather.getLb_hour31().setIcon(icon1);
        else if(description_hour3.equals("scattered clouds")) weather.getLb_hour31().setIcon(icon1);
        else if(description_hour3.equals("broken clouds")) weather.getLb_hour31().setIcon(icon3);
        else if(description_hour3.equals("clear sky")) weather.getLb_hour31().setIcon(icon);
        else weather.getLb_hour31().setIcon(icon2);
        
        posible_of_rain_acc_des = 0.4;
        posible_of_rain_acc_hum = 0.6;
        
        if(description_hour3.equals("few clouds")) posible_of_rain_acc_des = 0.1*posible_of_rain_acc_des;
        else if(description_hour3.equals("scattered clouds")) posible_of_rain_acc_des = 0.2*posible_of_rain_acc_des;
        else if(description_hour3.equals("broken clouds")) posible_of_rain_acc_des = 0.3*posible_of_rain_acc_des;
        else if(description_hour3.equals("clear sky")) posible_of_rain_acc_des = 0;
        else if(description_hour3.equals("light rain")) posible_of_rain_acc_des = posible_of_rain_acc_des*1;
        else if(description_hour3.equals("overcast clouds")) posible_of_rain_acc_des = 0.5*posible_of_rain_acc_des;
        else posible_of_rain_acc_des = 0.6*posible_of_rain_acc_des;
        
        posible_of_rain_acc_hum = posible_of_rain_acc_hum*3;
        
        
        weather.getLb_hour32().setText(description_hour3.substring(0, 1).toUpperCase() + description_hour3.substring(1));
        weather.getLb_hour33().setText(String.valueOf(Math.round((posible_of_rain_acc_des+posible_of_rain_acc_hum))) + "%");
        weather.getLb_hour34().setText(wind_hour3);
        weather.getLb_hour35().setText(time_hour3);
        
        if(description_hour4.equals("few clouds")) weather.getLb_hour41().setIcon(icon1);
        else if(description_hour4.equals("scattered clouds")) weather.getLb_hour41().setIcon(icon1);
        else if(description_hour4.equals("broken clouds")) weather.getLb_hour41().setIcon(icon3);
        else if(description_hour4.equals("clear sky")) weather.getLb_hour41().setIcon(icon);
        else weather.getLb_hour41().setIcon(icon2);
        
        
        posible_of_rain_acc_des = 0.4;
        posible_of_rain_acc_hum = 0.6;
        
        if(description_hour4.equals("few clouds")) posible_of_rain_acc_des = 0.1*posible_of_rain_acc_des;
        else if(description_hour4.equals("scattered clouds")) posible_of_rain_acc_des = 0.2*posible_of_rain_acc_des;
        else if(description_hour4.equals("broken clouds")) posible_of_rain_acc_des = 0.3*posible_of_rain_acc_des;
        else if(description_hour4.equals("clear sky")) posible_of_rain_acc_des = 0;
        else if(description_hour4.equals("light rain")) posible_of_rain_acc_des = posible_of_rain_acc_des*1;
        else if(description_hour4.equals("overcast clouds")) posible_of_rain_acc_des = 0.5*posible_of_rain_acc_des;
        else posible_of_rain_acc_des = 0.6*posible_of_rain_acc_des;
        
        posible_of_rain_acc_hum = posible_of_rain_acc_hum*doam4;
        
        
        weather.getLb_hour42().setText(description_hour4.substring(0, 1).toUpperCase() + description_hour4.substring(1));
        weather.getLb_hour43().setText(String.valueOf(Math.round((posible_of_rain_acc_des+posible_of_rain_acc_hum))) + "%");
        weather.getLb_hour44().setText(" " + wind_hour4);
        weather.getLb_hour45().setText(time_hour4);
        
        if(description_hour5.equals("few clouds")) weather.getLb_hour51().setIcon(icon1);
        else if(description_hour5.equals("scattered clouds")) weather.getLb_hour51().setIcon(icon1);
        else if(description_hour5.equals("broken clouds")) weather.getLb_hour51().setIcon(icon3);
        else if(description_hour5.equals("clear sky")) weather.getLb_hour51().setIcon(icon);
        else weather.getLb_hour51().setIcon(icon2);
        
        posible_of_rain_acc_des = 0.4;
        posible_of_rain_acc_hum = 0.6;
        
        if(description_hour5.equals("few clouds")) posible_of_rain_acc_des = 0.1*posible_of_rain_acc_des;
        else if(description_hour5.equals("scattered clouds")) posible_of_rain_acc_des = 0.2*posible_of_rain_acc_des;
        else if(description_hour5.equals("broken clouds")) posible_of_rain_acc_des = 0.3*posible_of_rain_acc_des;
        else if(description_hour5.equals("clear sky")) posible_of_rain_acc_des = 0;
        else if(description_hour5.equals("light rain")) posible_of_rain_acc_des = posible_of_rain_acc_des*1;
        else if(description_hour5.equals("overcast clouds")) posible_of_rain_acc_des = 0.5*posible_of_rain_acc_des;
        else posible_of_rain_acc_des = 0.6*posible_of_rain_acc_des;
        
        posible_of_rain_acc_hum = posible_of_rain_acc_hum*doam5;
        
        
        weather.getLb_hour52().setText(description_hour5.substring(0, 1).toUpperCase() + description_hour5.substring(1));
        weather.getLb_hour53().setText(String.valueOf(Math.round((posible_of_rain_acc_des+posible_of_rain_acc_hum))) + "%");
        weather.getLb_hour54().setText(" " + wind_hour5);
        weather.getLb_hour55().setText(time_hour5);
        
        // Swap unit
        if (!initializedTemp) {
            weather.getLb_currentUnit().setText("C");
            weather.getBtn_swapUnit().setText("F");
            initializedTemp = true;
            
            // main temperature
            weather.getLb_nhietDo().setText(nhietDo);
            // feelslike
            weather.getLb_feelsLike().setText(feelsLike);
            // temperature hourly
            weather.getLb_hour11().setText(temp_hour1);
            weather.getLb_hour21().setText(temp_hour2);
            weather.getLb_hour31().setText(temp_hour3);
            weather.getLb_hour41().setText(temp_hour4);
            weather.getLb_hour51().setText(temp_hour5);
            // temperature daily
            weather.getLb_day12().setText(maxtemp1);
            weather.getLb_day13().setText(mintemp1);
            weather.getLb_day22().setText(maxtemp2);
            weather.getLb_day23().setText(mintemp2);
            weather.getLb_day32().setText(maxtemp3);
            weather.getLb_day33().setText(mintemp3);
            weather.getLb_day42().setText(maxtemp4);
            weather.getLb_day43().setText(mintemp4);
            weather.getLb_day52().setText(maxtemp5);
            weather.getLb_day53().setText(mintemp5);
        }
    }

    public class ButtonClick implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            if (command.equals("find")) {
                find();
                idx = 0;
                idxHourly = idx;
                weather.getBtn_details().setVisible(true);
                weather.getBtn_hourly().setVisible(true);
                weather.getBtn_daily().setVisible(true);
                weather.getBtn_pre().setVisible(true);
                weather.getBtn_next().setVisible(true);
                weather.getLb_iconNextToTemp().setVisible(true);
                weather.getBtn_swapUnit().setVisible(true);
                weather.getLb_windAndIcon().setVisible(true);
                initializedTemp = false;
            } else if (command.equals("next")) {
                idx = idx == 39 ? idx : idx + 1;
                idxHourly = idx;
                initializedTemp = false;
            } else if (command.equals("pre")) {
                idx = idx == 0 ? idx : idx - 1;
                idxHourly = idx;
                initializedTemp = false;
            } else if (command.equals("swapUnit")) {
                if (weather.getBtn_swapUnit().getText().equals("C")) {
                    weather.getLb_currentUnit().setText("C");
                    weather.getBtn_swapUnit().setText("F");
                    
                    // main temperature
                    int mainTempC = fToC(weather.getLb_nhietDo().getText(), " ", "°");
                    weather.getLb_nhietDo().setText(" " + mainTempC + "°");
                    // feelslike
                    int feelsLikeTempC = fToC(weather.getLb_feelsLike().getText(), "Feels like ", "°C");
                    weather.getLb_feelsLike().setText("Feels like " + feelsLikeTempC + "°C");
                    // temperature hourly
                    int hourlyTempC1 = fToC(weather.getLb_hour11().getText(), "  ", "°");
                    int hourlyTempC2 = fToC(weather.getLb_hour21().getText(), "  ", "°");
                    int hourlyTempC3 = fToC(weather.getLb_hour31().getText(), "  ", "°");
                    int hourlyTempC4 = fToC(weather.getLb_hour41().getText(), "  ", "°");
                    int hourlyTempC5 = fToC(weather.getLb_hour51().getText(), "  ", "°");
                    weather.getLb_hour11().setText("  " + hourlyTempC1 + "°");
                    weather.getLb_hour21().setText("  " + hourlyTempC2 + "°");
                    weather.getLb_hour31().setText("  " + hourlyTempC3 + "°");
                    weather.getLb_hour41().setText("  " + hourlyTempC4 + "°");
                    weather.getLb_hour51().setText("  " + hourlyTempC5 + "°");
                    // temperature daily
                    int dailyMaxTempC1 = fToC(weather.getLb_day12().getText(), "", "°");
                    int dailyMaxTempC2 = fToC(weather.getLb_day22().getText(), "", "°");
                    int dailyMaxTempC3 = fToC(weather.getLb_day32().getText(), "", "°");
                    int dailyMaxTempC4 = fToC(weather.getLb_day42().getText(), "", "°");
                    int dailyMaxTempC5 = fToC(weather.getLb_day52().getText(), "", "°");
                    int dailyMinTempC1 = fToC(weather.getLb_day13().getText(), "", "°");
                    int dailyMinTempC2 = fToC(weather.getLb_day23().getText(), "", "°");
                    int dailyMinTempC3 = fToC(weather.getLb_day33().getText(), "", "°");
                    int dailyMinTempC4 = fToC(weather.getLb_day43().getText(), "", "°");
                    int dailyMinTempC5 = fToC(weather.getLb_day53().getText(), "", "°");
                    weather.getLb_day12().setText("" + dailyMaxTempC1 + "°");
                    weather.getLb_day22().setText("" + dailyMaxTempC2 + "°");
                    weather.getLb_day32().setText("" + dailyMaxTempC3 + "°");
                    weather.getLb_day42().setText("" + dailyMaxTempC4 + "°");
                    weather.getLb_day52().setText("" + dailyMaxTempC5 + "°");
                    weather.getLb_day13().setText("" + dailyMinTempC1 + "°");
                    weather.getLb_day23().setText("" + dailyMinTempC2 + "°");
                    weather.getLb_day33().setText("" + dailyMinTempC3 + "°");
                    weather.getLb_day43().setText("" + dailyMinTempC4 + "°");
                    weather.getLb_day53().setText("" + dailyMinTempC5 + "°");
                } else {    // °C -> °F
                    weather.getLb_currentUnit().setText("F");
                    weather.getBtn_swapUnit().setText("C");
                    
                    // main temperature
                    int mainTempF = cToF(weather.getLb_nhietDo().getText(), " ", "°");
                    weather.getLb_nhietDo().setText(" " + mainTempF + "°");
                    // feelslike
                    int feelsLikeTempF = cToF(weather.getLb_feelsLike().getText(), "Feels like ", "°C");
                    weather.getLb_feelsLike().setText("Feels like " + feelsLikeTempF + "°C");
                    // temperature hourly
                    int hourlyTempF1 = cToF(weather.getLb_hour11().getText(), "  ", "°");
                    int hourlyTempF2 = cToF(weather.getLb_hour21().getText(), "  ", "°");
                    int hourlyTempF3 = cToF(weather.getLb_hour31().getText(), "  ", "°");
                    int hourlyTempF4 = cToF(weather.getLb_hour41().getText(), "  ", "°");
                    int hourlyTempF5 = cToF(weather.getLb_hour51().getText(), "  ", "°");
                    weather.getLb_hour11().setText("  " + hourlyTempF1 + "°");
                    weather.getLb_hour21().setText("  " + hourlyTempF2 + "°");
                    weather.getLb_hour31().setText("  " + hourlyTempF3 + "°");
                    weather.getLb_hour41().setText("  " + hourlyTempF4 + "°");
                    weather.getLb_hour51().setText("  " + hourlyTempF5 + "°");
                    // temperature daily
                    int dailyMaxTempF1 = cToF(weather.getLb_day12().getText(), "", "°");
                    int dailyMaxTempF2 = cToF(weather.getLb_day22().getText(), "", "°");
                    int dailyMaxTempF3 = cToF(weather.getLb_day32().getText(), "", "°");
                    int dailyMaxTempF4 = cToF(weather.getLb_day42().getText(), "", "°");
                    int dailyMaxTempF5 = cToF(weather.getLb_day52().getText(), "", "°");
                    int dailyMinTempF1 = cToF(weather.getLb_day13().getText(), "", "°");
                    int dailyMinTempF2 = cToF(weather.getLb_day23().getText(), "", "°");
                    int dailyMinTempF3 = cToF(weather.getLb_day33().getText(), "", "°");
                    int dailyMinTempF4 = cToF(weather.getLb_day43().getText(), "", "°");
                    int dailyMinTempF5 = cToF(weather.getLb_day53().getText(), "", "°");
                    weather.getLb_day12().setText("" + dailyMaxTempF1 + "°");
                    weather.getLb_day22().setText("" + dailyMaxTempF2 + "°");
                    weather.getLb_day32().setText("" + dailyMaxTempF3 + "°");
                    weather.getLb_day42().setText("" + dailyMaxTempF4 + "°");
                    weather.getLb_day52().setText("" + dailyMaxTempF5 + "°");
                    weather.getLb_day13().setText("" + dailyMinTempF1 + "°");
                    weather.getLb_day23().setText("" + dailyMinTempF2 + "°");
                    weather.getLb_day33().setText("" + dailyMinTempF3 + "°");
                    weather.getLb_day43().setText("" + dailyMinTempF4 + "°");
                    weather.getLb_day53().setText("" + dailyMinTempF5 + "°");
                    }
            } else if (command.equals("prevHourly")) {
                initializedTemp = false;
                if (idxHourly > 0) idxHourly--;
            } else if (command.equals("nextHourly")) {
                initializedTemp = false;
                if (idxHourly < 35) idxHourly++;
            }
            show();
        }

        private int cToF(String stringOfLb, String first, String last) {
            double cTemp = Integer.parseInt(stringOfLb.substring(first.length(), stringOfLb.length() - last.length()));
            int fTemp = (int) (1.8 * cTemp + 32);
            return fTemp;
        }
        
        private int fToC(String stringOfLb, String first, String last) {
            double fTemp = Integer.parseInt(stringOfLb.substring(first.length(), stringOfLb.length() - last.length()));
            int cTemp = (int) (Math.round((fTemp - 32) / 1.8));
            return cTemp;
        }
        
        private void find() {
            result = HandleAPI.getJsonData(weather.getjTextField_Search().getText().substring(3));
        }
    }
}