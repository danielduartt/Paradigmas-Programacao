
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import Back.Gerenciador;
import Back.Professor;

import java.text.ParseException;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeachersUpdate extends JFrame implements ActionListener{

    JPanel panel = new JPanel();

    JLabel label = new JLabel("ATUALIZAR INFORMAÇÕES DO PROFESSOR");
    JLabel nameTitle = new JLabel("Nome:");
    JLabel cttTitle = new JLabel("Telefone:");
    JLabel addrTitle = new JLabel("Endereço:");
    JLabel nascDateTitle = new JLabel("Data de nascimento:");
    JLabel salTitle = new JLabel("Salário:");

    JTextField nameField = new JTextField("Nome Completo");
    JTextField cttField = new JTextField("(00)900000000");
    JTextField addrField = new JTextField("Rua, N, Bairro");
    JFormattedTextField nascDateField = new JFormattedTextField(createDateFormat());
    JTextField salField = new JTextField("0000.00");

    JButton confirmButtom = new JButton("Confirmar alterações");

    Gerenciador gerenciador;
    Professor professor;
    String id;
    int idInteiro;

    public TeachersUpdate(Gerenciador gerenciador , String id){

        this.gerenciador = gerenciador;
        this.id = id;
        this.idInteiro = Integer.parseInt(this.id);

        for (int i = 0 ; i < gerenciador.getProfessoresCadastrados().size() ; i++){
            if(this.idInteiro == gerenciador.getProfessoresCadastrados().get(i).getId_professor()){
                this.professor = gerenciador.getProfessoresCadastrados().get(i);
            }
        }

        label.setBounds(18,15,600,25);
        label.setFont(new Font(null,Font.BOLD,20));

        nameTitle.setBounds(18,65,300,25);
        nameTitle.setFont(new Font(null,Font.BOLD,17));

        nameField.setBounds(318,65,200,25);
        nameField.setDocument(new JTextFieldLimit(30)); // Definir tamanho da string
        nameField.setText(this.professor.getNome());

        cttTitle.setBounds(18,95,300,25);
        cttTitle.setFont(new Font(null,Font.BOLD,17));

        cttField.setBounds(318,95,200,25);
        cttField.setDocument(new JTextFieldLimit(13));
        cttField.setText(this.professor.getTelefone());

        addrTitle.setBounds(18,125,300,25);
        addrTitle.setFont(new Font(null,Font.BOLD,17));

        addrField.setBounds(318,125,200,25);
        addrField.setDocument(new JTextFieldLimit(30));
        addrField.setText(this.professor.getEndereco());

        nascDateTitle.setBounds(18,155,300,25);
        nascDateTitle.setFont(new Font(null,Font.BOLD,17));

        nascDateField.setBounds(318,155,80,25);
        nascDateField.setColumns(10);
        nascDateField.setText(this.professor.getData_nascimento());

        salTitle.setBounds(18,185,300,25);
        salTitle.setFont(new Font(null,Font.BOLD,17));

        salField.setBounds(318,185,100,25);
        salField.setDocument(new JTextFieldLimit(10));
        salField.setText(Double.toString(this.professor.getSalario()));

        confirmButtom.setBounds(370,225,200,25);
        confirmButtom.setFocusable(false);
        confirmButtom.addActionListener(this);

        panel.add(label);
        panel.add(nameTitle);
        panel.add(cttTitle);
        panel.add(addrTitle);
        panel.add(nascDateTitle);
        panel.add(salTitle);

        panel.add(nameField);
        panel.add(cttField);
        panel.add(addrField);
        panel.add(nascDateField);
        panel.add(salField);

        panel.add(confirmButtom);

        panel.setLayout(null);

        add(panel);
        setTitle("Atualizar informações do professor");
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
            String newAddr = addrField.getText();
            String newNascDate = nascDateField.getText();
            Double newSal = Double.parseDouble(salField.getText());

            Professor professor = new Professor(this.idInteiro,newAddr,newSal, newName,newCtt ,newNascDate);

            this.gerenciador.AlterarDadoProfessor(professor);
            panel.setVisible(false);

        }

    }

}
