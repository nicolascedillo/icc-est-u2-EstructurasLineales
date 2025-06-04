package controllers;

import java.util.EmptyStackException;

import models.Node;

public class Cola {
    private Node primero;
    private Node ultimo;
    public int size;

    public Cola() {
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }

    public void add(int value){
        Node newNode = new Node(value);
        if(isEmpty()){
            primero = newNode;
            ultimo = newNode;
        }else{
            ultimo.setNext(newNode);
            ultimo = newNode;
        }
        size++;
    }

    public boolean isEmpty(){
        return primero == null;
    }

    public int remove(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int value = primero.getValue();
        primero = primero.getNext();
        size--;
        return value;
    }

    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return primero.getValue();
    }

    public void printCola(){
        Node valor = primero;
        while(valor != null){
            System.out.print(valor.getValue() + " | ");
            valor = valor.getNext();
        }
        System.out.println();
    }

    public int size(){
        return size;
    }
}
