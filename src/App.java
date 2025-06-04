import controllers.Stack;
import controllers.StackG;
import models.Persona;
import controllers.Cola;
import controllers.ColaG;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("-----------Stack-----------");

        Stack stack = new Stack();
        stack.push(10);
        stack.push(-1);
        stack.push(5);
        stack.push(8);
        System.out.println("Tam: " + stack.size());
        stack.printStack();
        stack.pop();
        stack.peek();
        System.out.println("Tam: " + stack.size());
        stack.printStack();

        System.out.println("-----------StackG-----------");
        StackG<Integer> stackGInteger = new StackG<Integer>();
        stackGInteger.push(1);
        stackGInteger.push(4);
        stackGInteger.printStack();
        StackG<String> stackGString = new StackG<String>();
        stackGString.push("Uno");
        stackGString.push("Cuatro");
        stackGString.printStack();

        System.out.println("-----------Cola-----------");
        Cola cola = new Cola();
        cola.add(5);
        cola.add(7);
        cola.add(10);
        System.out.println("Tam: " + cola.size);
        cola.printCola();
        cola.remove();
        System.out.println("Tam: " + cola.size);
        cola.printCola();

        System.out.println("-----------ColaGenerica-----------");
        Persona p1 = new Persona("Pablo");
        Persona p2 = new Persona("Juan");
        Persona p3 = new Persona("María");

        ColaG<Persona> colaPersonas = new ColaG<Persona>();
        colaPersonas.add(p1);
        colaPersonas.add(p2);
        colaPersonas.add(p3);
        System.out.println("Tam: "+colaPersonas.size());
        colaPersonas.printCola();
        System.out.println("A tiene a la persona => " + colaPersonas.remove());
        System.out.println("Tam: "+colaPersonas.size());
        colaPersonas.printCola();
    }
}