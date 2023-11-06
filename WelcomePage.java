import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {
    
    JFrame frame = new JFrame();
    JLabel welcomeTitle = new JLabel("Gerenciador de atividade da Escola JF");
    JLabel welcomeSubtitle = new JLabel("Bem vindo");

    public WelcomePage(){

        welcomeTitle.setBounds(20,20,600,35);
        welcomeTitle.setFont(new Font(null , Font.BOLD, 25));

        welcomeSubtitle.setBounds(21,47,600,35);
        welcomeSubtitle.setFont(new Font(null , Font.PLAIN, 18));

        frame.add(welcomeSubtitle);
        frame.add(welcomeTitle);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1900 , 1000);
        frame.setLayout(null);
        frame.setVisible(true);

    }

} 
