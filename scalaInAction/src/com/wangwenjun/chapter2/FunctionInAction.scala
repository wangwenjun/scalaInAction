package com.wangwenjun.chapter2

import scala.collection.mutable.Map

/** *************************************
  *
  * @author:Alex Wang
  * @Date:2016 /11/26
  *            QQ:532500648
  *            QQ交流群:286081824
  * **************************************/
object FunctionInAction {

  def main(args: Array[String]): Unit = {
    val array: Array[String] = Array("Scala", "Spark", "Java", "Function")
    printArray(array)
    printArrayForEach(array)
    print(array)

    val map: Map[Int, String] = Map(
      1 -> "Scala", 2 -> "Java", 3 -> "Functional", 4 -> "Spark"
    )

    map.foreach(printMap)
  }

  def printMap(item: Tuple2[Int, String]) = println(item._1 + "<=>" + item._2)

  def printArray(array: Array[String]): Unit = {
    for (v <- array)
      println(v)
  }

  def printArrayForEach(array: Array[String]): Unit = {
    array.foreach(println)
  }

  def print(array: Array[String]) = array.foreach(println)
}