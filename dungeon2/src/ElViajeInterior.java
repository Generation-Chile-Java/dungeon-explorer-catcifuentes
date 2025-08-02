import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElViajeInterior {
    private final Jugador jugador;
    private final List<EtapaDelViaje> etapas;
    private int etapaActual;

    public ElViajeInterior() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Mmm? ¿Qué haces aquí?");
        System.out.println("Solo un alma curiosa llega a tocar esta puerta…");
        System.out.print("¿Cuál es tu nombre, pequeño/a viajero/a? Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        this.jugador = new Jugador(nombre, 100);
        this.etapas = crearEtapas();
        this.etapaActual = 0;

        System.out.println("¡Hola, " + nombre + "! Tu misión es explorar todos los rincones de este lugar,");
        System.out.println("solo así podrás regresar... No existen muchos valientes que lo hayan logrado,");
        System.out.println("dicen que es un viaje al interior, un reflejo que no muchos desean mirar.");
        System.out.println("¿Estás lista/o para emprender tu aventura?");
    }

    private List<EtapaDelViaje> crearEtapas() {
        List<EtapaDelViaje> viaje = new ArrayList<>();
        viaje.add(new UmbralDeLaMemoria());
        viaje.add(new SalaDelAnheloOlvidado());
        viaje.add(new CamaraDeLosSusurrosIncomodos());
        viaje.add(new RinconDeLaFortalezaInterior());
        viaje.add(new ClaustroDeLasDudasHeladas());
        viaje.add(new SenderoDelSilencioReflexivo());
        viaje.add(new CavernaDelMiedoOculto());
        viaje.add(new CorazonDelSer());
        return viaje;
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);

        while (jugador.estaVivo() && etapaActual < etapas.size()) {
            jugador.mostrarEstado();

            System.out.println("\n---");
            EtapaDelViaje etapa = etapas.get(etapaActual);
            System.out.println("Entras en: " + etapa.getNombre());
            etapa.explorar(jugador);

            if (!jugador.estaVivo()) {
                System.out.println("\nTu viaje ha terminado antes de tiempo...");
                break;
            }

            if (etapaActual < etapas.size() - 1) {
                System.out.println("\n*¿Qué deseas hacer?");
                System.out.println("1. Continuar la travesía");
                System.out.println("2. Dejar de jugar");

                int opcion = scanner.nextInt();
                if (opcion == 1) {
                    etapaActual++;
                } else {
                    System.out.println("Decides interrumpir tu viaje...");
                    break;
                }
            } else {
                break; // Fin del viaje
            }
        }
        // Resumen final
        System.out.println("\n=== RESUMEN FINAL ===");
        jugador.mostrarEstado();
        System.out.println("Rincones explorados: " + (etapaActual + 1) + "/" + etapas.size());
        System.out.println("\n¡Gracias por jugar a El Viaje Interior!");
    }

    public static void main(String[] args) {
        ElViajeInterior juego = new ElViajeInterior();
        juego.jugar();
    }
}