public class Vuelo {
    private String numero;
    private String origen;
    private String destino;
    private int capacidadMaxima;
    private Asiento[] asientos; //el vuelo crea y posee los asientos
    public Vuelo(){
    }
    public Vuelo(String numero, String origen, String destino){
        this.numero=numero;
        this.origen=origen;
        this.destino=destino;
    }
    public Vuelo(String destino,String origen,int capacidadMaxima,String numero){
        this.destino=destino;
        this.origen=origen;
        this.numero=numero;

        asientos= new Asiento[capacidadMaxima];
        for (int i = 0; i < capacidadMaxima; i++) {
            asientos[i]= new Asiento("A"+(i+1));
        }
    }
    public String getNumero(){
        return numero;
    }
    public String getOrigen(){
        return origen;
    }
    public String getDestino(){
        return destino;
    }
    public void setNumero(String numero){
        this.numero=numero;
    }
    public void setDestino (String destino){
        this.destino=destino;
    }
    public void setOrigen (String origen){
        this.origen=origen;
    }
    public void monstrarInfo(){
        System.out.println("----- Vuelo "+numero+" -----");
        System.out.println("Ruta: "+origen+" -> "+destino);
        System.out.println("Capacidad: "+ capacidadMaxima+" asientos");
    }

    public void mostrarAsientos(){
        System.out.println("Estado de asientos - Vuelo"+numero+": ");
        for(Asiento a : asientos){
            a.mostrarEstado();
        }
    }

    public void embarcar(String codigoAsiento){
        for (Asiento a: asientos){
            if(a.getCodigo().equals(codigoAsiento)){
                a.ocupar();
                return;
            }
        }
    }

    public void desembarcar(String codigoAsiento){
        for (Asiento a : asientos){
            if(a.getCodigo().equals(codigoAsiento)){
                a.liberar();
                return;
            }
        }
        System.out.println("Asiento "+codigoAsiento+"no encontrado en vuelo"+numero+".");
    }
}
