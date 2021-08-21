object Solution {
    def compose[A, B, C](f: B => C, g: A => B): A => C = {
        (a: A) => f(g(a))
    }

    def doubleAndStringify(a: Integer): String = {
        (2*a).toString()
    }

    def concatA(a: String): String = {
        a + "A"
    }

    def main(args: Array[String]): Unit = {
        println("composing doubleAndStringify,concatA with 6 should return 12A, got %s".format(compose(concatA, doubleAndStringify)(6)))
    }
}
