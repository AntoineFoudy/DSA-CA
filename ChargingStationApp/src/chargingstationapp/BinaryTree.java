/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chargingstationapp;

import java.util.List;

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
        // Using recursion to find the correct insert location
        else if(newNode.getElement().compareTo(startNode.getElement()) < 0) {
            if(startNode.getLeft() ==  null) {
                startNode.setLeft(newNode);
            }
            else {
                insertNode(startNode.getLeft(), newNode);
            }
        }
        else if (newNode.getElement().compareTo(startNode.getElement()) > 0) {
            if(startNode.getRight() == null) {
                startNode.setRight(newNode);
            }
            else {
                insertNode(startNode.getRight(), newNode);
            }
        }
    }
    
    public BTNode search(String searchElement, BTNode startNode) {
        if (startNode == null) {
            return null;
        } else {
            if (searchElement.equals(startNode.getElement())) {
                return startNode;
            } else if (searchElement.compareTo(startNode.getElement()) < 0) {
                return search(searchElement, startNode.getLeft());
            } else {
                return search(searchElement, startNode.getRight());
            }
        }
    }
    
    public void inOrderTraversal(BTNode startNode) {
        if(startNode != null) {
            inOrderTraversal(startNode.getLeft());
            System.out.println(startNode.getElement());
            inOrderTraversal(startNode.getRight());
        }
    }
    
    public void preOrderTraversal(BTNode startNode) {
        if(startNode != null) {
            System.out.println(startNode.getElement());
            preOrderTraversal(startNode.getLeft());
            preOrderTraversal(startNode.getRight());
        }
    }
    
    public void postOrderTraversal(BTNode startNode) {
        if(startNode != null) {
            inOrderTraversal(startNode.getRight());
            System.out.println(startNode.getElement());
            inOrderTraversal(startNode.getLeft());
        }
    }
    
    public int countNodes(BTNode startNode) {   
        if(startNode == null) {
            return 0;
        }
        return 1 + countNodes(startNode.getLeft()) + countNodes(startNode.getRight());
    }
    
    public int height(BTNode startNode) {
        int countLeft;
        int countRight;
        
        if(startNode == null || startNode.isExternal()) {
            return 0;
        }
        else {
            countLeft = height(startNode.getLeft());
            countRight = height(startNode.getRight());
            return 1 + Math.max(countLeft, countLeft);
        }
    }
    
    // Add the stations in the ArrayList in the BinaryTree nodes
    public void setStations(BTNode startNode,String location, int stationId) {
        if(startNode.getElement().equals(location)) {
            startNode.setStation(stationId);
        }
        else {
            setStations(search(location, startNode), location, stationId);
        }
    }
    
    public List<Integer> getStations(BTNode startNode,String location) {
        startNode = search(location, startNode);
        return startNode.getStation();
    }
}
