/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chargingstationapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author afoud
 */
public class BTNode {
    
    private String sElement;
    private BTNode leftChild;
    private BTNode rightChild;
    private ArrayList<Integer> stations = new ArrayList<>();
    
    public BTNode(String inValue) {
        this.sElement = inValue;
    }
    
    public boolean isLeaf() {
        boolean leaf = false;
        if(leftChild == null && rightChild == null) {
            leaf = true;
        }
        return leaf;
    }
    
    public String getElement() {
        return sElement;
    }
    
    public void setLeft(BTNode inNode) {
        this.leftChild = inNode;
    }
    
    public void setRight(BTNode inNode) {
        this.rightChild = inNode;
    }
    
    public BTNode getLeft() {
        return leftChild;
    }
    
    public BTNode getRight() {
        return rightChild;
    }
    
    public boolean isInternal() {
        boolean internal = false;
        if(leftChild != null || rightChild != null) {
            internal = true;
        }
        return internal;
    }
    
    public boolean isExternal() {
        boolean external = false;
        if(leftChild == null && rightChild == null) {
            external = true;
        }
        return external;
    }
    
    public void setStation(int id) {
        stations.add(id);
    }
    
    public List<Integer> getStation() {
        return stations;
    }
}
