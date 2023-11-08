import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class GoodsInformation extends JFrame  {
    JPanel panel = new JPanel();
    JLabel label = new JLabel("INFORMAÇÕES DO PRODUTO");
    JLabel nameTitle = new JLabel("Nome:");
    JLabel typeTitle = new JLabel("Tipo de produto:");
    JLabel valueTitle = new JLabel("Valor por unidade:");
    JLabel rechargeDateTitle = new JLabel("Última recarga de estoque:");
    JLabel quantTitle = new JLabel("Quantidade em estoque:");

    JLabel nameContent = new JLabel("Nome do produto");
    JLabel typeContent = new JLabel("Alimento / Uniforme");
    JLabel valueContent = new JLabel("R$ " + 120.22);
    JLabel rechargeDateContent = new JLabel("00/00/0000");
    JLabel quantContent = new JLabel("5");

    public GoodsInformation(){
        label.setBounds(18,15,400,25);
        label.setFont(new Font(null,Font.BOLD,20));

        nameTitle.setBounds(18,65,300,25);
        nameTitle.setFont(new Font(null,Font.BOLD,17));
        nameContent.setBounds(338,65,300,25);
        nameContent.setFont(new Font(null,Font.PLAIN,17));

        typeTitle.setBounds(18,125,300,25);
        typeTitle.setFont(new Font(null,Font.BOLD,17));
        typeContent.setBounds(338,125,300,25);
        typeContent.setFont(new Font(null,Font.PLAIN,17));

        valueTitle.setBounds(18,95,300,25);
        valueTitle.setFont(new Font(null,Font.BOLD,17));
        valueContent.setBounds(338,95,300,25);
        valueContent.setFont(new Font(null,Font.PLAIN,17));

        rechargeDateTitle.setBounds(18,155,300,25);
        rechargeDateTitle.setFont(new Font(null,Font.BOLD,17));
        rechargeDateContent.setBounds(338,155,300,25);
        rechargeDateContent.setFont(new Font(null,Font.PLAIN,17));

        quantTitle.setBounds(18,185,300,25);
        quantTitle.setFont(new Font(null,Font.BOLD,17));
        quantContent.setBounds(338,185,300,25);
        quantContent.setFont(new Font(null,Font.PLAIN,17));
       
        panel.add(label);
        panel.add(nameTitle);
        panel.add(nameContent);
        panel.add(valueTitle);
        panel.add(valueContent);
        panel.add(rechargeDateTitle);
        panel.add(rechargeDateContent);
        panel.add(typeTitle);
        panel.add(typeContent);
        panel.add(quantTitle);
        panel.add(quantContent);
        panel.setLayout(null);

        add(panel);
        setTitle("Informações do professor");
        setSize(600, 260);
    }
}
