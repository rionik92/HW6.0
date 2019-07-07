public class Magical extends Player{
    private int typeHit;

    public Magical(int health, int damage, int typeHit) {
        super.setHealth(health);
        super.setDamage(damage);
        this.typeHit = typeHit;
    }
    public void printInfo(){
        System.out.println("MAGICAL" + " Health: " + super.getHealth() + " Damage: "
                + super.getDamage() + " Type Defence: " + typeHit);
    }
}
