package com.wangwenjun.chapter2

import java.io.File

import scala.io.Source

/** *************************************
  *
  * @author:Alex Wang
  * @Date:2016 /11/26
  *            QQ:532500648
  *            QQ交流群:286081824
  ***************************************/
object SourceInAction extends App {
  val file: File = new File("C:\\Users\\wangwenjun\\IdeaProjects\\scalaInAction\\src\\com\\wangwenjun\\chapter2\\SourceInAction.scala")
  Source.fromFile(file).getLines.foreach(println)

}
