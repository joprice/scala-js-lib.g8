package $packageName$

import scala.scalajs.js
import js.annotation.JSExport
import org.scalajs.dom

object $className$ extends js.JSApp {
  def main(): Unit = {
    val paragraph = dom.document.createElement("p")
    paragraph.innerHTML = "<strong>It works!</strong>"
    dom.document.getElementById("container").appendChild(paragraph)
  }
}

