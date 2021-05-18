package task

object RandomQuoter extends Quoter {
  val quoteFactory = new QuoteFactory();

  override def printMessage: Unit = println(quoteFactory.randomQuote())
}
