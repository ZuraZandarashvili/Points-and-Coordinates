fun main(){
    val point1 = Point(3.0,4.0)
    val point2 = Point(5.0,12.0)

    println(equals(point1,point2))    // რიცხობრივი შედარება

    println("${point1.equals(point2)}")    // ტიპების შედარება

    println("P1 Symmetry:${point1.sym()},\\nP2:Symmetry${point2.sym()}")     // სიმეტრია ღერძის მიმართ

    println("Distance between 2 points is: ${distBetweenPoints(point1,point2)}")     // მანძილი ორ წერტილს შორის
}