/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chargingstationapp;

/**
 *
 * @author afoud
 */
public class PQElement {
    
    private int iKey;
    private Vehicle vehicle;
    
    public PQElement(int iInPriority, Vehicle inVehicle) {
        this.iKey = iInPriority;
        this.vehicle = inVehicle;
    }
    
    public int getiKey() {
        return iKey;
    }
    
    public void setiKey(int iInKey) {
        this.iKey = iInKey;
    }
    
    public Vehicle getVehicle() {
        return vehicle;
    }
    
    public void setVehicle(Vehicle inVehicle) {
        this.vehicle = inVehicle;
    }
    
    public String printVehicle() {
        return "Priority = " + iKey + " Vehicle = " + vehicle.toString();
    }
    
}
