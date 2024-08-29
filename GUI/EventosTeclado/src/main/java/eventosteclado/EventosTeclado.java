package eventosteclado;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class EventosTeclado extends JFrame implements ActionListener {
    
    private JPanel miPanel;
    private JLabel etiTexto1;
    private JButton btnVaciar;
    private JTextField txtTexto;
    
    public EventosTeclado(){
        setTitle("Eventos de Teclado");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciarComponentes();
    }
    
    private void iniciarComponentes() {
        miPanel = new JPanel();
        miPanel.setLayout(null);
        miPanel.setBackground(Color.green);
        add(miPanel);
        
        etiTexto1 = new JLabel("");
        etiTexto1.setBounds(100, 60, 80, 30); 
        miPanel.add(etiTexto1);
        
        btnVaciar = new JButton("Vaciar");
        btnVaciar.setBounds(110, 150, 150, 30);
        btnVaciar.addActionListener(this);
        miPanel.add(btnVaciar);
        
        txtTexto = new JTextField();
        txtTexto.setBounds(130, 100, 120, 30);
        miPanel.add(txtTexto);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnVaciar) {
            txtTexto.setText("");
            etiTexto1.setText("");
        }
    }
}
    