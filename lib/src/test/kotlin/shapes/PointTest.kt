package shapes

import kotlin.test.Test
import kotlin.test.assertEquals

class PointTest {
    @Test
    fun testCtor() {
        val point = Point(1.0, 2.5)
        assertEquals(point.getX(), 1.0)
        assertEquals(point.getY(), 2.5)
    }

    @Test
    fun testMove() {
        val point = Point(1.0, 2.5)
        assertEquals(point.getX(), 1.0)
        assertEquals(point.getY(), 2.5)
        point.move(4.5, 8.0)
        assertEquals(point.getX(), 5.5)
        assertEquals(point.getY(), 10.5)
    }

    @Test
    fun testClone() {
        val point = Point(1.0, 2.5)
        val copy = point.clone()
        assertEquals(copy.getX(), 1.0)
        assertEquals(copy.getY(), 2.5)
    }
}
