package eventosmouseyposi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventosMouseyPosi extends JFrame implements ActionListener, MouseListener {

    private JLabel etiNombre;
    private JButton btnEsquina, btnCentro, btnAgrandar, btnAchicar;

    public EventosMouseyPosi() {
        setTitle("Manipular Etiqueta");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);
        add(panel);

        
        etiNombre = new JLabel("Joan", SwingConstants.CENTER);
        etiNombre.setBounds(150, 100, 100, 30);  
        etiNombre.setOpaque(true);
        etiNombre.setBackground(Color.CYAN);
        panel.add(etiNombre);


        btnEsquina = new JButton("Esquina");
        btnEsquina.setBounds(20, 20, 100, 30);
        btnEsquina.addActionListener(this);
        btnEsquina.addMouseListener(this);
        panel.add(btnEsquina);

        btnCentro = new JButton("Centro");
        btnCentro.setBounds(130, 20, 100, 30);
        btnCentro.addActionListener(this);
        btnCentro.addMouseListener(this);
        panel.add(btnCentro);

        btnAgrandar = new JButton("Agrandar");
        btnAgrandar.setBounds(240, 20, 100, 30);
        btnAgrandar.addActionListener(this);
        btnAgrandar.addMouseListener(this);
        panel.add(btnAgrandar);

        btnAchicar = new JButton("Achicar");
        btnAchicar.setBounds(150, 60, 100, 30);
        btnAchicar.addActionListener(this);
        btnAchicar.addMouseListener(this);
        panel.add(btnAchicar);
    }

    
    @Override
    public void mouseEntered(MouseEvent e) {
        JButton btn = (JButton) e.getSource();
        btn.setSize(btn.getWidth() + 20, btn.getHeight() + 10);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        JButton btn = (JButton) e.getSource();
        btn.setSize(btn.getWidth() - 20, btn.getHeight() - 10);
    }

   
    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource() == btnEsquina) {
            etiNombre.setLocation(0, 0);
        } else if (e.getSource() == btnCentro) {
            int x = (getWidth() - etiNombre.getWidth()) / 2;
            int y = (getHeight() - etiNombre.getHeight()) / 2 - 20;  
            etiNombre.setLocation(x, y);
        } else if (e.getSource() == btnAgrandar) {
            etiNombre.setSize(etiNombre.getWidth() + 20, etiNombre.getHeight() + 10);
        } else if (e.getSource() == btnAchicar) {
            etiNombre.setSize(etiNombre.getWidth() - 20, etiNombre.getHeight() - 10);
        }
    }
}