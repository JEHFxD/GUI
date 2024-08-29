package ocultaretiquetas;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class OcultarEtiquetas extends JFrame {

    private JLabel etiPal1, etiPal2, etiPal3, etiPal4, etiOcultar;

    public OcultarEtiquetas() {
        setTitle("Ocultar Etiquetas");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        JPanel mipanel = new JPanel();
        mipanel.setLayout(null);
        mipanel.setBackground(Color.LIGHT_GRAY);
        add(mipanel);

 
        etiPal1 = new JLabel("Palabra 1");
        etiPal1.setBounds(50, 50, 100, 30);
        etiPal2 = new JLabel("Palabra 2");
        etiPal2.setBounds(50, 100, 100, 30);
        etiPal3 = new JLabel("Palabra 3");
        etiPal3.setBounds(50, 150, 100, 30);
        etiPal4 = new JLabel("Palabra 4");
        etiPal4.setBounds(50, 200, 100, 30);

        etiOcultar = new JLabel("Ocultar");
        etiOcultar.setBounds(200, 100, 150, 50);
        etiOcultar.setOpaque(true);
        etiOcultar.setBackground(Color.green);


        etiOcultar.addMouseListener(new MouseListener() {
            @Override
            public void mouseEntered(MouseEvent e) {
                etiPal1.setVisible(false);
                etiPal2.setVisible(false);
                etiPal3.setVisible(false);
                etiPal4.setVisible(false);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
                etiPal1.setVisible(true);
                etiPal2.setVisible(true);
                etiPal3.setVisible(true);
                etiPal4.setVisible(true);
            }     

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }
        });

        
        mipanel.add(etiPal1);
        mipanel.add(etiPal2);
        mipanel.add(etiPal3);
        mipanel.add(etiPal4);
        mipanel.add(etiOcultar);
    }
}