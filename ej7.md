# Ejercicio 7: SistemaTitulacion

## Explicación Lógica
1. **Re-lanzamiento (`re-throw`):** La capa intermedia `GestorTitulacion` captura `RequisitosTitulacionException`, registra una entrada en el log/auditoría local y la vuelve a lanzar mediante `throw e;`.
2. **Doble Propósito:** Permite responder a la falla en la capa actual (registrando métricas) sin privar a las capas superiores de enterarse de la excepción.