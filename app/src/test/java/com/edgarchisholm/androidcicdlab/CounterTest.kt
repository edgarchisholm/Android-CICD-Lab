package com.edgarchisholm.androidcicdlab

import org.junit.Assert.assertEquals
import org.junit.Test

class CounterTest {
    @Test
    fun incrementAddsOne() {
        assertEquals(1, increment(0))
        assertEquals(8, increment(7))
    }
}
