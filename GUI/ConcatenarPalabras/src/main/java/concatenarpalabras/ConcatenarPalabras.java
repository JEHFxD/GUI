package concatenarpalabras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConcatenarPalabras extends JFrame implements ActionListener {

    private JTextField txtPalabra1, txtPalabra2;
    private JLabel etiTexto;
    private JButton btnConcatena;

    public ConcatenarPalabras() {
        setTitle("Concatenar Palabras");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        add(panel);

        
        JLabel lblPalabra1 = new JLabel("Palabra 1:");
        lblPalabra1.setBounds(30, 30, 80, 30);
        panel.add(lblPalabra1);

        
        txtPalabra1 = new JTextField();
        txtPalabra1.setBounds(120, 30, 200, 30);
        panel.add(txtPalabra1);

        
        JLabel lblPalabra2 = new JLabel("Palabra 2:");
        lblPalabra2.setBounds(30, 70, 80, 30);
        panel.add(lblPalabra2);

       
        txtPalabra2 = new JTextField();
        txtPalabra2.setBounds(120, 70, 200, 30);
        panel.add(txtPalabra2);

      
        etiTexto = new JLabel("");
        etiTexto.setBounds(30, 110, 290, 30);
        panel.add(etiTexto);

        
        btnConcatena = new JButton("Concatenar");
        btnConcatena.setBounds(150, 120, 100, 30);
        btnConcatena.addActionListener(this);
        panel.add(btnConcatena);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String palabra1 = txtPalabra1.getText();
        String palabra2 = txtPalabra2.getText();
        
        String resultado = palabra1 + palabra2;
        etiTexto.setText(resultado);
    }
}