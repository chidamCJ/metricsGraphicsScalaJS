package mg.wrapper

import org.scalajs.dom.document
import charts._
import scala.scalajs.js

object MGWrapper {

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
        "area"       -> true,
        "data"       -> data,
        "width"      -> 650,
        "height"     -> 200,
        "target"     -> document.getElementById("chart"),
        "x_accessor" -> "over",
        "y_accessor" -> "score"
      )
    )
  }
}
