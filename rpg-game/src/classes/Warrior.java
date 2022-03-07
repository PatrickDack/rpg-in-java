package classes;

public class Warrior extends Character {

  int hpIncrement;
  int mpIncrement;
  int atkIncrement;
  int defIncrement;
  int mAtkIncrement;
  int mDefIncrement;

  public Warrior(String name, Ability ability) {
    super(name, ability);
    this.setStr(10);
    this.setWise(5);

    this.hpIncrement = this.getStr() * 5;
    this.mpIncrement = this.getWise() * 2;
    this.atkIncrement = this.getStr() * 5;
    this.defIncrement = this.getStr() * 3;
    this.mAtkIncrement = this.getWise() * 5;
    this.mDefIncrement = this.getWise() * 3;

    this.setHp(this.getHp() + hpIncrement);
    this.setAtk(this.getAtk() + atkIncrement);
    this.setDef(this.getDef() + defIncrement);
    this.setmAtk(this.getmAtk() + mAtkIncrement);
    this.setMdef(this.getMdef() + mDefIncrement);
    this.incrementAbility(this.getStr());

  }

  @Override
  public void attack(boolean ability, Character foe) {
    int attackPower = ability ? this.getAbility().getDamage() : this.getAtk();
    int damage = attackPower - foe.getDef();

    foe.setHp(foe.getHp() - damage);

    if (ability) {
      System.out.printf("%s atacou %s com %s%n", this.getName(), foe.getName(), this.getAbility().getAbilityName());
      System.out.printf("Ataque causou %d de dano%n", damage);
    } else {
      System.out.printf("%s atacou %s%n", this.getName(), foe.getName());
      System.out.printf("Ataque causou %d de dano%n", damage);
    }

    System.out.printf("O HP de %s foi reduzido para %d", foe.getName(), foe.getHp());
  }

  public void showCharacterStatus() {
    System.out.printf("%s status%n", this.getName());
    System.out.println();
    System.out.printf("%-15s%d%n", "LEVEL", this.getLevel());
    System.out.printf("%-15s%d%n", "HP", this.getHp());
    System.out.printf("%-15s%d%n", "MP", this.getMp());
    System.out.printf("%-15s%d%n", "ATK", this.getAtk());
    System.out.printf("%-15s%d%n", "DEF", this.getDef());
    System.out.printf("%-15s%d%n", "MATK", this.getmAtk());
    System.out.printf("%-15s%d%n", "MDEF", this.getMdef());
    System.out.printf("%-15s%d%n", "STR", this.getStr());
    System.out.printf("%-15s%d%n", "WISE", this.getWise());
  }

}
