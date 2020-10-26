fun main()
{
    var x = Point(X = 2f, Y = 3f)


    var y = Point(X = 3f, Y = 4f)
    println(x == y)
    x.gadaaadgiletX(10f)
    println(x)


}

class Point(X: Float, Y: Float) {
    var X: Float = X
    var Y: Float = Y

    fun gadaaadgiletX(e: Float) {
        var k: Float = X + e
        this.X = k
        println("X-IS GADAYVANISAS MIVIGBT: $k,$Y")
    }

    fun gadaaadgiletY(e: Float) {
        var k: Float = this.Y + e
        this.Y = k
        println("Y-is gadaaadgilebisas mivigebt: $X $k")
    }


    override fun toString(): String {
        return "$X $Y"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Point) {
            if (X == other.X && Y == other.Y) {
                return true
            }
        }
        return false
    }
}

