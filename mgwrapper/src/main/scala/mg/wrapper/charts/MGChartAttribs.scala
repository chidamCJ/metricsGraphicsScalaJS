package mg.wrapper.charts

case class MGChartAttribs (title: String,description: String,width: Int,height: Int,right: Int,target: String,x_accessor: String,y_accessor: String)
case class LineChart()extends MGChartAttribs
case class ConfidenceBand(format:String,area: Boolean,show_secondary_x_label:Boolean,show_confidence_band: Array[String], x_extended_ticks:Boolean)extends MGChartAttribs