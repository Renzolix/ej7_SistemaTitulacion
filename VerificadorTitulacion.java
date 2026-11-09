public class VerificadorTitulacion {
    public void validarCreditos(int creditosObtenidos) throws RequisitosTitulacionException {
        if (creditosObtenidos < 200) {
            throw new RequisitosTitulacionException("Créditos insuficientes para graduación. Requeridos: 200, Obtenidos: " + creditosObtenidos);
        }
        System.out.println("Créditos validados correctamente.");
    }
}