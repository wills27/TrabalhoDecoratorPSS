package builderdecorator;

import view.GraficoHorizontal;
import view.PresenterPrincipal;

/**
 *
 * @author santa
 */
public class BuilderGraficoHorizontal implements Builder{
    
    private PresenterPrincipal presenter;
    
    public BuilderGraficoHorizontal(PresenterPrincipal presenter) {
        this.presenter = presenter;
    }
    
    @Override
    public void build() 
    {
        GraficoHorizontal grafico = new GraficoHorizontal();
        presenter.adicionarGrafico(grafico);
    }
    
}
