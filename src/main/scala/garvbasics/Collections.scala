package garvbasics

object Collections extends App {

  //sorted
  //sortWith

  val nums = Seq(9, 5, 10, 3, 2)

  println(nums.sorted) //List(2, 3, 5, 9, 10)

  val cities = Seq(("Chennai", "Tamil nadu"), ("Bengaluru", "Karnataka"), ("Mumbai", "Maharastra"))

  println(cities.sorted)//List((Bengaluru,Karnataka), (Chennai,Tamilnadu), (Mumbai,Maharastra))

  //sort based on desc order of state length
  println(cities.sortWith(_._2.length > _._2.length))//List((Chennai,Tamil nadu), (Mumbai,Maharastra), (Bengaluru,Karnataka))

}
