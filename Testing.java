public class Testing {
    public static void main(String[] args) {

        medioDeTransporte unTransporte = new medioDeTransporte("Genérica", 5, "Terrestre", "60 km/h");
        unTransporte.setMarca("GenéricaX");
        unTransporte.setCapPasajeros(7);
        unTransporte.setModoTransporte("Anfibio");
        unTransporte.setVelocidad("80 km/h");

        
        avion miAvion = new avion("Boeing",180,"Aéreo","850 km/h", 2,"Comercial",true,12000);
        miAvion.setNumeroMotores(4);
        miAvion.setPilotoAutomatico(true);
        miAvion.setTipoAvion("Carga pesada");
        miAvion.setAltitudMaxima(13000);


       
        autobus miAutobus = new autobus( "Scania",50,"Terrestre","90 km/h","Urbana","Diésel", 2,true);
        miAutobus.setTipoRuta("Local");
        miAutobus.setTipoCombustible("Diesel");
        miAutobus.setNumeroPuertas(3);
        miAutobus.setTieneWifi(false);

        System.out.println("El medio de transporte");
        System.out.println(unTransporte.toString());
        
        System.out.println("AVIÓN");
        System.out.println(miAvion.toString());

        System.out.println("AUTOBÚS");
        System.out.println(miAutobus.toString());
    }
}


