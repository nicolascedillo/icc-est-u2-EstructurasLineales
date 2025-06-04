package controllers;

import java.util.EmptyStackException;

import models.Node;

public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public void push(int value){
        Node newNode = new Node(value);
        newNode.setNext(top);
        top = newNode;
    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int value = top.getValue();
        top = top.getNext();
        return value;
    }

    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void printStack(){
        Node valor = top;
        while(valor != null){
            System.out.print(valor.getValue() + " ");
            valor = valor.getNext();
        }
        System.out.println();
    }

}