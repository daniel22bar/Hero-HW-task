package task

case class MessageQuoter(message: String) extends Quoter {
  override def printMessage: Unit = println(message)
}
