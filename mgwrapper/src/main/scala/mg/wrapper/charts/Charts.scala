package mg.wrapper.charts

import org.scalajs.dom.document

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

case class ChartParams(title: String, id: String, charType: String, dataSet: Either[SingleSeries, MultiSeries]) {

  def populate =
    js.Dynamic.literal(
      "title"      -> title,
      "chart_type" -> charType,
      "area"       -> true,
      "data"       -> (if (dataSet.isLeft) dataSet.left.get.asJs else dataSet.right.get.asJs),
      "width"      -> 600,
      "height"     -> 240,
      "right"      -> 40,
      "left"       -> 90,
      "bottom"     -> 50,
      "target"     -> document.getElementById(id),
      "x_accessor" -> "over",
      "y_accessor" -> "score"
    )
}
case class DataColumn(key: String, value: Double)
case class DataRow(cols: Array[DataColumn]) {
  def asDict = js.Dictionary(cols.map(x => (x.key, x.value)): _*)
}

case class SingleSeries(rows: Array[DataRow]) {
  def asJs = rows.map(_.asDict).toJSArray
}
case class MultiSeries(rowsArray: Array[SingleSeries]) {
  def asJs = rowsArray.map(_.asJs).toJSArray
}
