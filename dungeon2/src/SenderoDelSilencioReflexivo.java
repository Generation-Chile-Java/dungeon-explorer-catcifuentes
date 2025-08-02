public class SenderoDelSilencioReflexivo implements EtapaDelViaje {
    @Override
    public String getNombre() {
        return "El Sendero del Silencio Reflexivo";
    }

    @Override
    public void explorar(Jugador jugador) {
        System.out.println("Solo el eco de tus pasos te acompaña... aquí el camino es claro y su calma");
        System.out.println("te acompaña. No hay nada más que aprender por ahora, y eso está bien.");
    }
}
