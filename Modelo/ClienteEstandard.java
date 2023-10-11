public class ClienteEstandard extends Cliente {

    public ClienteEstandard(String nombre, String domicilio, String nif) {
        super(nombre, domicilio, nif);
        // Constructor de ClienteEstandard
    }

    @Override
    public String tipoCliente() {
        return "Cliente Estándard";
    }

    @Override
    public float calcAnual() {
        // Aquí implementa el cálculo anual específico para ClienteEstandard
        return 0.0f;
    }

    @Override
    public float descuentoEnv() {
        // Aquí implementa el cálculo de descuento de envío específico para ClienteEstandard
        return 0.0f;
    }
}


