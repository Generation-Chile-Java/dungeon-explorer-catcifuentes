public class SalaDelAnheloOlvidado implements EtapaDelViaje {
    @Override
    public String getNombre() {
        return "La Sala del Anhelo Olvidado";
    }

    @Override
    public void explorar(Jugador jugador) {
        System.out.println("¡Hay un brillo cálido aquí! Te alberga un pensamiento que creías olvidado.");
        System.out.println("Un deseo profundo que albergabas hace mucho. Has tomado la iniciativa de iniciar");
        System.out.println("un poderoso viaje, tu corazón se siente reconfortado, haz permitido escucharte a ti mismo/a");
        System.out.println("(Esencia de Vitalidad (+30)) ¡" + jugador.getNombre() + " se ha movilizado por el deseo");
        System.out.println("de la aventura y se siente un poco más fuerte!");
        jugador.afectarVitalidad(30);
    }
}