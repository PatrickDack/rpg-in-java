import classes.*;

public class App {
    public static void main(String[] args) {
      Ability megaPunch = new Ability("Mega Punch", 35, 20);
      Warrior tyr = new Warrior("Tyr", megaPunch);

      tyr.showCharacterStatus();

      Ability miasma = new Ability("Miasma", 20, 12);
      Warrior orc = new Warrior("Orc Leader", miasma);

      tyr.attack(true, orc);

    }
}
