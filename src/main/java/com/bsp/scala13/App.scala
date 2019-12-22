package com.bsp.scala13

import cats.Apply

object App {

  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3)
    println(list.map(_ + 1))

    println(list.size)

    Apply
  }
}
