 object Person {
    def name(n: String): Unit = {
      val name: String = n
      println("hello, my name is " + name)
    }

   def hungry(bool: Boolean): Unit = {
     println(bool)
   }

   def happy(int: Int): Unit = {
     var num: Int = int
     num = 10
     println("my happiness is " + int)
   }

   def loops(): Unit = {
     for (n <- 1 to 5){
       if (n == 2 || n == 4) {
         println("hi i want this many guacs" + n)
       }
     }
   }

   def wloops(): Unit = {
     var i: Int = 0
     while(i < 10) {
       println("no")
       i += 1
     }
   }

    def main(args: Array[String]): Unit = {
      val str = new String ("hello")
      name("Joe")
      hungry(true)
      happy(10)
      loops()
      wloops()
    }
  }

