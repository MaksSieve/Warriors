package ru.makssieve.wariors.models

sealed trait Actions
final case class Attack(damage: Int, )