package hero.util

import hero.heros_model._

object HeroFactory {
  var list:List[() => Hero] = List(()=>Elf(),()=>Hobbit(),()=>King(),()=>Knight())

  def getRandomHero():Hero = list(RandomUtil.getNumberBetween(0,list.length)).apply()
}
