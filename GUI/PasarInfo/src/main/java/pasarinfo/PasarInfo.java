package pasarinfo;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PasarInfo extends JFrame implements ActionListener {
    
    private JPanel miPanel;
    private JLabel etiTexto1, etiTexto2;
    private JButton botonTraspasa1, botonTraspasa2;
    private JTextField campoDeTexto;
    
    public PasarInfo() {
        setTitle("Pasar Información");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciarComponentes();
    }
    
    private void iniciarComponentes() {
        miPanel = new JPanel();
        miPanel.setLayout(null);
        miPanel.setBackground(Color.LIGHT_GRAY);
        add(miPanel);
        
        etiTexto1 = new JLabel("Arthur");
        etiTexto1.setBounds(100, 60, 80, 30); 
        miPanel.add(etiTexto1);
        
        etiTexto2 = new JLabel("John");
        etiTexto2.setBounds(250, 60, 80, 30);
        miPanel.add(etiTexto2);
        
        botonTraspasa1 = new JButton("Traspasa 1");
        botonTraspasa1.setBounds(30, 150, 150, 30);
        botonTraspasa1.addActionListener(this);
        miPanel.add(botonTraspasa1);
        
        botonTraspasa2 = new JButton("Traspasa 2");
        botonTraspasa2.setBounds(200, 150, 150, 30);
        botonTraspasa2.addActionListener(this);
        miPanel.add(botonTraspasa2);
        
        campoDeTexto = new JTextField();
        campoDeTexto.setBounds(130, 100, 120, 30);
        miPanel.add(campoDeTexto);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonTraspasa1) {
            campoDeTexto.setText(etiTexto1.getText());
        } else if (e.getSource() == botonTraspasa2) {
            campoDeTexto.setText(etiTexto2.getText());
        }      
    }
}