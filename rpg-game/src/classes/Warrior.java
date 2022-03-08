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
  public void attack(Character foe) {
    int attackPower = this.getAtk();
    int damage = attackPower - foe.getDef();

    foe.setHp(foe.getHp() - damage);

    System.out.printf("%s atacou %s%n", this.getName(), foe.getName());
    System.out.printf("Ataque causou %d de dano%n", damage);

    System.out.printf("O HP de %s foi reduzido para %d", foe.getName(), foe.getHp());
  }

  @Override
  public void attack(boolean ability, Character foe) {
    int attackPower = this.getAbility().getDamage();
    int damage = attackPower - foe.getDef();

    if (this.manaVerifyer()) {
      this.setMp(this.getMp() - this.getAbility().getManaCost());
      foe.setHp(foe.getHp() - damage);

      System.out.printf("%s atacou %s com %s%n", this.getName(), foe.getName(), this.getAbility().getAbilityName());
      System.out.printf("Ataque causou %d de dano%n", damage);
      System.out.printf("O HP de %s foi reduzido para %d", foe.getName(), foe.getHp());
    } else {
      System.out.printf("%s", "Sem mana suficiente");
    }

  }

}
