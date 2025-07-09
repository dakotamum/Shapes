package shapes

import kotlin.test.Test
import kotlin.test.assertEquals

class PointTest {
    @Test
    fun testCtor() {
        val point = Point(1.0, 2.5)
        assertEquals(point.x, 1.0)
        assertEquals(point.y, 2.5)
    }

    @Test
    fun testMove() {
        val point = Point(1.0, 2.5)
        assertEquals(point.x, 1.0)
        assertEquals(point.y, 2.5)
        point.move(4.5, 8.0)
        assertEquals(point.x, 5.5)
        assertEquals(point.y, 10.5)
    }

    @Test
    fun testClone() {
        val point = Point(1.0, 2.5)
        val copy = point.clone()
        assertEquals(copy.x, 1.0)
        assertEquals(copy.y, 2.5)
    }
}
