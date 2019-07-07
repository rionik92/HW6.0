public class Boss extends Player{
    private int typeDefence;

    public Boss(int health, int damage, int typeDefence){
        super.setHealth(health);
        super.setDamage(damage);
        this.typeDefence = typeDefence;
    }
    public void printInfo(){
        System.out.println("BOSS   "+" Health: " +super.getHealth()+" Damage: "
                +super.getDamage()+" Type Defence: "+typeDefence);
    }
}
