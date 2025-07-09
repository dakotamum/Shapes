package shapes

abstract class Shape(val points: MutableList<Point>) : Movable
{
    abstract fun getArea() : Double
    override fun move(dx: Double, dy: Double)
    {
        points.forEach{it.move(dx, dy)}
    }
}
