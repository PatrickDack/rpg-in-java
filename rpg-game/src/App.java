import classes.*;

public class App {
    public static void main(String[] args) {
      Ability megaPunch = new Ability("megaPunch", 35);

      Warrior tyr = new Warrior("Tyr", megaPunch);

      tyr.showCharacterStatus();

      // tyr.attack(false);


    }
}
