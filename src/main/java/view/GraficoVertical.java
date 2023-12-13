/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;

/**
 *
 * @author santa
 */
public class GraficoVertical extends JPanel {

    public GraficoVertical() 
    {
        JFreeChart chart = ChartFactory.createBarChart(
                "",  // Título do gráfico
                "",         // Rótulo do eixo X
                "",
                null,
                PlotOrientation.VERTICAL,
                false,
                true,
                false
                );        // Dataset (pode ser nulo se você não tiver dados para exibir)

        // Adicione o gráfico ao painel
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(560, 370));
        add(chartPanel);
    }
    
}
