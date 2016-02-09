package steno

/**
  * Created by ted on 2016-02-08.
  */
class Stroke(entry: String, format: DictionaryFormat.Value)  {
  val raw = if (format == DictionaryFormat.JSON) {
    "KOPB/SREPBGS"
  } else if (format == DictionaryFormat.RTF) {
    "KOPB/SREPBGS"
  }
}
