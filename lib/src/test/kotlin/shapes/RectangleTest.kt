package shapes

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

import java.lang.IllegalArgumentException

class RectangleTest {

    var point1 = Point(0.0, 0.0)
    var point2 = Point(2.0, 3.5)

    @Test
    fun testInvalidConstruction() {
        assertFailsWith<IllegalArgumentException>
        {
            Rectangle(point1, point1)
        }
    }

    var rect = Rectangle(point1, point2)

    @Test
    fun testCtor() {
        val (a, b) = rect.points

        assertEquals(a.x, 0.0)
        assertEquals(a.y, 0.0)
        assertEquals(b.x, 2.0)
        assertEquals(b.y, 3.5)
    }

    @Test
    fun testArea() {
        assertEquals(rect.getArea(), 7.0)
    }
}
