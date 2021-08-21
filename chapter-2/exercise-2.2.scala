object Solution {
    def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
        as.sliding(2).find((a: Array[A]) => !ordered(a(0), a(1))).isEmpty
    }

    def isGreater(a: Int, b: Int): Boolean = {
        a > b
    }

    def isLonger(a: String, b: String): Boolean = {
        a.length() > b.length()
    }

    def main(args: Array[String]): Unit = {
        println("isSorted([1, 1, 1], isGreater) should be false, is %b".format(isSorted(Array(1, 1, 1), isGreater)))
        println("isSorted([1, 2, 3], isGreater) should be false, is %b".format(isSorted(Array(1, 2, 3), isGreater)))
        println("isSorted([3, 2, 1], isGreater) should be true, is %b".format(isSorted(Array(3, 2, 1), isGreater)))
        println("isSorted([3, 1, 3], isGreater) should be false, is %b".format(isSorted(Array(3, 1, 3), isGreater)))
        println("isSorted([a, a, a], isLonger) should be false, is %b".format(isSorted(Array("a", "a", "a"), isLonger)))
        println("isSorted([a, ab, a], isLonger) should be false, is %b".format(isSorted(Array("a", "ab", "a"), isLonger)))
        println("isSorted([abc, ab, a], isLonger) should be true, is %b".format(isSorted(Array("abc", "ab", "a"), isLonger)))
    }
}
