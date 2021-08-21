object Solution {
    def curry[A, B, C](f: (A, B) => C): A => (B => C) = {
        (a: A) => (b: B) => f(a, b)
    }

    def concat(a: String, b: String): String = {
        a + b
    }

    def addAndStringify(a: Int, b: Int): String = {
        (a + b).toString()
    }

    def main(args: Array[String]): Unit = {
        println("Currying concat with a, b should return ab, got %s".format(curry(concat)("a")("b")))
        println("Currying addAndStringify with 1, 3 should return 3, got %s".format(curry(addAndStringify)(1)(2)))
    }
}
