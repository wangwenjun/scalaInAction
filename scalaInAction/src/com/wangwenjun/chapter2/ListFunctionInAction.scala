package com.wangwenjun.chapter2

/** *************************************
  *
  * @author:Alex Wang
  * @Date:2016 /11/22
  *            QQ:532500648
  *            QQ交流群:286081824
  * **************************************/
object ListFunctionInAction extends App {

  val l1 = List()
  val l2 = Nil

  println(l1)
  println(l2)
  println("===============")

  val l3 = 1 :: 2 :: 3 :: Nil
  println(l3)
  println("========::=======")

  val l4 = l3 ::: List(5, 6, 7)
  println(l4)
  println("==========:::=====")

  println(l4(2))
  println("==========get=====")

  val count: Int = l4.count(i => i > 4)
  println("Count=>" + count)

  val l5 = l4.drop(2)
  println(l5)
  println("==========drop========")

  val l6 = l4.dropRight(2)
  println(l6)
  println("==========dropRight========")

  val exists: Boolean = l4.exists(i => i == 8)
  println(exists)
  println("==========exists========")

  val l7: List[Int] = l4.filter(i => i % 2 == 0)
  println(l7)
  println("==========filter========")

  val forall: Boolean = l4.forall(i => i > 2)
  println(forall)
  println("==========forall========")

  private val length: Int = l4.length
  println(length)

  val map: List[Int] = l4.map(i => i * 10)
  println(map)


}
