

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;


public class MeuPopup extends JFrame {

    private String message;

    public MeuPopup(String status) {
        // Configure o título e o tamanho do popup
        setTitle("Popup");
        setSize(300, 100);

        // Crie um painel para adicionar componentes
        JPanel panel = new JPanel();

        this.message = status;

        // Adicione um rótulo para exibir informações
        JLabel label = new JLabel(message);

        label.setBounds(18,15,300,25);
        label.setFont(new Font(null,Font.BOLD,17));

        panel.add(label);

        panel.setLayout(null);
        // Adicione o painel ao popup
        add(panel);

    }
}
