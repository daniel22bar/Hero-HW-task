package task

object Main {
  def main(args: Array[String]): Unit = {
    val randomQuoter = RandomQuoter
    randomQuoter.printMessage
    val messageQuoter = new MessageQuoter("message quoter")
    messageQuoter.printMessage
    val shakespearQuoter = new ShakespearQuoter("my message")
    shakespearQuoter.printMessage
    println("________________print QuoterAggregator______________")
    QuoterAggregator.addQuoteToList(RandomQuoter)
    QuoterAggregator.addQuoteToList(MessageQuoter("message quoter"))
    QuoterAggregator.addQuoteToList(new ShakespearQuoter)
    QuoterAggregator.printAllQuotes
  }
}
