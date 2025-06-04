package controllers;

import java.util.EmptyStackException;

import models.NodeGeneric;

public class ColaG<T> {
    private NodeGeneric<T> primero;
    private NodeGeneric<T> ultimo;
    private int size;

    public ColaG() {
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }

    public void add(T value){
        NodeGeneric<T> newNodeGeneric = new NodeGeneric<T>(value);
        if(isEmpty()){
            primero = newNodeGeneric;
            ultimo = newNodeGeneric;
        }else{
            ultimo.setNext(newNodeGeneric);
            ultimo = newNodeGeneric;
        }
        size++;
    }

    public boolean isEmpty(){
        return primero == null;
    }

    public T remove(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        T value = primero.getValue();
        primero = primero.getNext();
        size--;
        return value;
    }

    public T peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return primero.getValue();
    }

    public void printCola(){
        NodeGeneric<T> valor = primero;
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
