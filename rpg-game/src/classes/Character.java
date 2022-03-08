package classes;

abstract class Character {
  private String name;
  private int level = 1;
  private int hp = 100;
  private int mp = 100;
  private int str;
  private int wise;
  private int atk = 10;
  private int mAtk = 10;
  private int def = 10;
  private int mdef = 10;
  private Ability ability;

  public String getName() {
    return name;
  }

  public int getAtk() {
    return atk;
  }

  public void setAtk(int atk) {
    this.atk = atk;
  }

  public int getmAtk() {
    return mAtk;
  }

  public void setmAtk(int mAtk) {
    this.mAtk = mAtk;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public int getMp() {
    return mp;
  }

  public void setMp(int mp) {
    this.mp = mp;
  }

  public int getStr() {
    return str;
  }

  public void setStr(int str) {
    this.str = str;
  }

  public int getWise() {
    return wise;
  }

  public void setWise(int wise) {
    this.wise = wise;
  }

  public int getDef() {
    return def;
  }

  public void setDef(int def) {
    this.def = def;
  }

  public int getMdef() {
    return mdef;
  }

  public void setMdef(int mdef) {
    this.mdef = mdef;
  }

  public Ability getAbility() {
    return ability;
  }

  public void setAbility(Ability ability) {
    this.ability = ability;
  }

  public void incrementAbility(int str) {
    int increment = str * 5;
    this.getAbility().setDamage(this.getAbility().getDamage() + increment);
  }

  protected Character(String name, Ability ability) {
    this.setName(name);
    this.setAbility(ability);
  }

  public boolean manaVerifyer() {
    return this.getAbility().getManaCost() < this.getMp();
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

  abstract void attack(Character foe);
  abstract void attack(boolean ability, Character foe);
}
