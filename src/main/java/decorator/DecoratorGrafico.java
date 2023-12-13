/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

import view.PresenterPrincipal;

/**
 *
 * @author santa
 */
public class DecoratorGrafico {
    
    private PresenterPrincipal presenterPrincipal;
    
    public DecoratorGrafico(PresenterPrincipal presenterPrincipal)
    {
        this.presenterPrincipal = presenterPrincipal;
    }
}