public class Weapon implements GameObject {
    private final String weaponName;
    private final int damageBonus;

    public Weapon(String weaponName, int damageBonus) {
        this.weaponName = weaponName;
        this.damageBonus = damageBonus;
    }

    @Override
    public String getName() {
        return weaponName + " (+" + damageBonus + " ATQ)";
    }

    @Override
    public void interact(Player player) {
        player.addToInventory(this);
        // En un juego más complejo, aquí equiparías el arma
    }
}