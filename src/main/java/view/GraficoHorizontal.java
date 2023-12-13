package view;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;


public class GraficoHorizontal extends JPanel {

    public GraficoHorizontal() {
        // Crie um conjunto de dados vazio (isso é opcional, dependendo do seu caso)
        // DataSet dataset = new XYSeriesCollection();

        // Crie o gráfico vazio
        JFreeChart chart = ChartFactory.createBarChart(
                "",  // Título do gráfico
                "",         // Rótulo do eixo X
                "",
                null,
                PlotOrientation.HORIZONTAL,
                false,
                true,
                false
                );            // Dataset (pode ser nulo se você não tiver dados para exibir)

        // Adicione o gráfico ao painel
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(560, 370));
        add(chartPanel);
    }
}