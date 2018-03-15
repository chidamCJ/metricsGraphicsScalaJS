package mg.wrapper.ui

import mg.wrapper.charts._
import org.scalajs.dom.document

import scala.scalajs.js.annotation.{JSExport, JSExportTopLevel}

@JSExportTopLevel("MGWrapper")
object MetricsGraphicsUI {

  private val data = SingleSeries(
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

  private val multiData = MultiSeries(
    Array(
      SingleSeries(
        Array(
          DataRow(Array(DataColumn("over", 1), DataColumn("score", 12))),
          DataRow(Array(DataColumn("over", 2), DataColumn("score", 18))),
          DataRow(Array(DataColumn("over", 3), DataColumn("score", 2))),
          DataRow(Array(DataColumn("over", 4), DataColumn("score", 8)))
        )
      ),
      SingleSeries(
        Array(
          DataRow(Array(DataColumn("over", 1), DataColumn("score", 3))),
          DataRow(Array(DataColumn("over", 2), DataColumn("score", 10))),
          DataRow(Array(DataColumn("over", 3), DataColumn("score", 12))),
          DataRow(Array(DataColumn("over", 4), DataColumn("score", 15)))
        )
      ),
      SingleSeries(
        Array(
          DataRow(Array(DataColumn("over", 1), DataColumn("score", 33))),
          DataRow(Array(DataColumn("over", 2), DataColumn("score", 13))),
          DataRow(Array(DataColumn("over", 3), DataColumn("score", 21))),
          DataRow(Array(DataColumn("over", 4), DataColumn("score", 54)))
        )
      )
    )
  )

  @JSExport
  def drawSingleGraph() = {
    document.body.appendChild(chartElem("chart"))
    // MGWrapper.plot(ChartParams("single chart data", "chart", "histogram", Left(data)))
  }

  @JSExport
  def drawMultiGraph() = {
    document.body.appendChild(chartElem("multichart"))
    // MGWrapper.plot(ChartParams("multi chart data", "multichart", "line", Right(multiData)))
  }

  private def chartElem(id: String) = {
    val divElem = document.createElement("div")
    divElem.setAttribute("id", id)
    divElem
  }

  def main(args: Array[String]): Unit = {}
}
