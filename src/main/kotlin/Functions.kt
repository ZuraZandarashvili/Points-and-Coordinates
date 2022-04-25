import kotlin.math.pow
import kotlin.math.sqrt

fun equals(p1: Point, p2:Point):String{
    return if (p1.calcDist() > p2.calcDist())
        "$p1 > $p2"
    else if (p1.calcDist() < p2.calcDist())
        "$p1 < $p2"
    else
        "$p1 = $p2"
}

fun distBetweenPoints(p1: Point, p2: Point): Double {
    return sqrt((p1.x - p2.x).pow(2.0) + (p1.y - p2.y).pow(2.0))
}