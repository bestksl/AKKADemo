package ActorFirstDemo

import akka.actor.{Actor, ActorRef, ActorSystem, Props}

/**
  * @author HaoxuanLi  Github:bestksl
  * @version created date：2019-12-07 20:14
  */
class FirstAKKA extends Actor {


  override def receive: Receive = {
    case "hello" => println("hello" + 666)
    case 6 => context.stop(self)
      context.system.terminate()
    case b: Int => println(b + 777)
    case _ => println("shayemeiyou")
  }
}

object FirstAKKADemp {
  val actorFactory = ActorSystem("firstActorSystem")
  private val actorRef1: ActorRef = actorFactory.actorOf(Props[FirstAKKA], "actRef1")

  def main(args: Array[String]): Unit = {
    actorRef1 ! "hello"
    actorRef1 ! 6

  }
}