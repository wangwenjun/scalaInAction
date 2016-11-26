package com.wangwenjun.chapter2

/** *************************************
  *
  * @author:Alex Wang
  * @Date:2016 /11/26
  *            QQ:532500648
  *            QQ交流群:286081824
  ***************************************/
object TupleInAction extends App {

  val tuple: (Int, Char, String) = (123, 'X', "Hello")
  println(tuple._1)
  println(tuple._2)
  println(tuple._3)
}
