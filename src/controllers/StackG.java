package controllers;

import java.util.EmptyStackException;
import models.NodeGeneric;

public class StackG<T> {
    private int size;
    private NodeGeneric<T> top;

    public StackG() {
        this.top = null;
        this.size = 0;
    }

    public void push(T value){
        NodeGeneric<T> newNode = new NodeGeneric<T>(value);
        newNode.setNext(top);
        top = newNode;
        size++;
    }

    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        T value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }

    public T peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void printStack(){
        NodeGeneric<T> valor = top;
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
