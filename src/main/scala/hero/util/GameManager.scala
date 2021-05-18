package hero.util

import hero.heros_model.Hero

object GameManager {
  def fight(hero: Hero,hero1: Hero):Unit = {
    println(s"the fighters are ${hero.getClass.getSimpleName} & ${hero1.getClass.getSimpleName}")
    heroStatus(hero)
    heroStatus(hero1)
    while (hero.isAlive() && hero1.isAlive()){
      println(s"${hero.getClass.getSimpleName} cick ${hero1.getClass.getSimpleName}")
      hero.kick(hero1)
      heroStatus(hero1)
      println(s"${hero1.getClass.getSimpleName} cick ${hero.getClass.getSimpleName}")
      hero1.kick(hero)
      heroStatus(hero)
    }
    if(hero.isAlive())
      println(s"${hero.getClass.getSimpleName} WIN!!!")
    else
      println(s"${hero1.getClass.getSimpleName} WIN!!!")
  }
  private def heroStatus(hero: Hero):Unit = {
    println(s"${hero.getClass.getSimpleName} have hp of: ${hero.hp} & power of : ${hero.power}")
  }
}
