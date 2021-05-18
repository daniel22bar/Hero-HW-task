package hero.heros_model

case class Hobbit(var hp:Int ,var power:Int ) extends Hero{


  def cry(): Unit = println("hhhhhhhhhhh")

  override def kick(defender: Hero): Unit = cry()
}

object Hobbit{
  def apply() = new Hobbit(3,3)

}
