package ru.makssieve.wariors.models

class Stat (value: Int, maxVal: Int) {

  def decrease(value: Int): Stat =  {
    val newVal = this.value - value
    new Stat(if (newVal > 0) newVal else 0, maxVal)
  }

  def increase(value: Int): Stat
}
