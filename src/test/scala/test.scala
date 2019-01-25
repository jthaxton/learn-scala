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

//   var arr = Array(1,2,3,4)
//
//   var pq = collection.mutable.PriorityQueue(1,2,3,4,5,6,7,8,9,10)
//   pq.enqueue(1)
//   println("after enqueue")
//   println(pq)
//   pq.dequeue()
//   println("after dequeue1")
//   println(pq)
//   pq.dequeue()
//   println("after dequeue2")
//   println(pq)
//   pq.dequeue()
//   pq.dequeue()
//   println(pq)

   def k_least(arr: Array[Int], k: Int): Unit = {
     var pq = collection.mutable.PriorityQueue(0)
     var i: Int = 0
     while (i < arr.length) {
       if (pq.length < k ) {
         pq.enqueue(arr(i))
       } else if ((pq.length >= k) & (pq.max > arr(i))){
         pq.dequeue()
         pq.enqueue(arr(i))
       }
       i += 1
     }
     println(pq)
   }

   def wloops(): Unit = {
     var i: Int = 0
     while(i < 10) {
       println("no")
       i += 1
     }
   }

    def main(args: Array[String]): Unit = {

        k_least(Array(1,2,3,4,5), 3)
    }
  }

