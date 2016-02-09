/**
  * Created by ian on 1/25/2016.
  */


import javafx.{ fxml => jfxFxml
              , event => jfxEvent
              }

import steno.StenoDictionary

import scalafx.application.Platform


class HelloController {

  @jfxFxml.FXML
  private def handleButtonPress(event: jfxEvent.ActionEvent): Unit = {
    println("Hellooooo")
  }

  @jfxFxml.FXML
  private def handleExit(event: jfxEvent.ActionEvent): Unit = {
    Platform.exit()
  }

  @jfxFxml.FXML
  private def handleReadButton(event: jfxEvent.ActionEvent): Unit = {
  }

}


