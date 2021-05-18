package task

object QuoterAggregator {
  private var list: List[Quoter] = List()

  def addQuoteToList(quoter: Quoter) = list = quoter :: list

  def printAllQuotes: Unit = list.foreach(_.printMessage)
}
