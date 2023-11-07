import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GoodsPage implements ActionListener {
    JLabel goodsTitle = new JLabel("Pagina dos Produtos.");
    JButton comebackButton = new JButton("Voltar");
    JFrame frame = new JFrame();
    public GoodsPage(){

        goodsTitle.setBounds(20,20,600,35);
        goodsTitle.setFont(new Font(null , Font.BOLD, 25));;
    
        comebackButton.setBounds(860,620,100,25);
        comebackButton.setFocusable(false);
        comebackButton.addActionListener(this);

        frame.add(comebackButton);
        frame.add(goodsTitle);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000 , 700);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == comebackButton){
            WelcomePage welcomePage = new WelcomePage();
            frame.dispose();
        }
    }

}
