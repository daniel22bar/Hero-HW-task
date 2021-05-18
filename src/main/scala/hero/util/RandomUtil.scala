package hero.util

import scala.util.Random

object RandomUtil {

  val ran = new Random()
    def getNumberBetween(min:Int,max:Int):Int = {
      return ran.between(min,max)
    }
}
