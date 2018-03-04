package mg.wrapper

import org.scalajs.dom.document

import scala.scalajs.js

object MGWrapper {

  case class ChartParams(title: String)

  def write(chartParams: ChartParams) = {
    val data = js.Array(
      js.Dictionary("over" -> "1", "score" -> "12"),
      js.Dictionary("over" -> "2", "score" -> "18"),
      js.Dictionary("over" -> "3", "score" -> "12"),
      js.Dictionary("over" -> "4", "score" -> "18")
    )
    MG(
      js.Dynamic.literal(
        "title"      -> chartParams.title,
        "area"       -> false,
        "data"       -> data,
        "width"      -> 650,
        "height"     -> 250,
        "target"     -> document.getElementById("chart"),
        "x_accessor" -> "over",
        "y_accessor" -> "score"
      )
    )
  }
}
