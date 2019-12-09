package ActorsDemo

import akka.actor.{ActorSystem, Props}

/**
  * @author HaoxuanLi  Github:bestksl
  * @version created date：2019-12-07 22:18
  */
object App extends App {
  private val sf = ActorSystem("InteractSystem")
  private val actor2Ref = sf.actorOf(Props[Actor2])
  private val actor1Ref = sf.actorOf(Props(new Actor1(actor2Ref)))

    actor1Ref ! "start"
}
