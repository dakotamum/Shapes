package shapes

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNull

import java.lang.IllegalArgumentException

class LineTest {

    var point1 = Point(1.0, 2.5)
    var point2 = Point(2.0, 3.5)

    @Test
    fun testInvalidConstruction() {
        assertFailsWith<IllegalArgumentException>
        {
            Line(point1, point1)
        }
    }

    var line = Line(point1, point2)

    @Test
    fun testCtor() {
        val (a, b) = line.points

        assertEquals(a.x, 1.0)
        assertEquals(a.y, 2.5)
        assertEquals(b.x, 2.0)
        assertEquals(b.y, 3.5)
    }

    @Test
    fun testMove() {
        line.move(4.5, 8.0)
        val (a, b) = line.points
        assertEquals(a.x, 5.5)
        assertEquals(a.y, 10.5)
        assertEquals(b.x, 6.5)
        assertEquals(b.y, 11.5)
    }

    @Test
    fun testNullSlope() {
        point1 = Point(0.0, 0.0)
        point2 = Point(0.0, 1.0)
        line = Line(point1, point2)
        assertNull(line.getSlope(), "Expected a null slope")
    }

    @Test
    fun testValidSlope() {
        point1 = Point(0.0, 0.0)
        point2 = Point(2.0, 1.0)
        line = Line(point1, point2)
        assertEquals(line.getSlope(), 0.5)
    }
}
