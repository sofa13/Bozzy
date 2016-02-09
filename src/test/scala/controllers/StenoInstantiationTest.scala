package controllers

import java.security.InvalidParameterException

import org.scalatest._
import steno.{DictionaryEntry, DictionaryFormat, StenoDictionary}

/**
  * Created by ted on 2016-02-08.
  */
class StenoInstantiationTest extends FlatSpec with Matchers {
  "The Entry class" should "load a simple RTF translation" in {
    val entry = new DictionaryEntry("{\\*\\cxs KOPB/SREPBGS}convention", DictionaryFormat.RTF)
    entry.stroke.raw should equal ("KOPB/SREPBGS")
    entry.translation.raw should equal ("convention")
    }
  "The Entry class" should "load a simple JSON translation" in {
    val entry = new DictionaryEntry("\"KOPB/SREPBGS\": \"convention\",", DictionaryFormat.RTF)
    entry.stroke.raw should equal ("KOPB/SREPBGS")
    entry.translation.raw should equal ("convention")
  }
}
