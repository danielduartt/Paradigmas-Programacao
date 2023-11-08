import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class GoodsInformation extends JFrame  {
    JPanel panel = new JPanel();
    JLabel label = new JLabel("INFORMAÇÕES DO PRODUTO");
    JLabel nameTitle = new JLabel("Nome:");
    JLabel cttTitle = new JLabel("Valor por unidade:");
    JLabel nascDateTitle = new JLabel("Recarga de estoque:");
    JLabel salTitle = new JLabel("Quantidade em estoque:");

    JLabel nameContent = new JLabel("Nome do produto");
    JLabel cttContent = new JLabel("R$ " + 120.22);
    JLabel nascDateContent = new JLabel("00/00/0000");
    JLabel salContent = new JLabel("5");

    public GoodsInformation(){
        label.setBounds(18,15,400,25);
        label.setFont(new Font(null,Font.BOLD,20));

        nameTitle.setBounds(18,65,300,25);
        nameTitle.setFont(new Font(null,Font.BOLD,17));
        nameContent.setBounds(338,65,300,25);
        nameContent.setFont(new Font(null,Font.PLAIN,17));

        cttTitle.setBounds(18,95,300,25);
        cttTitle.setFont(new Font(null,Font.BOLD,17));
        cttContent.setBounds(338,95,300,25);
        cttContent.setFont(new Font(null,Font.PLAIN,17));

        nascDateTitle.setBounds(18,155,300,25);
        nascDateTitle.setFont(new Font(null,Font.BOLD,17));
        nascDateContent.setBounds(338,155,300,25);
        nascDateContent.setFont(new Font(null,Font.PLAIN,17));

        salTitle.setBounds(18,185,300,25);
        salTitle.setFont(new Font(null,Font.BOLD,17));
        salContent.setBounds(338,185,300,25);
        salContent.setFont(new Font(null,Font.PLAIN,17));
       
        panel.add(label);
        panel.add(nameTitle);
        panel.add(nameContent);
        panel.add(cttTitle);
        panel.add(cttContent);
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
