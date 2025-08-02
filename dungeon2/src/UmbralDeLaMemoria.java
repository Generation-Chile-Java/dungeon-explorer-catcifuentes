// Etapas del viaje
public class UmbralDeLaMemoria implements EtapaDelViaje {
    @Override
    public String getNombre() {
        return "El Umbral de la memoria";
    }

    @Override
    public void explorar(Jugador jugador) {
        System.out.println("Al parecer no hay nada, excepto el viento. Parece que en esta sala se murmuran");
        System.out.println("recuerdos antiguos que aún no puedes descifrar...");
    }
}






