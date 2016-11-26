package com.wangwenjun.chapter2

/** *************************************
  *
  * @author:Alex Wang
  * @Date:2016 /11/22
  *            QQ:532500648
  *            QQ交流群:286081824
  ***************************************/
object ArrayInAction {

  def main(args: Array[String]): Unit = {

    val greetingString: Array[String] = new Array[String](3)
    greetingString.update(0, "Hello")
    greetingString.update(1, "World")
    greetingString.update(2, "Scala")

    greetingString.update(1, "Java")
    /*
        greetingString.foreach((v: String) => println(v))
        greetingString.foreach(v => println(v))
        greetingString.foreach(println)
    */

    for (i <- 0 to (greetingString.length - 1))
      println(greetingString.apply(i))

    ArrayInAction.echo("Hello Scala")
    ArrayInAction echo "Hello Scala"


    greetingString(0)="Hello"
    greetingString(1)="World"
    greetingString(2)="Scala"
    println (greetingString(0))
    println (greetingString(1))
    println (greetingString(2))

    Array(1,2,3)
  }

  def echo(msg: String): Unit = {
    println(msg)
  }
}
