public class Pedido {
    public  boolean  pedidoEnviado();
    public  float precioEnvio();




}
    private int id;
    private String cliente;
    private String artículo;
    private int unidades;
    private timestamp fecha;


    public Pedido(int id, String cliente, String artículo,int unidades,timestamp fecha){
        this.id =  id;
        this.cliente = cliente;
        this.artículo = artículo;
        this.artículo = unidades;
        this.artículo = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getArtículo() {
        return artículo;
    }

    public void setArtículo(String artículo) {
        this.artículo = artículo;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public timestamp getFecha() {
        return fecha;
    }

    public void setFecha(timestamp fecha) {
        this.fecha = fecha;
    }
    @java.lang.Override
    public java.lang.String toString() {
        return "Pedido{" +
                "id=" + id +
                ", cliente='" + cliente + '\'' +
                ", artículo='" + artículo + '\'' +
                ", unidades=" + unidades +
                ", fecha=" + fecha +
                '}';
    }