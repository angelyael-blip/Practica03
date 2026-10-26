public class Ejercicio9 {

    public static boolean validar(String expresion) {
        if (expresion == null) return false;
        
        StringBuilder pila = new StringBuilder();
        
        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);
            
            if (c == '(' || c == '[' || c == '{') {
                pila.append(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pila.length() == 0) return false; 
                
                char ultimo = pila.charAt(pila.length() - 1); 

                if ((c == ')' && ultimo == '(') ||
                    (c == ']' && ultimo == '[') ||
                    (c == '}' && ultimo == '{')) {
                    pila.deleteCharAt(pila.length() - 1);
                } else {
                    return false; 
                }
            }
        }
        
        return pila.length() == 0;
    }

    public static void main(String[] args) {
       
        System.out.println(validar("{a[(b+c)]}")); // Esperado: true
        System.out.println(validar("{[()]}"));     // Esperado: true
        System.out.println(validar("a+b"));        // Esperado: true
        
        System.out.println("---");
        
        
        System.out.println(validar("([)]"));       // Esperado: false
        System.out.println(validar("((a+b)"));      // Esperado: false
    }
}