/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chargingstationapp;

/**
 *
 * @author afoud
 */
public class SLList implements LinearListInterface{
    
    private SLLStationNode head;
    private int iSize;
    private SLLStationNode currNode;
    private SLLStationNode prevNode;
    
    public SLList() {
        this.head = null;
        this.iSize = 0;
    }
    
    @Override
    public boolean isEmpty() {
        if(head == null) {
            return true;
        }
        else {
            return false;
        }
    }
    
    @Override
    public int size() {
        return iSize;
    }
    
    @Override
    public void add(int iPosition, Object theElement) {
        SLLStationNode newNode = new SLLStationNode(theElement, null);
        if(iPosition == 0) {
            this.head = newNode;
        }
        else {
            setCurrent(iPosition);
            newNode.setNext(currNode.getNext());
            currNode.setNext(newNode);
        }
    }
    
    @Override
    public void add(Object theElement) {
        SLLStationNode newNode = new SLLStationNode(theElement, null);
        setCurrent(iSize);
        currNode.setNext(newNode);
    }
    
    @Override
    public Object get(int iPosition) {
        setCurrent(iPosition);
        return currNode;
    }
    
    @Override
    public void remove(int iPosition) {
        setCurrent(iPosition);
        
        if(currNode == head) {
            head = currNode;
        }
        else if(currNode.getNext() == null) {
            prevNode.setNext(null);
        }
        else if (currNode.getNext() != null) {
            prevNode.setNext(currNode.getNext());
        }
    }
    
    @Override
    public void printList() {
        currNode = head;
        
        while(currNode.getNext() != null) {
            System.out.println(currNode.toString() + "\n");
            currNode = currNode.getNext();
        }
    }
    
    @Override
    public boolean searchKey(Object headNode, Object key) {
        currNode = head;
        boolean found = false;
        
        for(int i = 0; i < iSize; i++) {
            if(currNode.getElement() == key) {
                found = true;
            }
        }
        return found;
    }
    
    private void setCurrent(int iPosition) {
        this.currNode = head;
        for(int i = 0; i < iPosition; i++) {
            prevNode = currNode;
            currNode = currNode.getNext(); 
        } 
    }    
}
