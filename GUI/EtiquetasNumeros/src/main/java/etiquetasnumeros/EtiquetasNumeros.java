package etiquetasnumeros;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EtiquetasNumeros extends JFrame {

    private JTextField txtNumero;
    private JButton btnBorrar;
    
    public EtiquetasNumeros() {
        setTitle("Etiquetas de Números");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        add(panel);
        
        txtNumero = new JTextField();
        txtNumero.setBounds(30, 200, 200, 30);
        panel.add(txtNumero);

        btnBorrar = new JButton("Borrar");
        btnBorrar.setBounds(250, 200, 100, 30);
        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNumero.setText("");
            }
        });
        panel.add(btnBorrar);

        for (int i = 0; i < 10; i++) {
            JLabel etiqueta = new JLabel(String.valueOf(i));
            etiqueta.setBounds(30 + (i * 35), 50, 30, 30);
            etiqueta.setOpaque(true);
            etiqueta.setBackground(Color.LIGHT_GRAY);
            etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
            etiqueta.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            
            
            etiqueta.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    txtNumero.setText(txtNumero.getText() + etiqueta.getText());
                }
            });
            
            panel.add(etiqueta);
        }
    }
}
