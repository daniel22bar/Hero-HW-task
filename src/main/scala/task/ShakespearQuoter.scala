package task


class ShakespearQuoter(var message: String = "to be or not to be") extends Quoter {
  override def printMessage: Unit = println(message);

  def init(quote: String): Unit ={
    message = quote;
    printMessage
  }
}
