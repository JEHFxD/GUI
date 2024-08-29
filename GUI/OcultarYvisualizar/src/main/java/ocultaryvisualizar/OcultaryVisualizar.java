package ocultaryvisualizar;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class OcultaryVisualizar extends JFrame implements ActionListener{
    
    JPanel miPanel;
    JLabel etiNombre;
    JLabel etiCiudad;
    JButton OcultarNombre;
    JButton VisuNombre;
    JButton OcultarCiudad;
    JButton VisuCiudad;
    
   
    public OcultaryVisualizar(){
        
        setTitle("Ocultar y Visualizar");
        setSize(400,300);
        setLocationRelativeTo(null);
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        miPanel=new JPanel();
        miPanel.setLayout(null);
        miPanel.setBackground(Color.orange);
     
        add(miPanel);
        
        etiNombre = new JLabel();
        etiNombre.setText("Joan");
        etiNombre.setBounds(100,20,30,40);
        miPanel.add(etiNombre);
        
        etiCiudad = new JLabel();
        etiCiudad.setText("Armenia");
        etiCiudad.setBounds(250,20,100,40);
        miPanel.add(etiCiudad);
        
        OcultarNombre = new JButton();
        OcultarNombre.setText("OcultarNombre");
        OcultarNombre.setBounds(30,90,150,30);
        OcultarNombre.addActionListener(this);
        
        VisuNombre = new JButton();
        VisuNombre.setText("VisuNombre");
        VisuNombre.setBounds(30,150,150,30);
        VisuNombre.addActionListener(this);
        
        OcultarCiudad = new JButton();
        OcultarCiudad.setText("OcultarCiudad");
        OcultarCiudad.setBounds(200,90,150,30);
        OcultarCiudad.addActionListener(this);
        
        VisuCiudad = new JButton();
        VisuCiudad.setText("VisuCiudad");
        VisuCiudad.setBounds(200,150,150,30);
        VisuCiudad.addActionListener(this);
        
        
        miPanel.add(OcultarNombre);
        miPanel.add(VisuNombre);
        miPanel.add(OcultarCiudad);
        miPanel.add(VisuCiudad);
           
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==OcultarNombre){
            etiNombre.setVisible(false);
        }else if
            (e.getSource()==VisuNombre){
            etiNombre.setVisible(true);
        }else if
                (e.getSource()==OcultarCiudad){
            etiCiudad.setVisible(false);
        }else if
                (e.getSource()==VisuCiudad){
            etiCiudad.setVisible(true);
        }
    }
}
