package controllers;

import java.util.EmptyStackException;

import models.NodeGeneric;
import models.Persona;

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

    public T findByName(String nombre){
        NodeGeneric<T> valor = primero;
        while(valor != null){
            Persona persona = (Persona) valor.getValue();
            if (persona.getNombre().equals(nombre)) {
                return valor.getValue();
            }
            valor = valor.getNext();
        }
        return null;
    }

    public T removeByName(String nombre) {
        NodeGeneric<T> actual = primero;
        NodeGeneric<T> anterior = null;

        while (actual != null) {
            Persona persona = (Persona) actual.getValue();
            if (persona.getNombre().equals(nombre)) {
                if (anterior == null) {
                    primero = actual.getNext();
                } else {
                    anterior.setNext(actual.getNext());
                }

                if (actual == ultimo) {
                    ultimo = anterior;
                }

                size--;
                return actual.getValue();
            }
            anterior = actual;
            actual = actual.getNext();
        }
        return null;
    }
    
}