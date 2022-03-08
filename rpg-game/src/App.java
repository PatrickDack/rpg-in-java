import classes.*;

public class App {
    public static void main(String[] args) {
      Ability megaPunch = new Ability("Mega Punch", 35, 20);
      Warrior tyr = new Warrior("Tyr", megaPunch);

      Ability iceOrb = new Ability("Ice Orb", 50, 10);
      Sorcerer tamis = new Sorcerer("Tamis", iceOrb);

      tamis.showCharacterStatus();
      tyr.showCharacterStatus();

      Ability miasma = new Ability("Miasma", 20, 12);
      Warrior orc = new Warrior("Orc Leader", miasma);

      tyr.attack(megaPunch, orc);
      tamis.attack(iceOrb, orc);

    }
}
