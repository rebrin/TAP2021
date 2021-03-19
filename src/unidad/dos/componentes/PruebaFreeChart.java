package unidad.dos.componentes;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class PruebaFreeChart {

    public static void main(String[] args) {
        XYSeries series=new XYSeries("Producto A");
            series.add(1,1);
            series.add(2,6);
            series.add(3,3);
            series.add(4,10);
        XYSeriesCollection dataSet=new XYSeriesCollection();
        dataSet.addSeries(series);
        JFreeChart lineChart= ChartFactory.createXYLineChart(
                "Ventas 2021","tiempo","ventas"
                ,dataSet, PlotOrientation.VERTICAL,true
                ,false,false
        );

        ChartFrame ventana=new ChartFrame("ejemplo librería"
                ,lineChart);
        ventana.pack();
        ventana.setVisible(true);
    }
}
