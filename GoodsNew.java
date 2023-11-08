import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;

import java.awt.Font;

public class GoodsNew  extends JFrame  {
   
    JPanel panel = new JPanel();

    JLabel label = new JLabel("ADICIONAR NOVO PRODUTO");
    JLabel nameTitle = new JLabel("Nome:");
    JLabel typeTitle = new JLabel("Tipo de produto:");
    JLabel valueTitle = new JLabel("Valor por unidade:");
    JLabel rechargeDateTitle = new JLabel("Última regarga de estoque:");
    JLabel quantTitle = new JLabel("Quantia em estoque:");

    JTextField nameField = new JTextField("Nome do produto");
    JTextField typeField = new JTextField("Alimento / Uniforme");
    JTextField valueField = new JTextField("2040");
    JFormattedTextField rechargeDateField = new JFormattedTextField(createDateFormat());
    JTextField quantField = new JTextField("0");

    JButton confirmButtom = new JButton("Adicionar produto");

    public GoodsNew(){
        label.setBounds(18,15,600,25);
        label.setFont(new Font(null,Font.BOLD,20));

        nameTitle.setBounds(18,65,300,25);
        nameTitle.setFont(new Font(null,Font.BOLD,17));

        nameField.setBounds(318,65,200,25);
        nameField.setDocument(new JTextFieldLimit(30)); // Definir tamanho da string
        nameField.setText("Nome completo");

        valueTitle.setBounds(18,95,300,25);
        valueTitle.setFont(new Font(null,Font.BOLD,17));

        valueField.setBounds(318,95,200,25);
        valueField.setDocument(new JTextFieldLimit(13));
        valueField.setText("(00)900000000");

        typeTitle.setBounds(18,125,300,25);
        typeTitle.setFont(new Font(null,Font.BOLD,17));
        typeField.setBounds(318,125,200,25);
        typeField.setDocument(new JTextFieldLimit(20));
        typeField.setText("Tipo do produto");

        rechargeDateTitle.setBounds(18,155,300,25);
        rechargeDateTitle.setFont(new Font(null,Font.BOLD,17));

        rechargeDateField.setBounds(318,155,80,25);
        rechargeDateField.setColumns(10);

        quantTitle.setBounds(18,185,300,25);
        quantTitle.setFont(new Font(null,Font.BOLD,17));

        quantField.setBounds(318,185,100,25);
        quantField.setDocument(new JTextFieldLimit(10));
        quantField.setText("0000.00");

        confirmButtom.setBounds(370,225,200,25);
        confirmButtom.setFocusable(false);

        panel.add(label);
        panel.add(nameTitle);
        panel.add(valueTitle);
        panel.add(rechargeDateTitle);
        panel.add(quantTitle);
        panel.add(typeTitle);
        panel.add(typeField);
        panel.add(nameField);
        panel.add(valueField);
        panel.add(rechargeDateField);
        panel.add(quantField);

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
}
