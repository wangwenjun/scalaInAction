package com.wangwenjun.chapter2

/** *************************************
  *
  * @author:Alex Wang
  * @Date:2016 /11/22
  *            QQ:532500648
  *            QQ交流群:286081824
  * **************************************/
object ListInAction extends App {

  val list1: List[Int] = List(1, 2, 3)

  list1.foreach(println)
  val list2: List[Int] = list1.updated(1, 100)
  println("==============")
  list2.foreach(println)

  println(list1(1))

  val list3: List[Int] = List(1, 2, 3)

  val list4: List[Int] = List(4, 5, 6)

  val joinedList: List[Int] = list3 ::: list4

  println(joinedList)

  val list5: List[Int] = 8 :: list3

  val list6: List[Int] = list3.::(8)

  println(list5)
  println(list6)

  //(lua nil=null=NULL)
  //  val list7 = Nil.::(1).::(2).::(3)
  val list7 = 1 :: 2 :: 3 :: Nil
  println(list7)
}
