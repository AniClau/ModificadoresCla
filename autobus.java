public class autobus extends medioDeTransporte {
    private String tipoRuta;
    private String tipoCombustible;
    private int numeroPuertas;
    private boolean tieneWifi;

    public autobus(String marca, int capPasajeros, String modoTransporte, String velocidad,String tipoRuta, String tipoCombustible, int numeroPuertas, boolean tieneWifi) {
        super(marca, capPasajeros, modoTransporte, velocidad);
        this.tipoRuta = tipoRuta;
        this.tipoCombustible = tipoCombustible;
        this.numeroPuertas = numeroPuertas;
        this.tieneWifi = tieneWifi;
    }

    public String getTipoRuta() {
        return tipoRuta;
    }

    public void setTipoRuta(String tipoRuta) {
        this.tipoRuta = tipoRuta;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public boolean isTieneWifi() {
        return tieneWifi;
    }

    public void setTieneWifi(boolean tieneWifi) {
        this.tieneWifi = tieneWifi;
    }

    @Override
    public String toString() {
        return super.toString() + ", Autobus [tipoRuta=" + tipoRuta +", tipoCombustible=" + tipoCombustible +", numeroPuertas=" + numeroPuertas +", tieneWifi=" + tieneWifi + "]";
    }
}
