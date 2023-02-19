package views;

import java.util.ArrayList;

import models.Restapi;
import models.City;

public class Maincon {
    Restapi restapi;

    public Maincon(Restapi restapi) {
        this.restapi = restapi;
        this.start();
    }

    public void start() {
        ArrayList<City> cities = this.restapi.getCities();
        for (City city : cities) {
            System.out.printf("%10s %12s %6.2f\n",
                    city.city,
                    city.address,
                    city.size,
                    city.price);
        }
    }
}
