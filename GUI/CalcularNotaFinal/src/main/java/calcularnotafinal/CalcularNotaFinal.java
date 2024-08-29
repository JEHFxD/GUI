package calcularnotafinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcularNotaFinal extends JFrame implements ActionListener {

    private JTextField txtPrimerTrimestre, txtSegundoTrimestre, txtTercerTrimestre;
    private JLabel etiNotaFinal, etiResultado;
    private JButton btnCalcular;

    public CalcularNotaFinal() {
        setTitle("Calcular Nota Final");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        add(panel);

        
        JLabel lblPrimerTrimestre = new JLabel("Primer Trimestre:");
        lblPrimerTrimestre.setBounds(30, 30, 120, 30);
        panel.add(lblPrimerTrimestre);

        JLabel lblSegundoTrimestre = new JLabel("Segundo Trimestre:");
        lblSegundoTrimestre.setBounds(30, 70, 130, 30);
        panel.add(lblSegundoTrimestre);

        JLabel lblTercerTrimestre = new JLabel("Tercer Trimestre:");
        lblTercerTrimestre.setBounds(30, 110, 120, 30);
        panel.add(lblTercerTrimestre);

        
        txtPrimerTrimestre = new JTextField();
        txtPrimerTrimestre.setBounds(160, 30, 100, 30);
        panel.add(txtPrimerTrimestre);

        txtSegundoTrimestre = new JTextField();
        txtSegundoTrimestre.setBounds(160, 70, 100, 30);
        panel.add(txtSegundoTrimestre);

        txtTercerTrimestre = new JTextField();
        txtTercerTrimestre.setBounds(160, 110, 100, 30);
        panel.add(txtTercerTrimestre);

        
        etiNotaFinal = new JLabel("Nota Final:");
        etiNotaFinal.setBounds(30, 150, 200, 30);
        panel.add(etiNotaFinal);

        
        etiResultado = new JLabel("");
        etiResultado.setBounds(30, 180, 200, 30);
        panel.add(etiResultado);

        
        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 220, 100, 30);
        btnCalcular.addActionListener(this);
        panel.add(btnCalcular);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       try {
            
            double primerTrimestre = Double.parseDouble(txtPrimerTrimestre.getText());
            double segundoTrimestre = Double.parseDouble(txtSegundoTrimestre.getText());
            double tercerTrimestre = Double.parseDouble(txtTercerTrimestre.getText());

            
            double notaFinal = (primerTrimestre + segundoTrimestre + tercerTrimestre) / 3;
            etiNotaFinal.setText("Nota Final: " + String.format("%.2f", notaFinal));

            
            if (notaFinal < 5) {
                etiResultado.setText("SUSPENSO");
                etiNotaFinal.setForeground(Color.RED);
                etiResultado.setForeground(Color.RED);
            } else {
                etiResultado.setText("APROBADO");
                etiNotaFinal.setForeground(Color.BLACK);
                etiResultado.setForeground(Color.BLACK);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}