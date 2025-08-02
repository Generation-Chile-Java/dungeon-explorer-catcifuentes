
public class MiedoOculto implements EncuentroSignificativo {
    @Override
    public String getNombre() {
        return "Miedo Oculto";
    }

    @Override
    public void enfrentar(Jugador jugador) {
        System.out.println("En el camino de la introspección encuentras un miedo que no sabías");
        System.out.println("que cargabas dentro de tí. Es poderoso y te debilita, pero");
        System.out.println("¡Una vez lo miras a los ojos y lo transformas en valentía!");
        System.out.println("¡" + jugador.getNombre() + " se asusta y pierde 25 puntos de vitalidad!");
        jugador.afectarVitalidad(-25);
        System.out.println("¡Has domado el Miedo Oculto!");
    }
}