package com.knoldus

class Sum {
  def sumOfSquare(a: Int, b: Int): Int = a * a + b * b
  def sumOfCubes(a: Int, b: Int): Int = a * a * a + b * b * b
  def sumOfInts(a: Int, b: Int): Int = a + b

  def sum(f: (Int, Int) => Int, first: Int, second: Int): Int = f(first, second)

}
  object Sum {
    def main(args: Array[String]): Unit = {


      val a=new Sum()
      println(a.sum(a.sumOfSquare, 8, 5))
      println(a.sum(a.sumOfCubes, 9, 3))
      println(a.sum(a.sumOfInts, 1,9))



    }

  }



