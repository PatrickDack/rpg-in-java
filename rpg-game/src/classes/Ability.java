package classes;

public class Ability {
  private String abilityName;
  private int damage;

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

  public void setAbility(String abilityName, int damage) {
    this.setAbilityName(abilityName);
    this.setDamage(damage);
  }

}
