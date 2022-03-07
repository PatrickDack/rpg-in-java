package classes;

import java.lang.reflect.Constructor;

public class Warrior extends Character {

  Warrior(String name, Ability ability) {
    super(name, ability);
  }

  public void attack(boolean ability) {
    // int damage = ability ? this.getDamage() : 10;

    // if (ability) {
    //   System.out.printf("%s%n","Você está dando mais trabalho do que eu imaginava...");
    //   System.out.printf("Receba meu melhor golpe %s%n", this.getAbilityName());
    // } else {
    //   System.out.printf("Posso resolver isso apenas com um ataque normal%n");
    // }

    // this.setHp(this.getHp() - damage);

  }

}
