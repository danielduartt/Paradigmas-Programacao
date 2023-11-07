import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class TeachersInformation extends JFrame {

JPanel panel = new JPanel();
JLabel label = new JLabel("INFORMAÇÕES DO PROFESSOR");
JLabel nameTitle = new JLabel("Nome:");
JLabel cttTitle = new JLabel("Telefone:");
JLabel addrTitle = new JLabel("Endereço:");
JLabel nascDateTitle = new JLabel("Data de nascimento:");
JLabel salTitle = new JLabel("Salário:");
JLabel classesTitle = new JLabel("Numero de turmas:");

JLabel nameContent = new JLabel("Nome do Professor");
JLabel cttContent = new JLabel("(99) 99999-9999");
JLabel addrContent = new JLabel("Rua teste, 3 , Sao Luis, MA");
JLabel nascDateContent = new JLabel("00/00/0000");
JLabel salContent = new JLabel("R$ " + 2034.61);
JLabel classesContent = new JLabel("3");

    public TeachersInformation() {

        label.setBounds(18,15,400,25);
        label.setFont(new Font(null,Font.BOLD,20));

        nameTitle.setBounds(18,65,300,25);
        nameTitle.setFont(new Font(null,Font.BOLD,17));
        nameContent.setBounds(338,65,300,25);
        nameContent.setFont(new Font(null,Font.PLAIN,17));

        cttTitle.setBounds(18,95,300,25);
        cttTitle.setFont(new Font(null,Font.BOLD,17));
        cttContent.setBounds(338,95,300,25);
        cttContent.setFont(new Font(null,Font.PLAIN,17));

        addrTitle.setBounds(18,125,300,25);
        addrTitle.setFont(new Font(null,Font.BOLD,17));
        addrContent.setBounds(338,125,300,25);
        addrContent.setFont(new Font(null,Font.PLAIN,17));

        nascDateTitle.setBounds(18,155,300,25);
        nascDateTitle.setFont(new Font(null,Font.BOLD,17));
        nascDateContent.setBounds(338,155,300,25);
        nascDateContent.setFont(new Font(null,Font.PLAIN,17));

        salTitle.setBounds(18,185,300,25);
        salTitle.setFont(new Font(null,Font.BOLD,17));
        salContent.setBounds(338,185,300,25);
        salContent.setFont(new Font(null,Font.PLAIN,17));

        classesTitle.setBounds(18,215,300,25);
        classesTitle.setFont(new Font(null,Font.BOLD,17));
        classesContent.setBounds(338,215,300,25);
        classesContent.setFont(new Font(null,Font.PLAIN,17));
        
        panel.add(label);
        panel.add(nameTitle);
        panel.add(nameContent);
        panel.add(cttTitle);
        panel.add(cttContent);
        panel.add(addrTitle);
        panel.add(addrContent);
        panel.add(nascDateTitle);
        panel.add(nascDateContent);
        panel.add(salTitle);
        panel.add(salContent);
        panel.add(classesTitle);
        panel.add(classesContent);
        panel.setLayout(null);

        add(panel);
        setTitle("Informações do professor");
        setSize(600, 300);

    }
}