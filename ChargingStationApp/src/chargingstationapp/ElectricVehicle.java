/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chargingstationapp;

/**
 *
 * @author afoud
 */
public class ElectricVehicle extends Vehicle {
    
    public ElectricVehicle(String name, int batteryPercent) {
        super(name, batteryPercent);
    }
    
    @Override
    public int getPriority() {
        return batteryPercent - 10;
    }

}
