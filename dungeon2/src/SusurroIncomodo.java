public class SusurroIncomodo implements EncuentroSignificativo {
    @Override
    public String getNombre() {
        return "Susurro Incomodo";
    }

    @Override
    public void enfrentar(Jugador jugador) {
        System.out.println("Te traen recuerdos de veces en que has fallado. ¿Recuerdas esa vez en que");
        System.out.println("deseabas tanto algo, al cual le dedicaste mucho tiempo y sin embargo no lo lograste?");
        System.out.println("¡" + jugador.getNombre() + " se siente insegura y pierde 10 puntos de vitalidad!");
        System.out.println("¡Pero logras silenciar el susurro y le demuestras que no te afectará más!");
        jugador.afectarVitalidad(-10);
        System.out.println("¡Has disipado el Susurro Incomodo!");
    }
}