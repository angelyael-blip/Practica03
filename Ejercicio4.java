public class Ejercicio4 {

    // Método solicitado en la práctica
    public static String comprimir(String texto) {
        if (texto == null || texto.length() == 0) {
            return "";
        }
        
        StringBuilder resultado = new StringBuilder();
        int contador = 1;
        
        for (int i = 0; i < texto.length(); i++) {
            
            if (i + 1 < texto.length() && texto.charAt(i) == texto.charAt(i + 1)) {
                contador++;
            } else {
                resultado.append(texto.charAt(i)).append(contador);
                contador = 1; 
            }
        }
        
        return resultado.toString();
    }

    
    public static void main(String[] args) {
        System.out.println(comprimir("aaabbcaaaa")); 
        System.out.println(comprimir("xxxxyzz"));    
        System.out.println(comprimir("abcd"));       
    }
}