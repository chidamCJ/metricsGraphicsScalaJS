package mg.wrapper

import org.scalajs.dom.document
import charts._
import scala.scalajs.js

object MGWrapper {

  def plot(chartParams: ChartParams) = {
    val data = DataSet(
      Array(
        DataRow(Array(DataColumn("over", 1), DataColumn("score", 12))),
        DataRow(Array(DataColumn("over", 2), DataColumn("score", 18))),
        DataRow(Array(DataColumn("over", 3), DataColumn("score", 2))),
        DataRow(Array(DataColumn("over", 4), DataColumn("score", 8))),
        DataRow(Array(DataColumn("over", 5), DataColumn("score", 3))),
        DataRow(Array(DataColumn("over", 6), DataColumn("score", 10))),
        DataRow(Array(DataColumn("over", 7), DataColumn("score", 12))),
        DataRow(Array(DataColumn("over", 8), DataColumn("score", 15))),
        DataRow(Array(DataColumn("over", 9), DataColumn("score", 16))),
        DataRow(Array(DataColumn("over", 10), DataColumn("score", 18))),
        DataRow(Array(DataColumn("over", 11), DataColumn("score", 18))),
        DataRow(Array(DataColumn("over", 12), DataColumn("score", 6))),
        DataRow(Array(DataColumn("over", 13), DataColumn("score", 12))),
        DataRow(Array(DataColumn("over", 14), DataColumn("score", 18)))
      )
    )
    val multiData = MultiDataSet(
      Array(
        DataSet(
          Array(
            DataRow(Array(DataColumn("over", 1), DataColumn("score", 12))),
            DataRow(Array(DataColumn("over", 2), DataColumn("score", 18))),
            DataRow(Array(DataColumn("over", 3), DataColumn("score", 2))),
            DataRow(Array(DataColumn("over", 4), DataColumn("score", 8)))
          )
        ),
        DataSet(
          Array(
            DataRow(Array(DataColumn("over", 1), DataColumn("score", 3))),
            DataRow(Array(DataColumn("over", 2), DataColumn("score", 10))),
            DataRow(Array(DataColumn("over", 3), DataColumn("score", 12))),
            DataRow(Array(DataColumn("over", 4), DataColumn("score", 15)))
          )
        ),
        DataSet(
          Array(
            DataRow(Array(DataColumn("over", 1), DataColumn("score", 33))),
            DataRow(Array(DataColumn("over", 2), DataColumn("score", 13))),
            DataRow(Array(DataColumn("over", 3), DataColumn("score", 21))),
            DataRow(Array(DataColumn("over", 4), DataColumn("score", 54)))
          )
        )
      )
    ).asJs

    val multichart = document.createElement("div")
    multichart.setAttribute("id", "multichart")
    document.body.appendChild(multichart)

    MG(
      js.Dynamic.literal(
        "title"            -> chartParams.title,
        "area"             -> true,
        "data"             -> data.asJs,
        "animate_on_load"  -> true,
        "width"            -> 600,
        "height"           -> 240,
        "right"            -> 40,
        "left"             -> 90,
        "bottom"           -> 50,
        "target"           -> document.getElementById("chart"),
        "x_accessor"       -> "over",
        "x_extended_ticks" -> true,
        "y_accessor"       -> "score"
      )
    )

    MG(
      js.Dynamic.literal(
        "title"            -> chartParams.title,
        "area"             -> true,
        "data"             -> multiData,
        "animate_on_load"  -> true,
        "width"            -> 600,
        "height"           -> 240,
        "right"            -> 40,
        "left"             -> 90,
        "bottom"           -> 50,
        "target"           -> document.getElementById("multichart"),
        "x_accessor"       -> "over",
        "x_extended_ticks" -> true,
        "y_accessor"       -> "score"
      )
    )
  }
}
