package Ejercicio_02_sorting;

import controllers.Stack;

public class StackSorter {
    public void sortStack(Stack stack){
        Stack aux = new Stack();

        while (!stack.isEmpty()) {
            int temp = stack.pop();

            while (!aux.isEmpty() && aux.peek() > temp) {
                stack.push(aux.pop());
            }

            aux.push(temp);
        }

        while (!aux.isEmpty()) {
            stack.push(aux.pop());
        }

    }
}
