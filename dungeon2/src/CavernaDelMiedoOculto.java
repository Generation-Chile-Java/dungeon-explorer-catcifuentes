public class CavernaDelMiedoOculto implements EtapaDelViaje {
    private final EncuentroSignificativo miedo;

    public CavernaDelMiedoOculto() {
        this.miedo = new MiedoOculto();
    }

    @Override
    public String getNombre() {
        return "La Caverna del Miedo Oculto";
    }

    @Override
    public void explorar(Jugador jugador) {
        System.out.println("¡Un " + miedo.getNombre() + " te ataca! ¡");
        miedo.enfrentar(jugador);
    }
}