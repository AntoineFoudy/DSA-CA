/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chargingstationapp;

/**
 *
 * @author afoud
 */
public class Vehicle {
    
    private String name;
    protected int batteryPercent;
    
    public Vehicle(String name, int batteryPercent) {
        this.name = name;
        this.batteryPercent = batteryPercent;
    }
    
    public String getName() {
        return name;
    }
    
    public int getBatteryPercent() {
        return batteryPercent;
    }
    
    public int getPriority() {
        return batteryPercent;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", Battery Percent: " + batteryPercent;
    }
}
