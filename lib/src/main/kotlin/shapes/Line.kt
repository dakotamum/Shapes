package shapes

class Line(p1: Point, p2: Point) : Movable
{
    val points: List<Point>

    init {
        require(p1 != p2) {"Line cannot have a length of zero"}
        points = listOf(p1.clone(), p2.clone())
    }

    override fun move(dx: Double, dy: Double)
    {
        points.forEach{it.move(dx, dy)}
    }

    fun getSlope() : Double ?
    {
        val (a, b) = points
        val dy = b.y - a.y
        val dx = b.x - a.x
        if (dx == 0.0)
            return null
        return dy / dx
    }

    fun getLength() : Double
    {
        val (a, b) = points
        val dy = b.y - a.y
        val dx = b.x - a.x
        return kotlin.math.sqrt(dx*dx + dy*dy)
    }
}
