/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chargingstationapp;

import java.util.ArrayList;

/**
 *
 * @author afoud
 */
public class PriorityQueue implements PQInterface {
    
    private ArrayList<PQElement> thePQueue;
    
    public PriorityQueue() {
        this.thePQueue = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return thePQueue.isEmpty();
    }
    
    @Override
    public int size() {
        return thePQueue.size();
    }
    
    @Override
    public void enqueue(int getPriority, Object vehicle) {
        int index;
        // Create the newElement using the priority of the Vehicle, and the Vehicle
        PQElement newElement = new PQElement(getPriority, (Vehicle) vehicle);
        
        index = findInsertPosition(getPriority);
        
        if(index == size()) {
            thePQueue.add(newElement);
        }
        else {
            thePQueue.add(index, newElement);
        }
        
    }
    
    // Code is from Hamilton Niculescu @Nactional College of Ireland.
    // Adopted so that the lower getPriority is the higher Priority it is.
    private int findInsertPosition(int iNewKey) {
        boolean found = false;
        int index = 0;
        PQElement curElement;
        
        while(index < thePQueue.size() && !found) {
            curElement = thePQueue.get(index);
            if(curElement.getiKey() <= iNewKey) {
                index++;
            }
            else {
                found = true;
            }
        }
        return index;
    }
    
    @Override
    public Object dequeue() {
        return thePQueue.remove(0);
    }
    
    @Override
    public String printPQueue() {
        String printString = new String();
        
        for(PQElement curElement : thePQueue) {
            printString = printString.concat(curElement.printVehicle() + "\n");
        }
        return printString;
    }
    
    
}
