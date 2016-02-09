package steno

/**
  * Created by ted on 2016-02-08.
  */
class Translation(entry: String, format: DictionaryFormat.Value)  {
  val raw = if (format == DictionaryFormat.JSON) {
    "convention"
  } else if (format == DictionaryFormat.RTF) {
    "convention"
  }
}
