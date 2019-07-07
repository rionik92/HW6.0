public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss(1000, 50, 1);
        boss.printInfo();
        Warrior warrior = new Warrior(300, 25, 1);
        warrior.printInfo();
        Magical magical = new Magical(200, 25, 2);
        magical.printInfo();
        Mental mental = new Mental(250,25,3);
        mental.printInfo();


    }
}
