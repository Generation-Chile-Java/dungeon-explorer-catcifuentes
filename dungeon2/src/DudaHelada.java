
public class DudaHelada implements EncuentroSignificativo {
    @Override
    public String getNombre() {
        return "Duda Helada";
    }

    @Override
    public void enfrentar(Jugador jugador) {
        System.out.println("La duda te visita como pensamiento recurrente. No sabes si el camino");
        System.out.println("elegido es el mejor para tí.");
        System.out.println("¡" + jugador.getNombre() + " siente un escalofrío y pierde 15 puntos de vitalidad!");
        System.out.println("¡Pero logras derretir la duda con tus nuevos pensamientos y la superas!");
        jugador.afectarVitalidad(-15);
        System.out.println("¡Has superado la Duda Helada!");
    }
}
