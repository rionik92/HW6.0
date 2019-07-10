public class Warrior extends Player implements SuperAbulity {
    private int typeHit;

    public Warrior(int health, int damage, int typeHit) {
        super.setHealth(health);
        super.setDamage(damage);
        this.typeHit = typeHit;
    }

    public void printInfo() {
        System.out.println("WARRIOR" + " Health: " + super.getHealth() + " Damage: "
                + super.getDamage() + " Type Defence: " + typeHit);
    }

    @Override
    public void addSuperAbulity() {
        System.out.println("Критический удар Война");
    }
}
