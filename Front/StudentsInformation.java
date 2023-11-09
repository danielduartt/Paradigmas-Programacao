
import javax.swing.JFrame;
import javax.swing.JPanel;

import Back.Aluno;
import Back.Gerenciador;

import javax.swing.JLabel;
import java.awt.Font;

public class StudentsInformation extends JFrame{

    JPanel panel = new JPanel();
    JLabel label = new JLabel("INFORMAÇÕES DO ALUNO");
    JLabel nameTitle = new JLabel("Nome:");
    JLabel cttTitle = new JLabel("Telefone:");
    JLabel cttEMTitle = new JLabel("Contato de emergência:");
    JLabel nascDateTitle = new JLabel("Data de nascimento:");

    JLabel nameContent = new JLabel();
    JLabel cttContent = new JLabel();
    JLabel cttEMContent = new JLabel();
    JLabel nascDateContent = new JLabel();

    Gerenciador gerenciador;
    Aluno aluno;
    String matricula;

    public StudentsInformation(Gerenciador gerenciador, String matricula) {

        this.gerenciador = gerenciador;
        this.matricula = matricula;
        int matriculaInteiro = Integer.parseInt(this.matricula);

        for (int i = 0 ; i < gerenciador.getAlunosCadastrados().size() ; i++){
            if(matriculaInteiro == gerenciador.getAlunosCadastrados().get(i).getMatricula()){
                this.aluno = gerenciador.getAlunosCadastrados().get(i);
            }
        }

        label.setBounds(18,15,400,25);
        label.setFont(new Font(null,Font.BOLD,20));

        nameTitle.setBounds(18,65,300,25);
        nameTitle.setFont(new Font(null,Font.BOLD,17));
        nameContent.setBounds(338,65,300,25);
        nameContent.setFont(new Font(null,Font.PLAIN,17));
        nameContent.setText(this.aluno.getNome());

        cttTitle.setBounds(18,95,300,25);
        cttTitle.setFont(new Font(null,Font.BOLD,17));
        cttContent.setBounds(338,95,300,25);
        cttContent.setFont(new Font(null,Font.PLAIN,17));
        cttContent.setText(this.aluno.getTelefone());

        cttEMTitle.setBounds(18,125,300,25);
        cttEMTitle.setFont(new Font(null,Font.BOLD,17));
        cttEMContent.setBounds(338,125,300,25);
        cttEMContent.setFont(new Font(null,Font.PLAIN,17));
        cttEMContent.setText(this.aluno.getCtt_emergencia());

        nascDateTitle.setBounds(18,155,300,25);
        nascDateTitle.setFont(new Font(null,Font.BOLD,17));
        nascDateContent.setBounds(338,155,300,25);
        nascDateContent.setFont(new Font(null,Font.PLAIN,17));
        nascDateContent.setText(this.aluno.getData_nascimento());


        panel.add(label);
        panel.add(nameTitle);
        panel.add(nameContent);
        panel.add(cttTitle);
        panel.add(cttContent);
        panel.add(cttEMTitle);
        panel.add(nascDateTitle);
        panel.add(nascDateContent);
        panel.add(cttEMContent);
        panel.setLayout(null);

        add(panel);
        setTitle("Informações dos alunos");
        setSize(600, 314);

    }
}
