public class Ejercicio8 {

    public static String invertirPalabras(String texto) {
        if (texto == null || texto.isEmpty()) return texto;
        
        StringBuilder resultado = new StringBuilder();
        int fin = texto.length();
        
        for (int i = texto.length() - 1; i >= 0; i--) {
            if (texto.charAt(i) == ' ') {

                resultado.append(texto.substring(i + 1, fin)).append(" ");
                fin = i;
            }
        }

        resultado.append(texto.substring(0, fin));
        
        return resultado.toString();
    }

    public static void main(String[] args) {
        System.out.println(invertirPalabras("Java es poderoso")); // Esperado: poderoso es Java
        System.out.println(invertirPalabras("uno dos tres"));     // Esperado: tres dos uno
        System.out.println(invertirPalabras("Hola"));             // Esperado: Hola
        System.out.println(invertirPalabras("Java es genial"));    // Esperado: genial es Java
    }
}