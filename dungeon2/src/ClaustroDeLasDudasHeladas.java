public class ClaustroDeLasDudasHeladas implements EtapaDelViaje {
    private final EncuentroSignificativo duda;

    public ClaustroDeLasDudasHeladas() {
        this.duda = new DudaHelada();
    }

    @Override
    public String getNombre() {
        return "El Claustro de las Dudas Heladas";
    }

    @Override
    public void explorar(Jugador jugador) {
        System.out.println("¡Una " + duda.getNombre() + " te ataca! ");
        duda.enfrentar(jugador);
    }
}