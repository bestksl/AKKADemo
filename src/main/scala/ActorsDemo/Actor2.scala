package ActorsDemo

import akka.actor.Actor

/**
  * @author HaoxuanLi  Github:bestksl
  * @version created date：2019-12-07 22:18
  */
class Actor2 extends Actor {
  var count = 0

  override def receive: Receive = {
    case "我打" =>
      println(sender().toString() + " 等着 我打回去!")
      Thread.sleep(3000)
      count += 1
      println("我反击第 " + count + " 次")
      sender() ! "我打"
  }
}
