package shapes

class Rectangle(p1: Point, p2: Point) : Shape(mutableListOf(p1, p2))
{
    init {
        require(p1 != p2) {"Rectangle cannot have an area of zero"}
    }

    override fun getArea() : Double
    {
        val (a, b) = points
        return kotlin.math.abs((b.x - a.x) * (b.y - a.y))
    }
}
