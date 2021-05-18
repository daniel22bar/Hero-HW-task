package hero.heros_model

import hero.util.RandomUtil
import hero.weapon_model.{Sword, WeaponStrategy}

case class King(var hp:Int,var power:Int) extends  Hero{
  val weaponStrategy: WeaponStrategy = new Sword(this)
  override def kick(defender: Hero): Unit = weaponStrategy.cick(defender)
}
object King{
  def apply():Hero = new King(RandomUtil.getNumberBetween(5,15),
                              RandomUtil.getNumberBetween(5,15))
}
