import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class ClassesNew extends JFrame {

    // Banco de items somente para testar o select, sera trocado pelo bd
    String[] items = {"Professor 1", "Professor 2","Professor 3","Professor 4"};

    JPanel panel = new JPanel();

    JLabel label = new JLabel("ADICIONAR NOVA TURMA");
    JLabel modeTitle = new JLabel("Modalidade:");
    JLabel teachersNameTitle = new JLabel("Nome do professor:");
    JLabel weekDayTitle = new JLabel("Dia da semana:");
    JLabel timeTitle = new JLabel("Horário:");

    JTextField modeField = new JTextField("Nome da modalidade");
    JComboBox<String> teachersNameField = new JComboBox<>(items); 
    JTextField weekDayField = new JTextField("Dia da semana");
    JTextField timeField = new JTextField("HH:MM",10);

    JButton confirmButtom = new JButton("Adicionar turma");

    public ClassesNew(){
        label.setBounds(18,15,600,25);
        label.setFont(new Font(null,Font.BOLD,20));

        modeTitle.setBounds(18,65,300,25);
        modeTitle.setFont(new Font(null,Font.BOLD,17));

        modeField.setBounds(318,65,200,25);
        modeField.setDocument(new JTextFieldLimit(30)); // Definir tamanho da string
        modeField.setText("Nome da modalidade");

        teachersNameTitle.setBounds(18,95,300,25);
        teachersNameTitle.setFont(new Font(null,Font.BOLD,17));

        teachersNameField.setBounds(318,95,200,25);

        weekDayTitle.setBounds(18,125,300,25);
        weekDayTitle.setFont(new Font(null,Font.BOLD,17));

        weekDayField.setBounds(318,125,200,25);
        weekDayField.setDocument(new JTextFieldLimit(30));
        weekDayField.setText("Dia da semana");

        timeTitle.setBounds(18,155,300,25);
        timeTitle.setFont(new Font(null,Font.BOLD,17));

        timeField.setBounds(318,155,80,25);
        timeField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (timeField.getText().equals("HH:MM")) {
                    timeField.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (timeField.getText().isEmpty()) {
                    timeField.setText("HH:MM"); // Volte ao valor padrão se o campo estiver vazio
                }
            }
            
        });

        confirmButtom.setBounds(370,225,200,25);
        confirmButtom.setFocusable(false);

        panel.add(label);
        panel.add(modeTitle);
        panel.add(teachersNameTitle);
        panel.add(weekDayTitle);
        panel.add(timeTitle);

        panel.add(modeField);
        panel.add(teachersNameField);
        panel.add(weekDayField);
        panel.add(timeField);

        panel.add(confirmButtom);

        panel.setLayout(null);

        add(panel);
        setTitle("Atualizar informações do professor");
        setSize(600, 300);
    }

}
