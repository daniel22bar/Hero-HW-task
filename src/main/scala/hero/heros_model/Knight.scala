package hero.heros_model

import hero.util.RandomUtil
import hero.weapon_model.{Sword, WeaponStrategy}

case class Knight(var hp:Int,var power:Int) extends Hero{
  val weaponStrategy: WeaponStrategy = new Sword(this)
  override def kick(defender: Hero): Unit = weaponStrategy.cick(defender)
}

object Knight{
  def apply():Hero = new Knight(RandomUtil.getNumberBetween(2,12),
    RandomUtil.getNumberBetween(2,12))
}
