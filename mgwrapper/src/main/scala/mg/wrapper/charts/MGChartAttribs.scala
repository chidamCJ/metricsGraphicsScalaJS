package mg.wrapper.charts

sealed trait BaseChartAttributes {
  def getAttributes: Array[(String, Any)]
}

case class MGChartAttribs(title: String,
                          description: String,
                          width: Int,
                          height: Int,
                          right: Int,
                          target: String,
                          x_accessor: String,
                          y_accessor: String)
    extends BaseChartAttributes {
  override def getAttributes: Array[(String, Any)] =
    Array(
      "title" -> title,
      "description" -> description,
      "width" -> width,
      "height" -> height,
      "right" -> right,
      "target" -> target,
      "x_accessor" -> x_accessor,
      "y_accessor" -> y_accessor
    )
}
case class LineChart(title: String,
                     description: String,
                     width: Int,
                     height: Int,
                     right: Int,
                     target: String,
                     x_accessor: String,
                     y_accessor: String)
    extends BaseChartAttributes {
  override def getAttributes: Array[(String, Any)] =
    Array(
      "title" -> title,
      "description" -> description,
      "width" -> width,
      "height" -> height,
      "right" -> right,
      "target" -> target,
      "x_accessor" -> x_accessor,
      "y_accessor" -> y_accessor
    )
}
case class ConfidenceBand(title: String,
                          description: String,
                          format: String,
                          width: Int,
                          height: Int,
                          right: Int,
                          area: Boolean,
                          target: String,
                          show_secondary_x_label: Boolean,
                          show_confidence_band: Array[String],
                          x_extended_ticks: Boolean)
    extends BaseChartAttributes {
  override def getAttributes: Array[(String, Any)] =
    Array(
      "title" -> title,
      "description" -> description,
      "format" -> format,
      "width" -> width,
      "height" -> height,
      "right" -> right,
      "area" -> area,
      "target" -> target,
      "show_secondary_x_label" -> show_secondary_x_label,
      "show_confidence_band" -> show_confidence_band,
      "x_extended_ticks" -> x_extended_ticks
    )
}
case class SmallRangeOfIntegers(title: String,
                                description: String,
                                interpolate: Any,
                                width: Int,
                                height: Int,
                                right: Int,
                                target: String)
    extends BaseChartAttributes {
  override def getAttributes: Array[(String, Any)] =
    Array(
      "title" -> title,
      "description" -> description,
      "interpolate" -> interpolate,
      "width" -> width,
      "height" -> height,
      "right" -> right,
      "target" -> target,
    )
}
