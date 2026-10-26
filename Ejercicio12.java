public class Ejercicio12 {

    public static String addBinary(String a, String b) {
        
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();

       
        int i = arrA.length - 1;
        int j = arrB.length - 1;

        int acarreo = 0;

        int maxLen = Math.max(arrA.length, arrB.length) + 1;
        char[] resultadoAux = new char[maxLen];
        int k = maxLen - 1; 

        while (i >= 0 || j >= 0 || acarreo > 0) {
            int suma = acarreo;

            
            if (i >= 0) {
                suma += arrA[i] - '0'; 
                i--;
            }

            
            if (j >= 0) {
                suma += arrB[j] - '0';
                j--;
            }

         
            resultadoAux[k] = (char) ((suma % 2) + '0');
            
            acarreo = suma / 2;
            k--;
        }

        int inicio = k + 1;
        return new String(resultadoAux, inicio, maxLen - inicio);
    }

    public static void main(String[] args) {

        String a1 = "11", b1 = "1";
        System.out.println("Entrada: a = \"" + a1 + "\", b = \"" + b1 + "\"");
        System.out.println("Salida: \"" + addBinary(a1, b1) + "\"\n"); 

        String a2 = "1010", b2 = "1011";
        System.out.println("Entrada: a = \"" + a2 + "\", b = \"" + b2 + "\"");
        System.out.println("Salida: \"" + addBinary(a2, b2) + "\""); 
    }
}