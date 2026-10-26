public class Ejercicio7 {

    public static String reemplazar(String texto, String buscar, String reemplazo) {
        if (texto == null || buscar == null || reemplazo == null) {
            return texto;
        }
        
        if (buscar.isEmpty()) {
            return texto;
        }
        
        StringBuilder resultado = new StringBuilder();
        int i = 0;
        int lenBuscar = buscar.length();
        
        while (i < texto.length()) {
            
            if (i + lenBuscar <= texto.length() && texto.substring(i, i + lenBuscar).equals(buscar)) {
                resultado.append(reemplazo);
                i += lenBuscar; 
            } else {
                resultado.append(texto.charAt(i));
                i++;
            }
        }
        
        return resultado.toString();
    }

    public static void main(String[] args) {
        System.out.println(reemplazar("Java es Java", "Java", "Kotlin")); // Esperado: Kotlin es Kotlin
        System.out.println(reemplazar("aaaaa", "aa", "b"));               // Esperado: bba
        System.out.println(reemplazar("uno dos uno", "uno", "tres"));     // Esperado: tres dos tres
        
        // Prueba adicional: 'buscar' vacío
        System.out.println(reemplazar("Hola", "", "X"));                  // Esperado: Hola
    }
}