/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chargingstationapp;

/**
 *
 * @author afoud
 */
public class SLLStationNode{
    
    private Object element;
    private SLLStationNode next;
    
    
    public SLLStationNode (Object inElement, SLLStationNode inNode) {
        this.element = inElement;
        this.next = inNode;
    }
    
    public Object getElement() {
        return element;
    }
    
    public void setElement(Object element) {
        this.element = element;
    }
    
    public SLLStationNode getNext() {
        return next;
    }
    
    public void setNext(SLLStationNode next) {
        this.next = next;
    }
    
    @Override
    public String toString() {
        return element.toString();
    }
}
