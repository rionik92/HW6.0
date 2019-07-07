public class Mental extends Player{
    private int typeHit;

    public Mental(int health, int damage, int typeHit) {
        super.setHealth(health);
        super.setDamage(damage);
        this.typeHit = typeHit;
    }
    public void printInfo(){
        System.out.println("MENTAL " + " Health: " + super.getHealth() + " Damage: "
                + super.getDamage() + " Type Defence: " + typeHit);
    }
}
