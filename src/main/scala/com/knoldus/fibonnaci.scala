package com.knoldus

class fibonnaci {

  def fibonnaci(position: Int): Int = {
    def fib(position: Int, first: Int, second: Int): Int = {
        print(first)
      if (position <= 1) {
        return second
      }
      else{
      fib(position - 1, second, first+second)


    }

    }
    fib(position,0,1)

  }
}
  object fibonnaci{
    def main(args: Array[String]) = {
val a=new fibonnaci
       print(a.fibonnaci(7))
    }
  }


