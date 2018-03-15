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
                          y_accessor: String,
                          area: Boolean,
                          linked: Boolean,
                          xax_count: Int)
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
      "y_accessor" -> y_accessor,
      "area" -> area,
      "linked" -> linked,
      "xax_count" -> xax_count
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
      "format" -> format,
      "target" -> target,
      "show_secondary_x_label" -> show_secondary_x_label,
      "show_confidence_band" -> show_confidence_band,
      "x_extended_ticks" -> x_extended_ticks
    ).++(baseAttributes.getAttributes)
}
case class SmallRangeOfIntegers(interpolate: String,
                                baseAttributes: MGChartAttribs)
    extends BaseChartAttributes {
  override def getAttributes: Array[(String, Any)] =
    Array(
      "interpolate" -> interpolate,
    ).++(baseAttributes.getAttributes)
}
case class ChangingSingleLineColor(color: String,
                                   baseAttributes: MGChartAttribs)
    extends BaseChartAttributes {
  override def getAttributes: Array[(String, Any)] =
    Array(
      "color" -> color
    ).++(baseAttributes.getAttributes)
}
