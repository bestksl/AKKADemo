package ActorsDemo

import akka.actor.{Actor, ActorRef}

/**
  * @author HaoxuanLi  Github:bestksl
  * @version created date：2019-12-07 22:18
  */
class Actor1(another: ActorRef) extends Actor {
  var count = 0

  override def receive: Receive = {
    case "start" =>
      println("开始...")
      self ! "我打"
    case "我打" =>
      count += 1
      println("Actor1: 我打第 " + count + " 次")
      another ! "我打"
  }
}
