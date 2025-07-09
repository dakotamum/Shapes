package shapes

class Point(private var m_x: Double, private var m_y: Double) : Movable
{
    fun getX(): Double = m_x
    fun getY(): Double = m_y
    override fun move(dx: Double, dy: Double)
    {
        m_x += dx
        m_y += dy
    }
    fun clone(): Point = Point(m_x, m_y)
}
