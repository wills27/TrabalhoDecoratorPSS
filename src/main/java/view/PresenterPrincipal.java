/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.Pessoa;

/**
 *
 * @author santa
 */
public class PresenterPrincipal {
    private List<Pessoa> pessoas = new ArrayList<>();
    private MainView view;
    private GraficoHorizontal panel;
    
    public PresenterPrincipal()
    {
        view = new MainView();
        view.setLayout(new BorderLayout());
        panel = new GraficoHorizontal();
        view.add(panel);

        view.setVisible(true);
        panel.setVisible(true);
    }
    
    public void adicionarGrafico(JPanel grafico)
    {
        view.add(grafico);
    }
}
