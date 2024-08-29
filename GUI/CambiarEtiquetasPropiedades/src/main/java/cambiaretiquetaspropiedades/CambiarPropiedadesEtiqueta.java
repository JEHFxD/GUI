package cambiaretiquetaspropiedades;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CambiarPropiedadesEtiqueta extends JFrame implements ActionListener {

    private JLabel etiTexto;
    private JButton btnAzul, btnRojo, btnVerde;
    private JButton btnFondoAzul, btnFondoRojo, btnFondoVerde;
    private JButton btnTransparente, btnOpaca;

    public CambiarPropiedadesEtiqueta() {
        setTitle("Cambiar Propiedades de la Etiqueta");
        setSize(500, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        add(panel);

        
        etiTexto = new JLabel("YOLOOO", SwingConstants.CENTER);
        etiTexto.setBounds(150, 20, 200, 30);
        etiTexto.setOpaque(true);
        etiTexto.setBackground(Color.WHITE);
        panel.add(etiTexto);

        
        btnAzul = new JButton("Azul");
        btnAzul.setBounds(20, 70, 100, 30);
        btnAzul.addActionListener(this);
        panel.add(btnAzul);

        btnRojo = new JButton("Rojo");
        btnRojo.setBounds(140, 70, 100, 30);
        btnRojo.addActionListener(this);
        panel.add(btnRojo);

        btnVerde = new JButton("Verde");
        btnVerde.setBounds(260, 70, 100, 30);
        btnVerde.addActionListener(this);
        panel.add(btnVerde);

        btnFondoAzul = new JButton("Fondo Azul");
        btnFondoAzul.setBounds(380, 70, 100, 30);
        btnFondoAzul.addActionListener(this);
        panel.add(btnFondoAzul);

        btnFondoRojo = new JButton("Fondo Rojo");
        btnFondoRojo.setBounds(20, 110, 100, 30);
        btnFondoRojo.addActionListener(this);
        panel.add(btnFondoRojo);

        btnFondoVerde = new JButton("Fondo Verde");
        btnFondoVerde.setBounds(140, 110, 100, 30);
        btnFondoVerde.addActionListener(this);
        panel.add(btnFondoVerde);

        btnTransparente = new JButton("Transparente");
        btnTransparente.setBounds(260, 110, 100, 30);
        btnTransparente.addActionListener(this);
        panel.add(btnTransparente);

        btnOpaca = new JButton("Opaca");
        btnOpaca.setBounds(380, 110, 100, 30);
        btnOpaca.addActionListener(this);
        panel.add(btnOpaca);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == btnAzul) {
            etiTexto.setForeground(Color.BLUE);
        } else if (e.getSource() == btnRojo) {
            etiTexto.setForeground(Color.RED);
        } else if (e.getSource() == btnVerde) {
            etiTexto.setForeground(Color.GREEN);
        } else if (e.getSource() == btnFondoAzul) {
            etiTexto.setBackground(Color.BLUE);
        } else if (e.getSource() == btnFondoRojo) {
            etiTexto.setBackground(Color.RED);
        } else if (e.getSource() == btnFondoVerde) {
            etiTexto.setBackground(Color.GREEN);
        } else if (e.getSource() == btnTransparente) {
            etiTexto.setOpaque(false);
        } else if (e.getSource() == btnOpaca) {
            etiTexto.setOpaque(true);
        }
    }
}
