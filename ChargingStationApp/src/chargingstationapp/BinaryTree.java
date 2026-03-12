/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chargingstationapp;

/**
 *
 * @author afoud
 */
public class BinaryTree {
    
    private BTNode theRoot;
    
    public BinaryTree() {
        theRoot = null;
    }
    
    public BTNode root() {
        return theRoot;
    }
    
    public boolean isEmpty() {
        if(theRoot == null) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public void insertNode(BTNode startNode, BTNode newNode) {
        if(theRoot == null) {
           theRoot = newNode; 
        }
        else {
            if(newNode.getiElement() < startNode.getiElement())
        }
    }
}
