package shapes

class Point(var x: Double, var y: Double) : Movable
{
    override fun move(dx: Double, dy: Double)
    {
        x += dx
        y += dy
    }
    fun clone(): Point = Point(x, y)
}
