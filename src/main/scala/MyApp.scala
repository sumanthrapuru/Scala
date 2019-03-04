object MyApp extends  App {

 val tuple = new Tuple3(10, "sum", true)
 println(tuple._1)
 println(tuple._2)
 println(tuple._3)

 tuple.productIterator.foreach(
  i => println(i)
 )

 def add(a:Int)  (b:Int) = (c: Int) => a+b+c

 val list = List(1, 3, 6, 7)
 println(list.find(_ > 5))



 val va = List(List(1,2), List(3,4), Set(5, 6), List(List(1,2), List(3,4), Set(5, 6)))

 println(va.flatMap{
  list => list
 })

 class User(var name: String, age: Int){

 }

 val user = new User("sum", 90)
 println(user.name)
 user.name = "Reddy"

 def ms(x: => Int){
   println("ms")
  println(x)
 }

 val fun = (a:Int, b:Int) => {println("fun"); a + b}

 ms(fun(10, 20))

}
