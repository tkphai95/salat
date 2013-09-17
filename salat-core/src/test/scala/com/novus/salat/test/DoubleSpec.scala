package com.novus.salat.test

import com.novus.salat._
import com.novus.salat.test.global._
import com.novus.salat.test.model._
import com.mongodb.casbah.Imports._

class DoubleSpec extends SalatSpec {
  "Salat" should {
    "deserialize an int to a double and an option double" in {
      grater[DoubleTest].asObject(DBObject("d" -> 9, "d2" -> 9)) must_== DoubleTest(9d, Option(9d))
    }
  }
}