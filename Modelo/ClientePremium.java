public class ClientePremium extends Cliente {

    public ClientePremium(String nombre, String domicilio, String nif) {
        super(nombre, domicilio, nif);
        // Constructor de ClientePremium
    }

    @Override
    public String tipoCliente() {
        return "Cliente Premium";
    }

    @Override
    public float calcAnual() {
        // Aquí implementa el cálculo anual específico para ClientePremium
        return 0.0f;
    }

    @Override
    public float descuentoEnv() {
        // Aquí implementa el cálculo de descuento de envío específico para ClientePremium
        return 0.0f;
    }
}

