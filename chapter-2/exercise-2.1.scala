object Solution {
    def fib(n: Int): Int = {
        @annotation.tailrec
        def go(n: Int, prev: Int, acc: Int): Int = {
            if (n == 1) {
                prev
            } else if (n == 2) {
                acc
            } else {
                go(n-1, acc, prev + acc)
            }
        }
        go(n, 0, 1)
    }

    def main(args: Array[String]): Unit = {
        println("fib(1) should equal 0, is %d".format(fib(1)))
        println("fib(2) should equal 1, is %d".format(fib(2)))
        println("fib(3) should equal 1, is %d".format(fib(3)))
        println("fib(4) should equal 2, is %d".format(fib(4)))
        println("fib(5) should equal 3, is %d".format(fib(5)))
        println("fib(6) should equal 5, is %d".format(fib(6)))
    }
}
