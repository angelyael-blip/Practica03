public class PruebaEditor {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();
        editor.escribir("Hola mundo");
        editor.insertar(5, "gran ");
        editor.eliminar(0, 5);
        
        System.out.println(editor.obtenerTexto()); // Salida esperada: gran mundo
        
        editor.deshacer();
        System.out.println(editor.obtenerTexto()); // Salida esperada: Hola gran mundo

        System.out.println("--- Pruebas extra ---");
        editor.reemplazar(0, 4, "Saludos");
        System.out.println(editor.obtenerTexto()); // Salida: Saludos gran mundo
        
        editor.deshacer();
        System.out.println(editor.obtenerTexto()); // Salida: Hola gran mundo
    }
}