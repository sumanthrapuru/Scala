package garvbasics

object Functions extends App{

  //functions reduces side effects(modify variable)
  //a function does return a value (that's it)

  //pure functions
  //  referentially trasparent(exp return same result when provided the same arguments)
  //  with out side effects

  case class Book(name: String, score: Double)

  def recommedBook(book: Book) = println(s"our recommended book is ${book.name}")

  def compareBooks(book1: Book, book2: Book) =
    if (book1.score > book2.score) recommedBook(book1) else recommedBook(book2)

  val book1 = Book("Prog in scala", 4.1)
  val book2 = Book("Fun Prog in scala", 4.4)
  val book3 = Book("Scala for Impatient", 4.2)

  compareBooks(book1, book2)

  //problems
  //1. returns Unit
  //2. producing side effect

  def compareBooks2(book1: Book, book2: Book) =
    if (book1.score > book2.score) book1 else book2

  recommedBook(Seq(book1, book2, book3) reduceLeft compareBooks2)



}
