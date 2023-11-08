import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
public class StudentsUpdate {
    public void setVisible(boolean b) {
    }
    JPanel panel = new JPanel();

    JLabel label = new JLabel("ATUALIZAR INFORMAÇÕES DO ALUNO");
    JLabel nameTitle = new JLabel("Nome:");
    JLabel cttTitle = new JLabel("Telefone:");
    JLabel cttEMTitle = new JLabel("Contato de emergência:");
    JLabel nascDateTitle = new JLabel("Data de nascimento:");
    JLabel menTitle = new JLabel("Mensalidade:");

    ////////////////////////JLabel nameContent = new JLabel("Nome do Professor");
    //    JLabel cttContent = new JLabel("(99) 99999-9999");
    //    JLabel cttEMContent = new JLabel("(99) 99999-9999");
    //    JLabel nascDateContent = new JLabel("00/00/0000");
    //    JLabel menContent = new JLabel("R$ " + 100.00);
    JTextField nameField = new JTextField("Nome Completo");
    JTextField cttField = new JTextField("(00)900000000");
    JTextField cttEMField = new JTextField("(00)900000000");
    JFormattedTextField nascDateField = new JFormattedTextField(createDateFormat());
    JTextField menField = new JTextField("0000.00");

    JButton confirmButtom = new JButton("Confirmar alterações");

    public StudentsUpdate() {
        label.setBounds(18, 15, 600, 25);
        label.setFont(new Font(null, Font.BOLD, 20));

        nameTitle.setBounds(18, 65, 300, 25);
        nameTitle.setFont(new Font(null, Font.BOLD, 17));

        nameField.setBounds(318, 65, 200, 25);
        nameField.setDocument(new JTextFieldLimit(30)); // Definir tamanho da string
        nameField.setText("Nome completo");

        cttTitle.setBounds(18, 95, 300, 25);
        cttTitle.setFont(new Font(null, Font.BOLD, 17));

        cttField.setBounds(318, 95, 200, 25);
        cttField.setDocument(new JTextFieldLimit(13));
        cttField.setText("(00)900000000");

        cttEMTitle.setBounds(18, 125, 300, 25);
        cttEMTitle.setFont(new Font(null, Font.BOLD, 17));

        cttEMField.setBounds(318, 125, 200, 25);
        cttEMField.setDocument(new JTextFieldLimit(30));
        cttEMField.setText("Rua, N, Bairro");

        nascDateTitle.setBounds(18, 155, 300, 25);
        nascDateTitle.setFont(new Font(null, Font.BOLD, 17));

        nascDateField.setBounds(318, 155, 80, 25);
        nascDateField.setColumns(10);

        menTitle.setBounds(18, 185, 300, 25);
        menTitle.setFont(new Font(null, Font.BOLD, 17));

        menField.setBounds(318, 185, 100, 25);
        menField.setDocument(new JTextFieldLimit(10));
        menField.setText("0000.00");

        confirmButtom.setBounds(370, 225, 200, 25);
        confirmButtom.setFocusable(false);

        panel.add(label);
        panel.add(nameTitle);
        panel.add(cttTitle);
        panel.add(cttEMTitle);
        panel.add(nascDateTitle);
        panel.add(menTitle);

        panel.add(nameField);
        panel.add(cttField);
        panel.add(cttEMField);
        panel.add(nascDateField);
        panel.add(menField);

        panel.add(confirmButtom);

        panel.setLayout(null);

        panel.add(panel);
        setTitle("Atualizar informações do aluno");
        panel.setSize(600, 300);
    }

    private void setTitle(String atualizarInformaçõesDoAluno) {
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