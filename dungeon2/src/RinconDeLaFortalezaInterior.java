public class RinconDeLaFortalezaInterior implements EtapaDelViaje {
    @Override
    public String getNombre() {
        return "El Rincón de la Fortaleza Interior";
    }

    @Override
    public void explorar(Jugador jugador) {
        System.out.println("¡Hay un brillo cálido aquí! (Pluma de Acero del Valor (+15)) ¡Has encontrado");
        System.out.println("tu Pluma de Acero del Valor (+15)! No permites que esos pensamientos dominen");
        System.out.println("tu mente y decisión. Sabes que de todas esas experiencias haz aprendido");
        System.out.println("algo que te hizo más fuerte.");
        jugador.agregarAMochila("Pluma de Acero del Valor (+15)");
    }
}
