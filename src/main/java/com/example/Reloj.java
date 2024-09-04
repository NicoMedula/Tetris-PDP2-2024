package com.example;

import java.util.Timer;
import java.util.TimerTask;

public class Reloj extends Board {

    private Timer tiempo; 

    private void ticRejoj() {
        tiempo = new Timer();
        tiempo.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                bajarPieza();
            }
        }, 0, 2000); 
    }
}
