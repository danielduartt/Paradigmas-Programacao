
import javax.swing.JFrame;
import javax.swing.JPanel;

import Back.Gerenciador;
import Back.Professor;

import javax.swing.JLabel;
import java.awt.Font;

public class TeachersInformation extends JFrame {

    JPanel panel = new JPanel();
    JLabel label = new JLabel("INFORMAÇÕES DO PROFESSOR");
    JLabel nameTitle = new JLabel("Nome:");
    JLabel cttTitle = new JLabel("Telefone:");
    JLabel addrTitle = new JLabel("Endereço:");
    JLabel nascDateTitle = new JLabel("Data de nascimento:");
    JLabel salTitle = new JLabel("Salário:");

    JLabel nameContent = new JLabel();
    JLabel cttContent = new JLabel();
    JLabel addrContent = new JLabel();
    JLabel nascDateContent = new JLabel();
    JLabel salContent = new JLabel();

    Gerenciador gerenciador;
    Professor professor;
    String id;

    public TeachersInformation(Gerenciador gerenciador , String id) {

        this.gerenciador = gerenciador;
        this.id = id;
        int idInteiro = Integer.parseInt(this.id);

        for (int i = 0 ; i < gerenciador.getProfessoresCadastrados().size() ; i++){
            if(idInteiro == gerenciador.getProfessoresCadastrados().get(i).getId_professor()){
                this.professor = gerenciador.getProfessoresCadastrados().get(i);
            }
        }


        label.setBounds(18,15,400,25);
        label.setFont(new Font(null,Font.BOLD,20));

        nameTitle.setBounds(18,65,300,25);
        nameTitle.setFont(new Font(null,Font.BOLD,17));
        nameContent.setBounds(338,65,300,25);
        nameContent.setFont(new Font(null,Font.PLAIN,17));
        nameContent.setText(this.professor.getNome());

        cttTitle.setBounds(18,95,300,25);
        cttTitle.setFont(new Font(null,Font.BOLD,17));
        cttContent.setBounds(338,95,300,25);
        cttContent.setFont(new Font(null,Font.PLAIN,17));
        cttContent.setText(this.professor.getTelefone());

        addrTitle.setBounds(18,125,300,25);
        addrTitle.setFont(new Font(null,Font.BOLD,17));
        addrContent.setBounds(338,125,300,25);
        addrContent.setFont(new Font(null,Font.PLAIN,17));
        addrContent.setText(this.professor.getEndereco());

        nascDateTitle.setBounds(18,155,300,25);
        nascDateTitle.setFont(new Font(null,Font.BOLD,17));
        nascDateContent.setBounds(338,155,300,25);
        nascDateContent.setFont(new Font(null,Font.PLAIN,17));
        nascDateContent.setText(this.professor.getData_nascimento());

        salTitle.setBounds(18,185,300,25);
        salTitle.setFont(new Font(null,Font.BOLD,17));
        salContent.setBounds(338,185,300,25);
        salContent.setFont(new Font(null,Font.PLAIN,17));
        salContent.setText("R$ " + this.professor.getSalario());

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
        panel.setLayout(null);

        add(panel);
        setTitle("Informações do professor");
        setSize(600, 260);

    }
}
