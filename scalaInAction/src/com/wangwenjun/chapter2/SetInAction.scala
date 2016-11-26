package com.wangwenjun.chapter2

/** *************************************
  *
  * @author:Alex Wang
  * @Date:2016 /11/26
  *            QQ:532500648
  *            QQ交流群:286081824
  * **************************************/
object SetInAction extends App {

  import scala.collection.mutable.Set

  val set: Set[String] = Set("Hello", "World")
  println(set)
  println(set hashCode)
  println(set.hashCode())

  set += "Scala"
  set.+=("Java")
  println(set)
  println(set hashCode)
  set.foreach(println)
}