import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss(1000, 50, 1);
        boss.changeBossDefence();
        boss.printInfo();
        Warrior warrior = new Warrior(300, 25, 1);
        warrior.printInfo();
        warrior.addSuperAbulity();
        Magical magical = new Magical(200, 25, 2);
        magical.printInfo();
        magical.addSuperAbulity();
        Mental mental = new Mental(250,25,3);
        mental.printInfo();
        mental.addSuperAbulity();


    }
}
