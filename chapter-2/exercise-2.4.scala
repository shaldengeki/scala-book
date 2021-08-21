object Solution {
    def uncurry[A, B, C](f: A => B => C): (A, B) => C = {
        (a: A, b: B) => f(a)(b)
    }

    def addAndStringify(a: Integer): Integer => String = {
        (b: Integer) => (a + b).toString
    }

    def concat(a: String): String => String = {
        (b: String) => a + b
    }

    def main(args: Array[String]): Unit = {
        println("Uncurrying concat with a, b should return ab, got %s".format(uncurry(concat)("a", "b")))
        println("Uncurrying addAndStringify with 1, 2 should return 3, got %s".format(uncurry(addAndStringify)(1, 2)))
    }
}
