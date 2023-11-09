
import javax.swing.text.MaskFormatter;

import Back.Aluno;
import Back.Gerenciador;
import Back.Professor;

import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JFrame;



public class StudentsUpdate extends JFrame implements ActionListener{

    JPanel panel = new JPanel();

    JLabel label = new JLabel("ATUALIZAR INFORMAÇÕES DO ALUNO");
    JLabel nameTitle = new JLabel("Nome:");
    JLabel cttTitle = new JLabel("Telefone:");
    JLabel cttEMTitle = new JLabel("Contato de emergência:");
    JLabel nascDateTitle = new JLabel("Data de nascimento:");

    JTextField nameField = new JTextField("Nome Completo");
    JTextField cttField = new JTextField("(00)900000000");
    JTextField cttEMField = new JTextField("(00)900000000");
    JFormattedTextField nascDateField = new JFormattedTextField(createDateFormat());

    JButton confirmButtom = new JButton("Confirmar alterações");

    Gerenciador gerenciador;
    Aluno aluno;
    String matricula;
    int matriculaInteiro;

    public StudentsUpdate(Gerenciador gerenciador , String matricula) {

        this.gerenciador = gerenciador;
        this.matricula = matricula;
        this.matriculaInteiro = Integer.parseInt(this.matricula);

        for (int i = 0 ; i < gerenciador.getAlunosCadastrados().size() ; i++){
            if(this.matriculaInteiro == gerenciador.getAlunosCadastrados().get(i).getMatricula()){
                this.aluno = gerenciador.getAlunosCadastrados().get(i);
            }
        }

        label.setBounds(18, 15, 600, 25);
        label.setFont(new Font(null, Font.BOLD, 20));

        nameTitle.setBounds(18, 65, 300, 25);
        nameTitle.setFont(new Font(null, Font.BOLD, 17));

        nameField.setBounds(318, 65, 200, 25);
        nameField.setDocument(new JTextFieldLimit(30)); // Definir tamanho da string
        nameField.setText(this.aluno.getNome());

        cttTitle.setBounds(18, 95, 300, 25);
        cttTitle.setFont(new Font(null, Font.BOLD, 17));

        cttField.setBounds(318, 95, 200, 25);
        cttField.setDocument(new JTextFieldLimit(13));
        cttField.setText(this.aluno.getTelefone());

        cttEMTitle.setBounds(18, 125, 300, 25);
        cttEMTitle.setFont(new Font(null, Font.BOLD, 17));

        cttEMField.setBounds(318, 125, 200, 25);
        cttEMField.setDocument(new JTextFieldLimit(30));
        cttEMField.setText(this.aluno.getCtt_emergencia());

        nascDateTitle.setBounds(18, 155, 300, 25);
        nascDateTitle.setFont(new Font(null, Font.BOLD, 17));

        nascDateField.setBounds(318, 155, 80, 25);
        nascDateField.setColumns(10);
        nascDateField.setText(this.aluno.getData_nascimento());

        confirmButtom.setBounds(370, 270, 200, 25);
        confirmButtom.setFocusable(false);
        confirmButtom.addActionListener(this);

        panel.add(label);
        panel.add(nameTitle);
        panel.add(cttTitle);
        panel.add(cttEMTitle);
        panel.add(nascDateTitle);

        panel.add(nameField);
        panel.add(cttField);
        panel.add(cttEMField);
        panel.add(nascDateField);

        panel.add(confirmButtom);
        panel.setLayout(null);

        add(panel);
        setTitle("Atualizar informações do aluno");
        setSize(600, 345);
    }

    private static MaskFormatter createDateFormat() {
        MaskFormatter dateFormatter = null;
        try {
            dateFormatter = new MaskFormatter("##/##/####");
            dateFormatter.setPlaceholderCharacter('_');
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dateFormatter;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == confirmButtom){

            String newName = nameField.getText();
            String newCtt = cttField.getText();
            String newCttEM = cttEMField.getText();
            String newNascDate = nascDateField.getText();

            Aluno aluno = new Aluno(this.matriculaInteiro, newCttEM, newName, newCtt, newNascDate);
            
            this.gerenciador.AlterarDadoAluno(aluno);
            panel.setVisible(false);

        }
    }

}