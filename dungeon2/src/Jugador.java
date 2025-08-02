import java.util.ArrayList;
import java.util.List;

// Clase Jugador

public class Jugador {
    private final String nombre;
    private int vitalidad;
    private final List<String> mochila;

    public Jugador(String nombre, int vitalidadInicial) {
        this.nombre = nombre;
        this.vitalidad = vitalidadInicial;
        this.mochila = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getVitalidad() {
        return vitalidad;
    }

    public void afectarVitalidad(int cambio) {
        vitalidad += cambio;
        if (vitalidad < 0) vitalidad = 0;
    }

    public void agregarAMochila(String item) {
        mochila.add(item);
    }

    public List<String> getMochila() {
        return mochila;
    }

    public boolean estaVivo() {
        return vitalidad > 0;
    }

    public void mostrarEstado() {
        System.out.println("\n=== ESTADO ===");
        System.out.println("Jugador: " + nombre);
        System.out.println("Vitalidad: " + vitalidad);
        System.out.println("Mochila:");
        if (mochila.isEmpty()) {
            System.out.println("   (vacía)");
        } else {
            for (String item : mochila) {
                System.out.println("   - " + item);
            }
        }
    }
}