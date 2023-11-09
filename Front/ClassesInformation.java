
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class ClassesInformation extends JFrame  {
    
JPanel panel = new JPanel();
JLabel label = new JLabel("INFORMAÇÕES DA TURMA");
JLabel modeTitle = new JLabel("Modalidade:");
JLabel teachersNameTitle = new JLabel("Nome do professor:");
JLabel weekDayTitle = new JLabel("Dia da semana:");
JLabel timeTitle = new JLabel("Horário:");
JLabel quantMatesTitle = new JLabel("Quantidade de alunos: ");

JLabel modeContent = new JLabel("Jiu Jitsu");
JLabel teachersNameContent = new JLabel("Ronald Paixao");
JLabel weekDayContent = new JLabel("Segunda");
JLabel timeContent = new JLabel("15:22");
JLabel quantMatesContent = new JLabel("20");

    public ClassesInformation() {

        label.setBounds(18,15,400,25);
        label.setFont(new Font(null,Font.BOLD,20));

        modeTitle.setBounds(18,65,300,25);
        modeTitle.setFont(new Font(null,Font.BOLD,17));
        modeContent.setBounds(338,65,300,25);
        modeContent.setFont(new Font(null,Font.PLAIN,17));

        teachersNameTitle.setBounds(18,95,300,25);
        teachersNameTitle.setFont(new Font(null,Font.BOLD,17));
        teachersNameContent.setBounds(338,95,300,25);
        teachersNameContent.setFont(new Font(null,Font.PLAIN,17));

        weekDayTitle.setBounds(18,125,300,25);
        weekDayTitle.setFont(new Font(null,Font.BOLD,17));
        weekDayContent.setBounds(338,125,300,25);
        weekDayContent.setFont(new Font(null,Font.PLAIN,17));

        timeTitle.setBounds(18,155,300,25);
        timeTitle.setFont(new Font(null,Font.BOLD,17));
        timeContent.setBounds(338,155,300,25);
        timeContent.setFont(new Font(null,Font.PLAIN,17));

        quantMatesTitle.setBounds(18,185,300,25);
        quantMatesTitle.setFont(new Font(null,Font.BOLD,17));
        quantMatesContent.setBounds(338,185,300,25);
        quantMatesContent.setFont(new Font(null,Font.PLAIN,17));
       
        panel.add(label);
        panel.add(modeTitle);
        panel.add(modeContent);
        panel.add(teachersNameTitle);
        panel.add(teachersNameContent);
        panel.add(weekDayTitle);
        panel.add(weekDayContent);
        panel.add(timeTitle);
        panel.add(timeContent);
        panel.add(quantMatesTitle);
        panel.add(quantMatesContent);
        panel.setLayout(null);

        add(panel);
        setTitle("Informações do professor");
        setSize(600, 260);

    }

}
