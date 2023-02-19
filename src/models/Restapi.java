package models;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class Restapi {
    String host;
    public Restapi(){
        this.host = "http://[::1]:3000/";
    }
    public String citieString(){
        String response = null;
        try {
            response = tryCitieString();
        } catch (MalformedURLException e) {
            System.err.println("Hiba! Az URL nem érvényes.");
        } catch(IOException e){
            System.err.println("Hiba! Sikertelen a rest api elérése");
        }
        return response;
    }
    public String tryCitieString() throws IOException, MalformedURLException{
        String endpoint = "cities";
        String urlStr = this.host + endpoint;
        URL url = new URL(urlStr);
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.connect();
        int responseCode = http.getResponseCode();
        System.out.println(responseCode);
        return null;
    }

    public ArrayList<City> getCities(){
        return null;
    }
}
