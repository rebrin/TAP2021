package unidad.dos.componentes;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class PruebaMathCommons {

    public static void main(String[] args) {
        // Get a DescriptiveStatistics instance
        DescriptiveStatistics stats = new DescriptiveStatistics();


        for( int i = 0; i < 150; i++) {
            stats.addValue(Math.random());
        }


        double mean = stats.getMean();
        double std = stats.getStandardDeviation();
        double median = stats.getPercentile(50);
        System.out.println(stats.toString());
        System.out.println("media:"+mean);
        System.out.println("Desviación std: "+std);
        System.out.println("mediana: "+median);
    }
}
