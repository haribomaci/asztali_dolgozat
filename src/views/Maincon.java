/*
* File: Maincon.java
* Author: Tóth Júlia
* Copyright: 2023, Tóth Júlia
* Group: Szoft 2/n
* Date: 2023-02-19
* Github: https://github.com/haribomaci/
* Licenc: GNU GPL
*/

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
            System.out.printf(
                    city.city,
                    city.address,
                    city.size,
                    city.price);
        }
    }
}
