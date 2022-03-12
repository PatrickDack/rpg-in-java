package classes;

public class Weapon {
  String name;
  int atkPower;
  String description;
  String type;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAtkPower() {
    return atkPower;
  }

  public void setAtkPower(int atkPower) {
    this.atkPower = atkPower;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Weapon(String name, int atkPower) {
    this.name = name;
    this.atkPower = atkPower;
  }
}
