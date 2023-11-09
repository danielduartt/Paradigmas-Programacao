
import javax.swing.text.MaskFormatter;

import Back.Aluno;
import Back.Gerenciador;
import Back.Professor;

import java.text.ParseException;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentsNew extends JFrame implements ActionListener{

    JPanel panel = new JPanel();

    JLabel label = new JLabel("ADICIONAR NOVO ALUNO");
    JLabel nameTitle = new JLabel("Nome:");
    JLabel cttTitle = new JLabel("Telefone:");
    JLabel cttEMTitle = new JLabel("Contato de emergência:");
    JLabel nascDateTitle = new JLabel("Data de nascimento:");

    JTextField nameField = new JTextField("Nome Completo");
    JTextField cttField = new JTextField("(00)900000000");
    JTextField cttEMField = new JTextField("(00)900000000");
    JFormattedTextField nascDateField = new JFormattedTextField(createDateFormat());

    JButton confirmButtom = new JButton("Adicionar aluno");

    Gerenciador gerenciador;

    public StudentsNew (Gerenciador gerenciador){

        this.gerenciador = gerenciador;

        label.setBounds(18,15,600,25);
        label.setFont(new Font(null,Font.BOLD,20));

        nameTitle.setBounds(18,65,300,25);
        nameTitle.setFont(new Font(null,Font.BOLD,17));

        nameField.setBounds(318,65,200,25);
        nameField.setDocument(new JTextFieldLimit(30)); // Definir tamanho da string
        nameField.setText("Nome completo");

        cttTitle.setBounds(18,95,300,25);
        cttTitle.setFont(new Font(null,Font.BOLD,17));

        cttField.setBounds(318,95,200,25);
        cttField.setDocument(new JTextFieldLimit(13));
        cttField.setText("(00)900000000");

        cttEMTitle.setBounds(18,125,200,25);
        cttEMTitle.setFont(new Font(null,Font.BOLD,17));

        cttEMField.setBounds(318,125,200,25);
        cttEMField.setDocument(new JTextFieldLimit(13));
        cttEMField.setText("(00)900000000");

        nascDateTitle.setBounds(18,155,300,25);
        nascDateTitle.setFont(new Font(null,Font.BOLD,17));

        nascDateField.setBounds(318,155,80,25);
        nascDateField.setColumns(10);

        confirmButtom.setBounds(370,225,200,25);
        confirmButtom.setFocusable(false);
        confirmButtom.addActionListener(this);

        panel.add(label);

        panel.add(nameTitle);
        panel.add(cttTitle);
        panel.add(nascDateTitle);
        panel.add(nameField);
        panel.add(cttField);
        panel.add(cttEMTitle);
        panel.add(cttEMField);
        panel.add(nascDateField);

        panel.add(confirmButtom);

        panel.setLayout(null);

        add(panel);
        setTitle("Atualizar informações do aluno");
        setSize(600, 300);
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
            Random random = new Random();
            int numeroAleatorio = random.nextInt(1000);

            Aluno aluno = new Aluno(numeroAleatorio, newCttEM, newName, newCtt, newNascDate);

            this.gerenciador.AdicionarAluno(aluno);
            panel.setVisible(false);

        }

    }

}
