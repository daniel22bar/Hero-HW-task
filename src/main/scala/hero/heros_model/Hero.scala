package hero.heros_model

trait Hero{
  var power:Int
  var hp:Int
  def kick(defender: Hero): Unit
  def isAlive(): Boolean = hp > 0
}
