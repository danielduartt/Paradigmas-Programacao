import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClassesPage implements ActionListener  {

    JLabel pageTitle = new JLabel("TURMAS");
    JLabel pageSubtitle = new JLabel("Gerencie todos as turmas da EJF");
    JLabel selectTitle = new JLabel("Selecione a turma");
    
    JFrame frame = new JFrame();

    JButton comebackButton = new JButton("Voltar");

    public ClassesPage(){

        pageTitle.setBounds(20,20,600,35);
        pageTitle.setFont(new Font(null , Font.BOLD, 30));

        pageSubtitle.setBounds(20,50,600, 35);
        pageSubtitle.setFont(new Font(null, Font.PLAIN, 18 ));
    
        selectTitle.setBounds(20, 100 , 310 , 35);
        selectTitle.setFont(new Font(null , Font.PLAIN , 20 ));

        comebackButton.setBounds(860,620,100,25);
        comebackButton.setFocusable(false);
        comebackButton.addActionListener(this);

        frame.add(comebackButton);
        frame.add(pageTitle);
        frame.add(pageSubtitle);
        frame.add(selectTitle);
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
