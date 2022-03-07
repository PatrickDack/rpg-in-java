package classes;

abstract class Character {
  private String name;
  private int level;
  private int hp;
  private int mp;
  private int str;
  private int _int;
  private int def;
  private int mdef;
  private Ability ability;

  public String getName() {
    return name;
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

  public int get_int() {
    return _int;
  }

  public void set_int(int _int) {
    this._int = _int;
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

  Character(String name, Ability ability) {
    this.setName(name);
    this.ability = ability;
    this.level = 1;
  }

  abstract void attack(boolean ability);
}
