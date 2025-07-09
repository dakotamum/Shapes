package shapes

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

import java.lang.IllegalArgumentException

class SquareTest {

    var point1 = Point(0.0, 0.0)

    @Test
    fun testInvalidConstruction() {
        assertFailsWith<IllegalArgumentException>
        {
            Square(point1, 0.0)
        }
        assertFailsWith<IllegalArgumentException>
        {
            Square(point1, -1.0)
        }
    }

    var square = Square(point1, 5.0)

    @Test
    fun testCtor() {
        val (a, b) = square.points

        assertEquals(a.x, 0.0)
        assertEquals(a.y, 0.0)
        assertEquals(b.x, 5.0)
        assertEquals(b.y, 5.0)
    }

    @Test
    fun testArea() {
        assertEquals(square.getArea(), 25.0)
    }
}
