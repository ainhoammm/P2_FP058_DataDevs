public abstract class Cliente {

    public abstract String tipoCliente();

    public abstract float calcAnual();

    public abstract float descuentoEnv();

}

    private String nombre;
    private String domicilio;
    private String nif;

    public Cliente(String nombre, String domicilio, String nif){
        this.nombre =  nombre;
        this.domicilio = domicilio;
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", nif='" + nif + '\'' +
                '}';
    }

