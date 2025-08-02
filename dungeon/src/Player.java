import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int health;
    private final List<GameObject> inventory;

    // Encapsulación: atributos privados con métodos públicos
    public Player(String name, int initialHealth) {
        this.name = name;
        this.health = initialHealth;
        this.inventory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
        System.out.println(name + " recibe " + damage + " puntos de daño!");
    }

    public void heal(int amount) {
        health += amount;
        System.out.println(name + " recupera " + amount + " puntos de salud!");
    }

    public void addToInventory(GameObject item) {
        inventory.add(item);
        System.out.println("¡Has obtenido: " + item.getName() + "!");
    }

    public void showStatus() {
        System.out.println("\n=== ESTADO ===");
        System.out.println("Jugador: " + name);
        System.out.println("Salud: " + health);
        System.out.println("Inventario:");
        if (inventory.isEmpty()) {
            System.out.println("  (vacío)");
        } else {
            for (GameObject item : inventory) {
                System.out.println("  - " + item.getName());
            }
        }
    }

    public boolean isAlive() {
        return health > 0;
    }
}