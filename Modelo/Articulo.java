public class Articulo {
}
    private int id ();
    private String descripción();
    private float pvp();
    private float gastos envío();
    private int preparación();

    public Articulo(int id, String descripción, float pvp, float gastos, de envío, int preparación) {
        this.id = id;
        this.descripción = descripción;
        this.pvp = pvp;
        this.gastos = gastos;
        this.envío = envío;
        this.preparación = preparación;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public float getPvp() {
        return pvp;
    }

    public void setPvp(float pvp) {
        this.pvp = pvp;
    }

    public float getGastos() {
        return gastos;
    }

    public void setGastos(float gastos) {
        this.gastos = gastos;
    }

    public de getEnvío() {
        return envío;
    }

    public void setEnvío(de envío) {
        this.envío = envío;
    }

    public int getPreparación() {
        return preparación;
    }

    public void setPreparación(int preparación) {
        this.preparación = preparación;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Articulo{" +
                "id=" + id +
                ", descripción='" + descripción + '\'' +
                ", pvp=" + pvp +
                ", gastos=" + gastos +
                ", envío=" + envío +
                ", preparación=" + preparación +
                '}';
    }
