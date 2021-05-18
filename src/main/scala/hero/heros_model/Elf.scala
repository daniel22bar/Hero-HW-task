package hero.heros_model

case class Elf(var hp:Int ,var power:Int) extends Hero {
  override def kick(defender: Hero): Unit = {
    if(defender.power < power)
      defender.hp = 0
    else
      defender.power = defender.power - 1
  }

}

object Elf{
  def apply() = new Elf(10,10)
}
