public class Ejercicio5 {

    public static boolean esPalindromo(String texto) {
        if (texto == null) return false;
        
        int i = 0;
        int j = texto.length() - 1;
        
        while (i < j) {
            char c1 = normalizar(texto.charAt(i));
            char c2 = normalizar(texto.charAt(j));
            
            
            if (c1 == ' ') {
                i++;
            
            } else if (c2 == ' ') {
                j--;
            
            } else {
                if (c1 != c2) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }

    
    private static char normalizar(char c) {
        c = Character.toLowerCase(c);
        switch (c) {
            case 'á': return 'a';
            case 'é': return 'e';
            case 'í': return 'i';
            case 'ó': return 'o';
            case 'ú': case 'ü': return 'u';
        }
        
        if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
            return c;
        }
        return ' ';
    }

    
    public static void main(String[] args) {
        System.out.println(esPalindromo("Anita lava la tina"));     // Esperado: true
        System.out.println(esPalindromo("¿Acaso hubo búhos acá?")); // Esperado: true
        System.out.println(esPalindromo("Java es genial"));        // Esperado: false
        System.out.println(esPalindromo("Somos"));                 // Esperado: true
    }
}