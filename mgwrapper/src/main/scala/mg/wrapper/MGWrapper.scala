package mg.wrapper

import charts._

object MGWrapper {
  def plot(chartParams: ChartParams) = MG(chartParams.populate)
  def plot(chartParams: MGChartParams) = MG(chartParams.populate)
}
