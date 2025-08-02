// Sala vacía
public class EmptyRoom implements Room {
    private final String description;

    public EmptyRoom(String description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void enter(Player player) {
        System.out.println("Entras en: " + description);
        System.out.println("No hay nada interesante aquí...");
    }
}

// Sala con tesoro

// Sala con enemigo

