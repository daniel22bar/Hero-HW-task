package hero

import hero.util.{GameManager, HeroFactory}

object Start {
  def main(args: Array[String]): Unit = {
    GameManager.fight(HeroFactory.getRandomHero(),HeroFactory.getRandomHero())
  }
}
