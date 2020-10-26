fun main () {

    val f1 = Fraction(5F, 15F)

    val f2 = Fraction(7F, 28F)

    println(f1.bowl(f2))
    println(f1.multiplied(f2))
    println(f1.shortened())
    println(f2.shortened())
}
class Fraction(n: Float, d:Float) {

    private var numerator: Float = n
    private var denominator: Float = d

    override fun toString(): String {
        return "$numerator/$denominator"
    }

    fun bowl(fraction: Fraction): Fraction {
        val den = denominator * fraction.denominator
        val num1 = den / denominator * numerator
        val num2 = den / fraction.denominator * fraction.numerator
        return Fraction(num1 + num2, den)
    }

    fun multiplied(fraction: Fraction): Fraction {
        val multipleNum = numerator * fraction.numerator
        val multipleDen = denominator * fraction.denominator
        return Fraction(multipleNum, multipleDen)
    }

    fun shortened() {
        var shortNum = numerator
        var shortDen = denominator
        while (shortNum != 0F && shortDen != 0F) {
            if (shortNum < shortDen) {
                shortDen = shortDen % shortNum
            } else {
                shortNum = shortNum % shortDen
            }
        }
    }
}