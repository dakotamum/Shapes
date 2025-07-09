package shapes

class Square(p1: Point, val width: Double) : Rectangle(p1, Point(p1.x + width, p1.y + width))
{
    init
    {
        require(width != 0.0) {"Square cannot have an area of zero"}
        require(width > 0.0) {"Square side length must be greater than zero"}
    }

    override fun getArea() : Double
    {
        return width * width
    }
}
