import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class StudentsInformation extends JFrame implements ActionListener{

    JPanel panel = new JPanel();
    JLabel label = new JLabel("INFORMAÇÕES DO ALUNO");
    JLabel nameTitle = new JLabel("Nome:");
    JLabel cttTitle = new JLabel("Telefone:");

    JLabel cttEMTitle = new JLabel("Contato de emergência:");
    JLabel nascDateTitle = new JLabel("Data de nascimento:");
    JLabel menTitle = new JLabel("Mensalidade:");

    JLabel nameContent = new JLabel("Nome do Professor");
    JLabel cttContent = new JLabel("(99) 99999-9999");
    JLabel cttEMContent = new JLabel("(99) 99999-9999");
    JLabel nascDateContent = new JLabel("00/00/0000");
    JLabel menContent = new JLabel("R$ " + 100.00);

    JButton classButton = new JButton("Turmas"); 

    public StudentsInformation() {

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

        cttEMTitle.setBounds(18,125,300,25);
        cttEMTitle.setFont(new Font(null,Font.BOLD,17));
        cttEMContent.setBounds(338,125,300,25);
        cttEMContent.setFont(new Font(null,Font.PLAIN,17));

        nascDateTitle.setBounds(18,155,300,25);
        nascDateTitle.setFont(new Font(null,Font.BOLD,17));
        nascDateContent.setBounds(338,155,300,25);
        nascDateContent.setFont(new Font(null,Font.PLAIN,17));

        menTitle.setBounds(18,185,300,25);
        menTitle.setFont(new Font(null,Font.BOLD,17));
        menContent.setBounds(338,185,300,25);
        menContent.setFont(new Font(null,Font.PLAIN,17));

        classButton.setBounds(18,215,150,45);
        classButton.setFocusable(false);
        classButton.addActionListener(this);

        panel.add(label);
        panel.add(nameTitle);
        panel.add(nameContent);
        panel.add(cttTitle);
        panel.add(cttContent);
        panel.add(cttEMTitle);
        panel.add(menTitle);
        panel.add(nascDateTitle);
        panel.add(nascDateContent);
        panel.add(cttEMContent);
        panel.add(classButton);

        panel.add(menContent);
        panel.setLayout(null);

        add(panel);
        setTitle("Informações dos alunos");
        setSize(600, 310);

    }

    @Override
    public void actionPerformed(ActionEvent e){

    }

}
