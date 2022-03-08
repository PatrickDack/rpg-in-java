package classes;

public class Ability {
  private String abilityName;
  private int damage;
  private int manaCost;

  public String getAbilityName() {
    return abilityName;
  }

  public void setAbilityName(String abilityName) {
    this.abilityName = abilityName;
  }

  public int getDamage() {
    return damage;
  }

  public void setDamage(int damage) {
    this.damage = damage;
  }

  public int getManaCost() {
    return manaCost;
  }

  public void setManaCost(int manaCost) {
    this.manaCost = manaCost;
  }

  public Ability(String abilityName, int damage, int manaCost) {
    this.setAbilityName(abilityName);
    this.setDamage(damage);
    this.setManaCost(manaCost);
  }

}
