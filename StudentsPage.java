import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BoxLayout;


public class StudentsPage implements ActionListener  {

    //Textos
    JLabel pageTitle = new JLabel("ALUNOS");
    JLabel pageSubtitle = new JLabel("Gerencie todos os alunos da EJF");

    //Botões 
    JLabel selectTitle = new JLabel("Selecione o aluno");
    JButton StudentsInformation = new JButton("Informações do aluno");
    JButton StudentsUpdate = new JButton("Atualizar informações do aluno");
    JButton deleteStudent = new JButton("Deletar aluno");
    JButton addStudent = new JButton("Adicionar novo aluno");
    JButton comebackButton = new JButton("Voltar");

    //Estruturas
    JPanel studentsContainer = new JPanel(); 
    JScrollPane scrollTeahcerContainer = new JScrollPane(studentsContainer);
    JFrame frame = new JFrame();

    public StudentsPage(){

        pageTitle.setBounds(20,20,600,35);
        pageTitle.setFont(new Font(null , Font.BOLD, 30));

        selectTitle.setBounds(20, 100 , 310 , 35);
        selectTitle.setFont(new Font(null , Font.PLAIN , 20 ));

        pageSubtitle.setBounds(20,50,600, 35);
        pageSubtitle.setFont(new Font(null, Font.PLAIN, 18 ));

        StudentsInformation.setBounds(400, 135 , 300 , 40);
        StudentsInformation.setFocusable(false);
        StudentsInformation.addActionListener(this);

        StudentsUpdate.setBounds(400, 205 , 300 , 40);
        StudentsUpdate.setFocusable(false);
        StudentsUpdate.addActionListener(this);

        addStudent.setBounds(400, 274 , 300 , 40);
        addStudent.setFocusable(false);
        addStudent.addActionListener(this);

        deleteStudent.setBounds(400, 344 , 300 , 40);
        deleteStudent.setFocusable(false);
        deleteStudent.addActionListener(this);

        comebackButton.setBounds(600,400,100,25);
        comebackButton.setFocusable(false);
        comebackButton.addActionListener(this);

        studentsContainer.setLayout(new BoxLayout(studentsContainer, BoxLayout.Y_AXIS));

        scrollTeahcerContainer.setBounds(20 , 135 , 310 , 250);

        // Painel com todos os alunos --------

        for (int i = 0; i < 20; i++) {
            JButton student = new JButton("Aluno " + i + ": Marina Luanda");
            student.setPreferredSize(new Dimension(290, 70));
            student.setFont(new Font(null , Font.PLAIN , 14));
            student.setFocusable(false);
            studentsContainer.add(student);
        }

        //-----------------------------------------

        frame.add(scrollTeahcerContainer, BorderLayout.CENTER);
        frame.add(comebackButton);
        frame.add(StudentsInformation);
        frame.add(addStudent);
        frame.add(deleteStudent);
        frame.add(StudentsUpdate);
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

        if(e.getSource() == StudentsInformation){
            StudentsInformation studentsInformation = new StudentsInformation();
            studentsInformation.setVisible(true);
        }

        if(e.getSource() == StudentsUpdate){
            StudentsUpdate studentsUpdate = new StudentsUpdate();
            studentsUpdate.setVisible(true);
        }

        if(e.getSource() == addStudent){
            StudentsNew studentsNew = new StudentsNew();
            studentsNew.setVisible(true);
        }

    }

    }
