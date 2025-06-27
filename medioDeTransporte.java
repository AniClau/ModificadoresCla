public class medioDeTransporte {
    private String marca;
    private int capPasajeros;
    private String modoTransporte;
    private String velocidad;

    public medioDeTransporte(String marca, int capPasajeros, String modoTransporte, String velocidad) {
        this.marca = marca;
        this.capPasajeros = capPasajeros;
        this.modoTransporte = modoTransporte;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapPasajeros() {
        return capPasajeros;
    }

    public void setCapPasajeros(int capPasajeros) {
        this.capPasajeros = capPasajeros;
    }

    public String getModoTransporte() {
        return modoTransporte;
    }

    public void setModoTransporte(String modoTransporte) {
        this.modoTransporte = modoTransporte;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "MedioDeTransporte [marca=" + marca + ", capPasajeros=" + capPasajeros +
                ", modoTransporte=" + modoTransporte + ", velocidad=" + velocidad + "]";
    }
}