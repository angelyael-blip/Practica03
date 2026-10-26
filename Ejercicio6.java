public class Ejercicio6 {

    public static String eliminarDuplicados(String texto) {
        if (texto == null) return "";
        
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (resultado.indexOf(String.valueOf(c)) == -1) {
                resultado.append(c);
            }
        }
        return resultado.toString();
    }

        public static void main(String[] args) {
        System.out.println(eliminarDuplicados("programacion")); // Esperado: progamcin
        System.out.println(eliminarDuplicados("mississippi"));  // Esperado: misp
        System.out.println(eliminarDuplicados("aabbcc"));       // Esperado: abc
        System.out.println(eliminarDuplicados("123123456"));   // Esperado: 123456
    }
}