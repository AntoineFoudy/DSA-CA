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
    
    // Add methods use overloading to decided which add method to run
    
    @Override
    public void add(int iPosition, Object theElement) {
        // Create a SLL node, holds the station id ( of type int ) and defaults to a null pointer
        SLLStationNode newNode = new SLLStationNode(theElement, null);
        if(iPosition == 1) {
            if(head.getNext() != null) {
                newNode.setNext(head);
            }
            this.head = newNode;
        }
        else {
            setCurrent(iPosition);
            newNode.setNext(currNode.getNext());
            currNode.setNext(newNode);
        }
        iSize = iSize + 1;
    }
    
    @Override
    public void add(Object theElement) {
        // Create a SLL node, holds the station id ( of type int ) and defaults to a null pointer
        SLLStationNode newNode = new SLLStationNode(theElement, null);
        if(head == null) {
            head = newNode;
        }
        else {
            setCurrent(iSize);
            currNode.setNext(newNode);
        }
        iSize = iSize + 1;
    }
    
    @Override
    public Object get(int iPosition) {
        setCurrent(iPosition);
        return currNode;
    }
    
    // Removes the Node at a spesific position 
    @Override
    public void remove(int iPosition) {
        setCurrent(iPosition);
        
        // Changes the pointer of the previous node to the next node in relation to the node that has been removed
        if(currNode == head) {
            head = currNode.getNext();
        }
        else if(currNode.getNext() == null) {
            prevNode.setNext(null);
        }
        else if (currNode.getNext() != null) {
            prevNode.setNext(currNode.getNext());
        }
        iSize = iSize - 1;
    }
    
    @Override
    public void printList() {
        currNode = head;
        
        while(currNode != null) {
            System.out.println(currNode.toString() + "\n");
            currNode = currNode.getNext();
        }
    }
    
    @Override
    public boolean searchKey(Object key) {
        currNode = head;
        boolean found = false;
        
        /*
            Rewrote the find method because of past bugs
            Originaly I forgot to increase the size every time I added a node
            And I had i as = 1, so it was not checking every element in the SLL
            Now the method doesn't rely on the SLL  size or me having the correct number
        */
        while(currNode != null && !found) {
            if(currNode.getElement().equals(key)) {
                found = true;
            }
            currNode = currNode.getNext();
        }
        
//        for(int i = 0; i < iSize; i++) {
//            if(currNode.getElement() == key) {
//                found = true;
//            }
//            currNode = currNode.getNext();
//        }
        return found;
    }
    
    private void setCurrent(int iPosition) {
        this.currNode = head;

        for(int i = 1; i < iPosition; i++) {
            prevNode = currNode;
            currNode = currNode.getNext(); 
        } 
    }    
}
