package com.example

import com.example.data.model.AttendanceConstants
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test

class ExampleRobolectricTest {

  @Test
  fun testRemajaDataLoaded() {
    val remajaList = AttendanceConstants.REMAJA_DATA
    assertNotNull(remajaList)
    assertEquals(43, remajaList.size)
  }

  @Test
  fun testDisplayNames() {
    assertEquals("REMAJA", AttendanceConstants.DISPLAY_NAMES["REMAJA"])
    assertEquals("TON I", AttendanceConstants.DISPLAY_NAMES["TON I"])
  }
}
