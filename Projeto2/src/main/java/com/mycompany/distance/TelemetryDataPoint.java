/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.distance;

import com.google.gson.Gson;

/**
 *
 * @author Turma A
 */
public class TelemetryDataPoint {
    
    public double distance;
    public String currentDate;
    public boolean alertStatus;
    //public int payload;
    
    // Serialize object to JSON format.
    public String serialize() {
      Gson gson = new Gson();
      return gson.toJson(this);
    }
}
