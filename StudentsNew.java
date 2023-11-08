import javax.swing.text.MaskFormatter;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;

public class StudentsNew extends JFrame {

    JPanel panel = new JPanel();

    JLabel label = new JLabel("ADICIONAR NOVO ALUNO");
    JLabel nameTitle = new JLabel("Nome:");
    JLabel cttTitle = new JLabel("Telefone:");
    JLabel nascDateTitle = new JLabel("Data de nascimento:");
    JLabel menTitle = new JLabel("Mensalidade:");

    JTextField nameField = new JTextField("Nome Completo");
    JTextField cttField = new JTextField("(00)900000000");
    JTextField cttEMField = new JTextField("(00)900000000");
    JFormattedTextField nascDateField = new JFormattedTextField(createDateFormat());
    JTextField menField = new JTextField("0000.00");

    JButton confirmButtom = new JButton("Adicionar aluno");

    public StudentsNew (){
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

        cttEMField.setBounds(318,95,200,25);
        cttEMField.setDocument(new JTextFieldLimit(13));
        cttEMField.setText("(00)900000000");



        nascDateTitle.setBounds(18,155,300,25);
        nascDateTitle.setFont(new Font(null,Font.BOLD,17));

        nascDateField.setBounds(318,155,80,25);
        nascDateField.setColumns(10);

        menTitle.setBounds(18,185,300,25);
        menTitle.setFont(new Font(null,Font.BOLD,17));

        menField.setBounds(318,185,100,25);
        menField.setDocument(new JTextFieldLimit(10));
        menField.setText("0000.00");

        confirmButtom.setBounds(370,225,200,25);
        confirmButtom.setFocusable(false);

        panel.add(label);
        panel.add(nameTitle);
        panel.add(cttTitle);


        panel.add(nascDateTitle);
        panel.add(menTitle);

        panel.add(nameField);
        panel.add(cttField);
        panel.add(cttEMField);
        panel.add(nascDateField);
        panel.add(menField);

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

}