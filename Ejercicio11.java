public class Ejercicio11 {

    public static void main(String[] args) {
       
        int[] numeros = {8, 3, 10, 5, 4};

        int suma = 0;
        int mayor = numeros[0]; 

        for (int num : numeros) {
            suma += num;
            if (num > mayor) {
                mayor = num;
            }
        }

     
        double promedio = (double) suma / numeros.length;

        System.out.println("suma = " + suma + "; promedio = " + promedio + "; mayor = " + mayor + ".");
    }
}
