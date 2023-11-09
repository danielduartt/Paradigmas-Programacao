
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Back.Gerenciador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClassesPage implements ActionListener  {

    String[] classes = {"Turma 1 : Jiu Jitsu" , "Turma 2: Muai Thay" , "Turma 3 : Judo"};

    JLabel pageTitle = new JLabel("TURMAS");
    JLabel pageSubtitle = new JLabel("Gerencie todas as turmas da EJF");
    JLabel selectTitle = new JLabel("Selecione a turma");

    JButton classInformations = new JButton("Informações da turma");
    JButton classUpdate = new JButton("Atualizar informações da turma");
    JButton deleteClass = new JButton("Deletar turma");
    JButton addClass = new JButton("Adicionar nova turma");
    JButton comebackButton = new JButton("Voltar");

    JFrame frame = new JFrame();
    JPanel classesContainer = new JPanel();

    JComboBox<String> selectClassesContainer = new JComboBox<>(classes);

    Gerenciador gerenciador;

    public ClassesPage(Gerenciador gerenciador){

        this.gerenciador = gerenciador;

        pageTitle.setBounds(20,20,600,35);
        pageTitle.setFont(new Font(null , Font.BOLD, 30));

        selectTitle.setBounds(20, 100 , 310 , 35);
        selectTitle.setFont(new Font(null , Font.PLAIN , 20 ));

        pageSubtitle.setBounds(20,50,600, 35);
        pageSubtitle.setFont(new Font(null, Font.PLAIN, 18 ));

        classInformations.setBounds(400, 135 , 300 , 40);
        classInformations.setFocusable(false);
        classInformations.addActionListener(this);

        classUpdate.setBounds(400, 205 , 300 , 40);
        classUpdate.setFocusable(false);
        classUpdate.addActionListener(this);

        addClass.setBounds(20, 205 , 300 , 40);
        addClass.setFocusable(false);
        addClass.addActionListener(this);

        deleteClass.setBounds(20, 274 , 680 , 40);
        deleteClass.setFocusable(false);
        deleteClass.addActionListener(this);
    
        comebackButton.setBounds(600,330,100,25);
        comebackButton.setFocusable(false);
        comebackButton.addActionListener(this);

        classesContainer.setLayout(new BoxLayout(classesContainer, BoxLayout.Y_AXIS));

        selectClassesContainer.setBounds(20 , 135 , 300 , 35);

        frame.add(selectClassesContainer, BorderLayout.CENTER);
        frame.add(comebackButton);
        frame.add(classInformations);
        frame.add(addClass);
        frame.add(deleteClass);
        frame.add(classUpdate);
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

        if(e.getSource() == classInformations){
            ClassesInformation classesInformation = new ClassesInformation();
            classesInformation.setVisible(true);
        }

        if(e.getSource() == classUpdate){
            ClassesUpdate classesUpdate = new ClassesUpdate();
            classesUpdate.setVisible(true);
        }

        if(e.getSource() == addClass){
            ClassesNew classesNew = new ClassesNew();
            classesNew.setVisible(true);
        }

    }

}
