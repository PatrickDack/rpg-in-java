package classes;

public class Sorcerer extends Character{
  int hpIncrement;
  int mpIncrement;
  int atkIncrement;
  int defIncrement;
  int mAtkIncrement;
  int mDefIncrement;

  public Sorcerer(String name, Ability ability) {
    super(name, ability);
    this.setStr(5);
    this.setWise(10);

    this.hpIncrement = this.getStr() * 4;
    this.mpIncrement = this.getWise() * 3;
    this.atkIncrement = this.getStr() * 5;
    this.defIncrement = this.getStr() * 3;
    this.mAtkIncrement = this.getWise() * 5;
    this.mDefIncrement = this.getWise() * 3;

    this.setHp(this.getHp() + hpIncrement);
    this.setMp(this.getMp() + mpIncrement);
    this.setAtk(this.getAtk() + atkIncrement);
    this.setDef(this.getDef() + defIncrement);
    this.setmAtk(this.getmAtk() + mAtkIncrement);
    this.setMdef(this.getMdef() + mDefIncrement);
    this.incrementAbility(this.getWise());

  }
}
