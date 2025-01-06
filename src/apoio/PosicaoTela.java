package apoio;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author Kern
 */
public class PosicaoTela {
    
    public void posicao(JInternalFrame janela, JDesktopPane desktop){
    
       int esk = desktop.getWidth();
       int aDesk = desktop.getHeight();
       int lIFreme = janela.getWidth();
       int aIFreme = janela.getHeight();
       
       janela.setLocation(esk / 2 - lIFreme / 2, aDesk / 2 - aIFreme / 2 );
       desktop.add(janela);
       janela.setVisible(true);
         
    }
     public void posicao(JInternalFrame janela, JInternalFrame desktop){
    
       int esk = desktop.getWidth();
       int aDesk = desktop.getHeight();
       int lIFreme = janela.getWidth();
       int aIFreme = janela.getHeight();
       
       janela.setLocation(esk / 2 - lIFreme / 2, aDesk / 2 - aIFreme / 2 );
       desktop.add(janela);
       janela.setVisible(true);
         
    }
    
    
}
