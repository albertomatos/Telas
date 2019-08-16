
package janelas;

import javax.swing.JDialog;
import javax.swing.JFrame;


public class TestaJanela {
    public static void main(String[] args) {
               
        JFrame janela = new JFrame();
      //  janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        janela.setTitle("Hello Whord");
        janela.setSize(600, 400);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null); 
          
         JFrame janela2 = new JFrame();
      //  janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        janela2.setTitle("vava pai do victor");
        janela2.setSize(500, 500);
        janela2.setVisible(true);
//        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//       janela.setLocationRelativeTo(null); ;;
        
        
        JDialog dialogo = new JDialog(janela);
//        dialogo.setModal(true);
        dialogo.setTitle("minha caixa de dialogo");
        dialogo.setSize(200, 100 );
        dialogo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dialogo.setLocationRelativeTo(null);
        dialogo.setVisible(true);
    }
}
