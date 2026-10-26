public class EditorTexto {
    
    private StringBuilder contenido;
    private StringBuilder anterior;

    
    public EditorTexto() {
        this.contenido = new StringBuilder();
        this.anterior = null;
    }

    
    private void guardarEstadoAnterior() {
        this.anterior = new StringBuilder(this.contenido.toString());
    }

    
    private boolean esRangoValido(int inicio, int fin) {
        return inicio >= 0 && fin >= inicio && fin <= contenido.length();
    }

    
    public void escribir(String texto) {
        if (texto == null || texto.isEmpty()) return;
        guardarEstadoAnterior();
        contenido.append(texto);
    }

    
    public void insertar(int posicion, String texto) {
        if (texto == null || posicion < 0 || posicion > contenido.length()) return;
        guardarEstadoAnterior();
        contenido.insert(posicion, texto);
    }

   
    public void eliminar(int inicio, int fin) {
        if (!esRangoValido(inicio, fin)) return;
        guardarEstadoAnterior();
        contenido.delete(inicio, fin);
    }

    
    public void reemplazar(int inicio, int fin, String texto) {
        if (!esRangoValido(inicio, fin) || texto == null) return;
        guardarEstadoAnterior();
        contenido.replace(inicio, fin, texto);
    }

   
    public void deshacer() {
        if (anterior != null) {
            contenido = new StringBuilder(anterior.toString());
            anterior = null; 
        }
    }

   
    public String obtenerTexto() {
        return contenido.toString();
    }
}