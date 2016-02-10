package steno

/**
  * Created by ted on 2016-02-08.
  */
class Translation(entry: String, format: DictionaryFormat.Value)  {
  val raw = if (format == DictionaryFormat.JSON) {
    val stroke = """"([^"]+)": "(.*)",?\w*$""".r
    entry match {
      case stroke(rawStroke, rawTranslation) => rawTranslation
    }
  } else if (format == DictionaryFormat.RTF) {
    val stroke = """\{\\\*\\cxs ([^}]+)\}([^{]+).*$""".r
    entry match {
      case stroke(rawStroke, rawTranslation) => rawTranslation
    }
  }
}
