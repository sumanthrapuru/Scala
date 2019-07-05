package helloscala.chap2_prelude

import java.io.{FileNotFoundException, IOException}

object Hello extends App{
  println("Hello, World!")
  //everything is object in scala
  val a = "foo"
  val b = "foo"

  println(a == b)//true

  case class CC(name: String)

  val c = CC("test1")
  val c2 = CC("test2")
  println(c == c2)// true can use == on CC

  //if expression
  val bvalue = true
  val v = if(bvalue) 3 else 5
  //match expression

  1 match {
    case 1 =>
    case 2 =>
    case _ =>
  }
  true match {
    case true =>
    case false =>
  }
  def matchArg(arg: Any) = arg match {
    case i: Int =>
    case b: Boolean =>
    case l: List[_] =>
    case _ =>
  }

  try {
    throw new FileNotFoundException();
  } catch {
    case fnf: FileNotFoundException =>
    case ioe: IOException =>
  }
  // for loop
  for {i <- 0 to 10 by 2} print(i+" ")//0 2 4 6 8 10

  // add yield to get for expressions
  val list = List("apple", "orange", "banana")

  println(for{f <- list if f.length > 5} yield f)//List(orange, banana)

}
