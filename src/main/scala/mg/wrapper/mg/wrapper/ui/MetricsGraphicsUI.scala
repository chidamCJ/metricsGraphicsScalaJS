package mg.wrapper.mg.wrapper.ui

import mg.wrapper.MGWrapper
import mg.wrapper.MGWrapper.ChartParams

object MetricsGraphicsUI {

  def plot() {
    MGWrapper.write(ChartParams("scores-level-chart"))
  }

  def main(args: Array[String]): Unit =
    plot()
}
