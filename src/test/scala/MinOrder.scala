  object MinOrder extends Ordering[Int] {
    def compare(x:Int, y:Int) = y compare x

    val minHeap = scala.collection.mutable.PriorityQueue.empty(MinOrder)
//    minHeap: scala.collection.mutable.PriorityQueue[Int] = PriorityQueue()


    def main(args: Array[String]): Unit = {
      println(minHeap.ord)
    }

  }