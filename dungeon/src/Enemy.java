public class Enemy implements GameObject {
    private final String name;
    private final int health;
    private final int damage;

    public Enemy(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void interact(Player player) {
        // Simulamos un combate simple
        System.out.println("¡" + name + " te ataca!");
        player.takeDamage(damage);

        if (player.isAlive()) {
            System.out.println("¡Contraatacas y derrotas al " + name + "!");
        }
    }}