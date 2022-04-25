import kotlin.math.sqrt

class Point(var x:Double= 0.0,var y:Double= 0.0){
    override fun toString() : String{
        return "($x, $y)"
    }
    fun calcDist():Double{
        return sqrt(x*x + y*y)

    }
    fun sym(): String{

        if (x != 0.0)
            x *= -1
        if (y != 0.0)
            y *= -1

        return "($x, $y)"
    }
    override fun equals(other: Any?): Boolean {
        if (other is Point){
            return true
        }
        return false
    }
}