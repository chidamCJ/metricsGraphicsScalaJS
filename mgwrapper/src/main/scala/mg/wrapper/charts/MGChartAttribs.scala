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
      "title"       -> title,
      "description" -> description,
      "width"       -> width,
      "height"      -> height,
      "right"       -> right,
      "target"      -> target,
      "x_accessor"  -> x_accessor,
      "y_accessor"  -> y_accessor
    )
}

case class ConfidenceBand(format: String,
                          area: Boolean,
                          show_secondary_x_label: Boolean,
                          show_confidence_band: Array[String],
                          x_extended_ticks: Boolean,
                          baseAttributes: MGChartAttribs)
    extends BaseChartAttributes {
  override def getAttributes: Array[(String, Any)] =
    Array(
      "format"                 -> format,
      "area"                   -> area,
      "show_confidence_band"   -> show_confidence_band,
      "show_secondary_x_label" -> show_secondary_x_label,
      "x_extended_ticks"       -> x_extended_ticks
    ).++(baseAttributes.getAttributes)
}
