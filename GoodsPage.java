import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GoodsPage implements ActionListener {
    JLabel pageTitle = new JLabel("PRODUTOS");
    JLabel pageSubtitle = new JLabel("Gerencie todos os produtos da EJF");
    JButton comebackButton = new JButton("Voltar");
    JFrame frame = new JFrame();
    public GoodsPage(){

        pageTitle.setBounds(20,20,600,35);
        pageTitle.setFont(new Font(null , Font.BOLD, 30));

        pageSubtitle.setBounds(20,50,600, 35);
        pageSubtitle.setFont(new Font(null, Font.PLAIN, 18 ));
    
        comebackButton.setBounds(860,620,100,25);
        comebackButton.setFocusable(false);
        comebackButton.addActionListener(this);

        frame.add(comebackButton);
        frame.add(pageTitle);
        frame.add(pageSubtitle);
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
