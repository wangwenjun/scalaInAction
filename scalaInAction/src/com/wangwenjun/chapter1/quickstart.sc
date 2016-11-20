//两者完全等价
val i = 10
val i1: Int = 10
var i2: Int = 20
i2 = 30

val message = "Hello World"
val message1: String = "Hello World"
val message2: java.lang.String = "Hello World"

val message3: String = "Hello World"

def max(x: Int, y: Int): Int = {
  if (x > y) return x
  else return y
}

def max2(x: Int, y: Int) = if (x > y) x else y

def simpleMax(x: Int, y: Int) = if (x > y) x else y


def returnAnyType(x: Int): Any = {
  if (x > 0)
    x
  else
    "I am a String"
}


def greeting(): Unit = println("Hello")


def returnAny(x: Int) = {
  if (x > 0)
    x * 10
  else
    "I am a text"
}
