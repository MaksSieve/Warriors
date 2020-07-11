package ru.makssieve.wariors.models

import akka.actor.typed.Behavior
import akka.actor.typed.scaladsl.Behaviors

class Warrior (name: String){

  private val hp: Stat = new Stat(max = 10)

  def apply(): Behavior[Attack] = Behaviors.receive {
    (context, message) =>
      hp.
      context.log.info(s"$name: Get ${message.damage} HP damage. Left ")
  }
}
