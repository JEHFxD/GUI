package descomgra;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DesComGra extends JFrame implements ActionListener {

    private JTextField txtNombre;
    private JTextField txtCiudad;
    private JLabel txtFrase;
    private JButton btnAceptar;
    private JButton btnDesactivar;
    private JButton btnActivar;

    public DesComGra() {
        
        setTitle("Información Personal");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciarComponentes();
    }

    private void iniciarComponentes() {
       
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);

       
        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(50, 30, 100, 30);

        txtNombre = new JTextField();
        txtNombre.setBounds(150, 30, 200, 30);

        JLabel lblCiudad = new JLabel("Ciudad:");
        lblCiudad.setBounds(50, 70, 100, 30);

        txtCiudad = new JTextField();
        txtCiudad.setBounds(150, 70, 200, 30);

        txtFrase = new JLabel("");
        txtFrase.setBounds(50, 110, 300, 30);

        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(50, 150, 100, 30);
        btnAceptar.addActionListener(this);

        btnDesactivar = new JButton("Desactivar");
        btnDesactivar.setBounds(160, 150, 100, 30);
        btnDesactivar.addActionListener(this);

        btnActivar = new JButton("Activar");
        btnActivar.setBounds(270, 150, 100, 30);
        btnActivar.addActionListener(this);

        
        panel.add(lblNombre);
        panel.add(txtNombre);
        panel.add(lblCiudad);
        panel.add(txtCiudad);
        panel.add(txtFrase);
        panel.add(btnAceptar);
        panel.add(btnDesactivar);
        panel.add(btnActivar);

        
        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == btnAceptar) {
            String nombre = txtNombre.getText();
            String ciudad = txtCiudad.getText();
            txtFrase.setText("Te llamas " + nombre + " y vives en " + ciudad);
        } else if (e.getSource() == btnDesactivar) {
            txtNombre.setEnabled(false);
            txtCiudad.setEnabled(false);
            btnAceptar.setEnabled(false);
        } else if (e.getSource() == btnActivar) {
            txtNombre.setEnabled(true);
            txtCiudad.setEnabled(true);
            btnAceptar.setEnabled(true);
        }
    }
}
