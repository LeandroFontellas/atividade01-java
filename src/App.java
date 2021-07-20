/**
 * App
 */
import javax.swing.SwingUtilities;

import modules.material_bibliografico.entities.MaterialBibliográfico;
import modules.material_bibliografico.provider.tela.Tela;

public class App {
	public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            new Tela(new MaterialBibliográfico());
        }
    });
}
}
