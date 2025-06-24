package Ejercicio_01_sign;

import controllers.*;

public class SignValidator {
    public boolean isValid(String s) {
        StackG<Character> pila = new StackG<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {

                pila.push(c);

            } else {
                if (pila.isEmpty()){
                    return false;
                } 
                char top = pila.pop(); 
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }
}
