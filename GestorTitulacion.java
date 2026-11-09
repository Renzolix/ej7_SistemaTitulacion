public class GestorTitulacion {
    private VerificadorTitulacion verificador = new VerificadorTitulacion();

    public void procesarTitulo(int creditos) throws RequisitosTitulacionException {
        try {
            verificador.validarCreditos(creditos);
        } catch (RequisitosTitulacionException e) {
            System.out.println("[AUDITORÍA INTERNA] Evento registrado: " + e.getMessage());
            throw e; // Re-lanzamiento hacia la capa superior
        }
    }

    public static void main(String[] args) {
        GestorTitulacion gestor = new GestorTitulacion();

        try {
            System.out.println("Procesando título para estudiante con 150 créditos...");
            gestor.procesarTitulo(150);
        } catch (RequisitosTitulacionException e) {
            System.err.println("[CAPA USUARIO] Error en la titulación: " + e.getMessage());
        }
    }
}