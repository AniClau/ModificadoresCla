public class avion extends medioDeTransporte {
    private int numeroMotores;
    private String tipoAvion;
    private Boolean pilotoAutomatico;
    private int altitudMaxima;

    public avion(String marca, int capPasajeros, String modoTransporte, String velocidad,int numeroMotores, String tipoAvion, Boolean pilotoAutomatico, int altitudMaxima) {
        super(marca, capPasajeros, modoTransporte, velocidad);
        this.numeroMotores = numeroMotores;
        this.tipoAvion = tipoAvion;
        this.pilotoAutomatico = pilotoAutomatico;
        this.altitudMaxima = altitudMaxima;
        }

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    public String getTipoAvion() {
        return tipoAvion;
    }

    public void setTipoAvion(String tipoAvion) {
        this.tipoAvion = tipoAvion;
    }

    public Boolean getPilotoAutomatico() {
        return pilotoAutomatico;
    }

    public void setPilotoAutomatico(Boolean pilotoAutomatico) {
        this.pilotoAutomatico = pilotoAutomatico;
    }

    public int getAltitudMaxima() {
        return altitudMaxima;
    }

    public void setAltitudMaxima(int altitudMaxima) {
        this.altitudMaxima = altitudMaxima;
    }

    @Override
    public String toString() {
        return super.toString() + "avion [numeroMotores=" + numeroMotores + ", tipoAvion=" + tipoAvion + ", pilotoAutomatico="
                + pilotoAutomatico + ", altitudMaxima=" + altitudMaxima + "]";
    }

    
}
