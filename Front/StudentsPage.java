
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Back.Gerenciador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;

public class StudentsPage implements ActionListener  {

    String[] students = {"Lucas Martins" , "Teresa Costa" , "Raimundo Plinho"};

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
    JFrame frame = new JFrame();
    JPanel studentsContainer = new JPanel(); 

    JComboBox<String> selectStudentsContainer;

    Gerenciador gerenciador;

    public StudentsPage(Gerenciador gerenciador){

        this.gerenciador = gerenciador;
        
        String list[] = new String[gerenciador.getAlunosCadastrados().size()];

        for(int i = 0 ; i<gerenciador.getAlunosCadastrados().size() ; i++){
            Integer temp = gerenciador.getAlunosCadastrados().get(i).getMatricula();
            list[i] = temp.toString();
        }

        this.selectStudentsContainer = new JComboBox<>(list);

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

        addStudent.setBounds(20, 205 , 300 , 40);
        addStudent.setFocusable(false);
        addStudent.addActionListener(this);

        deleteStudent.setBounds(20, 274 , 680 , 40);
        deleteStudent.setFocusable(false);
        deleteStudent.addActionListener(this);

        comebackButton.setBounds(600,330,100,25);
        comebackButton.setFocusable(false);
        comebackButton.addActionListener(this);

        studentsContainer.setLayout(new BoxLayout(studentsContainer, BoxLayout.Y_AXIS));

        selectStudentsContainer.setBounds(20 , 135 , 300 , 35);

        frame.add(selectStudentsContainer, BorderLayout.CENTER);
        frame.add(comebackButton);
        frame.add(StudentsInformation);
        frame.add(addStudent);
        frame.add(deleteStudent);
        frame.add(StudentsUpdate);
        frame.add(selectTitle);
        frame.add(pageTitle);
        frame.add(pageSubtitle);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(735 , 410);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == comebackButton){
            WelcomePage welcomePage = new WelcomePage(this.gerenciador);
            frame.dispose();
        }

        if(e.getSource() == StudentsInformation){
            StudentsInformation studentsInformation = new StudentsInformation(this.gerenciador , this.selectStudentsContainer.getSelectedItem().toString());
            studentsInformation.setVisible(true);
        }

        if(e.getSource() == StudentsUpdate){
            StudentsUpdate studentsUpdate = new StudentsUpdate(this.gerenciador , this.selectStudentsContainer.getSelectedItem().toString());
            studentsUpdate.setVisible(true);
        }

        if(e.getSource() == deleteStudent){
            int temp = Integer.parseInt(this.selectStudentsContainer.getSelectedItem().toString());
            this.gerenciador.RemoverAluno(temp);
        }

        if(e.getSource() == addStudent){
            StudentsNew studentsNew = new StudentsNew(this.gerenciador);
            studentsNew.setVisible(true);
        }

    }

    }
