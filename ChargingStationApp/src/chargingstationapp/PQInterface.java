/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package chargingstationapp;

/**
 *
 * @author afoud
 */
public interface PQInterface {
    
    public void enqueue(int getPriority, Object vehicle);
    
    public Object dequeue();
    
    public int size();
    
    public boolean isEmpty();
    
    public String printPQueue();
    
}
