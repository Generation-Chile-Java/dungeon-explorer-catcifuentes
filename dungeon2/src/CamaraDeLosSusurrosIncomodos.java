public class CamaraDeLosSusurrosIncomodos implements EtapaDelViaje {
    private final EncuentroSignificativo susurro;

    public CamaraDeLosSusurrosIncomodos() {
        this.susurro = new SusurroIncomodo();
    }

    @Override
    public String getNombre() {
        return "La Cámara de los Susurros Incómodos";
    }

    @Override
    public void explorar(Jugador jugador) {
        System.out.println("¡Un " + susurro.getNombre() + " te ataca!");
        susurro.enfrentar(jugador);
    }
}