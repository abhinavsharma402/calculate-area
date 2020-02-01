package com.knoldus

class CalculateArea {


  def area(shape: String, first: Int, second: Int, f: (Int, Int) => Int): String = {
    shape match {
      case "rectangle" => s"Area of rectangle is ${f(first, second)}"

      case "rhombus" => s"Area of rhombus is ${f(first, second)}"

      case "parrellogram" => s"Area of parrelloogram is ${f(first, second)}"

      case _ => "invalid shape"
    }
  }
}
object CalculateArea {

  def main(args: Array[String]) {
    val findArea = new CalculateArea()

    println(findArea.area("rectangle", 5, 6, (length, breadth) => length * breadth))
    println(findArea.area("rhombus", 9, 8, (diagonal1, diagonal2) => diagonal1 * diagonal2))
   println( findArea.area("parrellogram", 7, 6, (base, height) => base * height))
  }
}


