package hero.weapon_model

import hero.heros_model.Hero
import hero.util.RandomUtil

class Sword(val attacker:Hero) extends WeaponStrategy {
  override def cick(defender: Hero): Unit = {
    defender.hp = defender.hp - RandomUtil.getNumberBetween(1,attacker.power)
  }
}
object Sword{
  def apply(attacker:Hero) = new Sword(attacker)
}
