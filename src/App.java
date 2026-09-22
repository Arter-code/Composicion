public class App {
    public static void main(String[] args) throws Exception {

        Vuelo vuelo = new Vuelo("Bogota", "Medellin", 5, "AV123");

        vuelo.monstrarInfo();

        System.out.println();

        vuelo.mostrarAsientos();

        System.out.println();

        vuelo.embarcar("A1");
        vuelo.embarcar("A3");
        vuelo.embarcar("A1");

        System.out.println();

        vuelo.mostrarAsientos();

        System.out.println();

        vuelo.desembarcar("A1");

        System.out.println();
        
        vuelo.mostrarAsientos();
    }
}
