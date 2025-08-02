public class EnemyRoom implements Room {
    private final String description;
    private final GameObject enemy;
    private boolean enemyDefeated;

    public EnemyRoom(String description, GameObject enemy) {
        this.description = description;
        this.enemy = enemy;
        this.enemyDefeated = false;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void enter(Player player) {
        System.out.println("Entras en: " + description);

        if (!enemyDefeated) {
            System.out.println("¡Un " + enemy.getName() + " te ataca!");
            enemy.interact(player);
            if (player.isAlive()) {
                enemyDefeated = true;
                System.out.println("¡Has derrotado al " + enemy.getName() + "!");
            }
        } else {
            System.out.println("El cadáver del " + enemy.getName() + " yace en el suelo.");
        }
    }}