package builderdecorator;

import view.GraficoVertical;
import view.PresenterPrincipal;

/**
 *
 * @author santa
 */
public class BuilderGraficoVertical implements Builder{

    public BuilderGraficoVertical(PresenterPrincipal presenter) {
        this.presenter = presenter;
    }

    private PresenterPrincipal presenter;
    
    @Override
    public void build() {
        GraficoVertical grafico = new GraficoVertical();
        presenter.adicionarGrafico(grafico);
    }
    
}
