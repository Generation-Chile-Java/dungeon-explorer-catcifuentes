public class CorazonDelSer implements EtapaDelViaje {
    @Override
    public String getNombre() {
        return "El Corazón del Ser";
    }

    @Override
    public void explorar(Jugador jugador) {
        System.out.println("¡Aquí hay un brillo cálido! (Esencia de Vitalidad Pura (+50)) ¡" + jugador.getNombre());
        System.out.println("se abraza a sí mismo/a y se siente completamente renovado/a!");
        jugador.afectarVitalidad(50);
        System.out.println("\n¡Felicidades! Has completado tu viaje interior y has descubierto quién eres.");
    }
}