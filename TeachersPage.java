import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeachersPage implements ActionListener {
    JLabel pageTitle = new JLabel("PROFESSORES");
    JLabel pageSubtitle = new JLabel("Gerencie todos os professores da EJF");
    JLabel selectTitle = new JLabel("Selecione o professor");
    JButton teacherInformations = new JButton("Informações do professor");
    JButton teacherUpdate = new JButton("Atualizar informações do professor");
    JButton deleteTeacher = new JButton("Deletar professor");
    JButton addTeacher = new JButton("Adicionar novo professor");
    JButton comebackButton = new JButton("Voltar");
    JFrame frame = new JFrame();
    JPanel teachersContainer = new JPanel();
    JScrollPane scrollTeahcerContainer = new JScrollPane(teachersContainer);

    public TeachersPage(){

        pageTitle.setBounds(20,20,600,35);
        pageTitle.setFont(new Font(null , Font.BOLD, 30));

        selectTitle.setBounds(20, 100 , 310 , 35);
        selectTitle.setFont(new Font(null , Font.PLAIN , 20 ));

        pageSubtitle.setBounds(20,50,600, 35);
        pageSubtitle.setFont(new Font(null, Font.PLAIN, 18 ));

        teacherInformations.setBounds(400, 135 , 300 , 40);
        teacherInformations.setFocusable(false);
        teacherInformations.addActionListener(this);

        teacherUpdate.setBounds(400, 205 , 300 , 40);
        teacherUpdate.setFocusable(false);
        teacherUpdate.addActionListener(this);

        addTeacher.setBounds(400, 274 , 300 , 40);
        addTeacher.setFocusable(false);
        addTeacher.addActionListener(this);

        deleteTeacher.setBounds(400, 344 , 300 , 40);
        deleteTeacher.setFocusable(false);
        deleteTeacher.addActionListener(this);
        deleteTeacher.setBackground(new Color(255, 180, 180));

    
        comebackButton.setBounds(600,400,100,25);
        comebackButton.setFocusable(false);
        comebackButton.addActionListener(this);

        teachersContainer.setLayout(new BoxLayout(teachersContainer, BoxLayout.Y_AXIS));

        scrollTeahcerContainer.setBounds(20 , 135 , 310 , 250);

        // Painel com todos os professores --------

        for (int i = 0; i < 20; i++) {
            JButton teacher = new JButton("Professor " + i + ": Lucas Martins Campos Matos");
            teacher.setPreferredSize(new Dimension(290, 70));
            teacher.setFont(new Font(null , Font.PLAIN , 14));
            teacher.setFocusable(false);
            teachersContainer.add(teacher);
        }

        //-----------------------------------------

        frame.add(scrollTeahcerContainer, BorderLayout.CENTER);
        frame.add(comebackButton);
        frame.add(teacherInformations);
        frame.add(addTeacher);
        frame.add(deleteTeacher);
        frame.add(teacherUpdate);
        frame.add(selectTitle);
        frame.add(pageTitle);
        frame.add(pageSubtitle);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(735 , 480);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == comebackButton){
            WelcomePage welcomePage = new WelcomePage();
            frame.dispose();
        }

        if(e.getSource() == teacherInformations){
            TeachersInformation teachersInformation = new TeachersInformation();
            teachersInformation.setVisible(true);
        }
    }

}
