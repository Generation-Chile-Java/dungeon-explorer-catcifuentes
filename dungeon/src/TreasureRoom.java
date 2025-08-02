public class TreasureRoom implements Room {
    private final String description;
    private final GameObject treasure;
    private boolean treasureTaken;

    public TreasureRoom(String description, GameObject treasure) {
        this.description = description;
        this.treasure = treasure;
        this.treasureTaken = false;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void enter(Player player) {
        System.out.println("Entras en: " + description);

        if (!treasureTaken) {
            System.out.println("¡Hay un tesoro aquí! (" + treasure.getName() + ")");
            treasure.interact(player);
            treasureTaken = true;
        } else {
            System.out.println("Esta sala ya ha sido saqueada.");
        }
    }
}
