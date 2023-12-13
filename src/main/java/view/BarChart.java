/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;

import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;


public class BarChart extends JFrame{
    public BarChart()
    {
        CategoryDataset dataset = createDataSet();
        
        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.WHITE);
        add(chartPanel);
        
        pack();
        setTitle("Gráfico de barras");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private JFreeChart createChart(CategoryDataset dataset) {
        JFreeChart barChart = ChartFactory.createBarChart(
        "Comem pão por idade",
                "idade",
                "Pães comidos",
                dataset,
                PlotOrientation.VERTICAL,
                false,
                true,
                false);
        return barChart;
    }
    
    private CategoryDataset createDataSet()
    {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(28, "Paes", "20");
        dataset.setValue(10, "Paes", "35");
        dataset.setValue(33, "Paes", "50");
        return dataset;
    }

    

    
}
