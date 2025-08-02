// Tesoro (poción de salud)
public class HealthPotion implements GameObject {
    private final int healingAmount;

    public HealthPotion(int healingAmount) {
        this.healingAmount = healingAmount;
    }

    @Override
    public String getName() {
        return "Poción de Salud (+" + healingAmount + " HP)";
    }

    @Override
    public void interact(Player player) {
        player.heal(healingAmount);
    }
}

// Tesoro (arma)


// Enemigo
