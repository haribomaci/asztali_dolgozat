/*
* File: MainController.java
* Author: Tóth Júlia
* Copyright: 2023, Tóth Júlia
* Group: Szoft 2/n
* Date: 2023-02-19
* Github: https://github.com/haribomaci/
* Licenc: GNU GPL
*/

package controllers;

import models.Restapi;
import views.Maincon;

public class MainController {
    Maincon maincon;
    Restapi restapi;
    public MainController() {
        this.restapi = new Restapi();
        this.maincon = new Maincon(this.restapi);
    }
    
}
