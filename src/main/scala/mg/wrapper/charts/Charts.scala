package mg.wrapper.charts
import scala.scalajs.js
import js.JSConverters._
case class ChartParams(title: String)
case class DataColumn(key: String, value: Double)
case class DataRow(cols: Array[DataColumn]) {
  def asDict = js.Dictionary(cols.map(x => (x.key, x.value)): _*)
}
case class DataSet(rows: Array[DataRow]) {
  def asJs = rows.map(_.asDict).toJSArray
}
case class MultiDataSet(rowsArray: Array[DataSet]) {
  def asJs = rowsArray.map(_.asJs).toJSArray
}
