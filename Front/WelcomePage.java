
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Back.Gerenciador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage implements ActionListener {

    JFrame frame = new JFrame();
    JLabel welcomeTitle = new JLabel("Gerenciador de atividades da Escola JF");
    JLabel welcomeSubtitle = new JLabel("Bem vindo");
    JButton teachersButton = new JButton("Professores");
    JButton studentsButton = new JButton("Alunos");
    JButton classesButton = new JButton("Turmas");
    Gerenciador gerenciador;

    public WelcomePage(Gerenciador gerenciador){

        this.gerenciador = gerenciador;

        welcomeTitle.setBounds(20,20,600,35);
        welcomeTitle.setFont(new Font(null , Font.BOLD, 25));

        welcomeSubtitle.setBounds(21,47,600,35);
        welcomeSubtitle.setFont(new Font(null , Font.PLAIN, 18));

        //                         125
        teachersButton.setBounds(20 , 100 , 130 , 55);
        teachersButton.setFocusable(false);
        teachersButton.addActionListener(this);

        studentsButton.setBounds(190 , 100 , 130 , 55);
        studentsButton.setFocusable(false);
        studentsButton.addActionListener(this);

        classesButton.setBounds(355 , 100 , 130 , 55);
        classesButton.setFocusable(false);
        classesButton.addActionListener(this);

        frame.add(teachersButton);
        frame.add(studentsButton);
        frame.add(classesButton);
        frame.add(welcomeSubtitle);
        frame.add(welcomeTitle);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(535 , 220);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override

    public void actionPerformed(ActionEvent e){

        if(e.getSource() == teachersButton){
            TeachersPage teachersPage = new TeachersPage(this.gerenciador);
            frame.dispose();
        }

        if(e.getSource() == studentsButton){
            StudentsPage studentsPage = new StudentsPage(this.gerenciador);
            frame.dispose();
        }

        if(e.getSource() == classesButton){
            ClassesPage classesPage = new ClassesPage(this.gerenciador);
            frame.dispose();
        }

    }


}
