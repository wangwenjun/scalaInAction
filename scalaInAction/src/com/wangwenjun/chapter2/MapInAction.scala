package com.wangwenjun.chapter2

/** *************************************
  *
  * @author:Alex Wang
  * @Date:2016 /11/26
  *            QQ:532500648
  *            QQ交流群:286081824
  * **************************************/
object MapInAction extends App {

  import scala.collection.mutable.Map

  val map: Map[Int, String] = Map()
  map.+=(1 -> "Scala")
  map.+=(2 -> "Hello")
  map.+=(3 -> "World")
  map.+=(4 -> "Java")

  map.foreach(item => println(item._1 + " " + item._2 + " " + item.getClass))

  val map2: Map[Int, String] = Map(
    1 -> "Scala", 2 -> "Java", 3 -> "Functional", 4 -> "Spark"
  )

  map2.foreach(item => println(item._1 + " " + item._2 + " " + item.getClass))

}
