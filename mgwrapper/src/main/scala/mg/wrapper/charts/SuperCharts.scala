package mg.wrapper.charts

case class SuperCharts (title: String,description: String,width: Int,height: Int,right: Int,target: String,x_accessor: String,y_accessor: String)
case class LineChart()extends SuperCharts
case class ConfidenceBand(format:String,area: Boolean,show_secondary_x_label:Boolean,show_confidence_band: Array[String], x_extended_ticks:Boolean)extends SuperCharts
