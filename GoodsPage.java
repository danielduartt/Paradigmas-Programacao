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

public class GoodsPage implements ActionListener {
    JLabel pageTitle = new JLabel("PRODUTOS");
    JLabel pageSubtitle = new JLabel("Gerencie todos os produtos da EJF");
    JLabel selectTitle = new JLabel("Selecione o produto");
    JButton goodInformations = new JButton("Informações do produto");
    JButton goodUpdate = new JButton("Atualizar informações do produto");
    JButton deleteGood = new JButton("Deletar produto");
    JButton addGood = new JButton("Adicionar novo produto");
    JButton comebackButton = new JButton("Voltar");
    JFrame frame = new JFrame();
    JPanel goodsContainer = new JPanel();
    JScrollPane scrollTeahcerContainer = new JScrollPane(goodsContainer);

    public GoodsPage(){

        pageTitle.setBounds(20,20,600,35);
        pageTitle.setFont(new Font(null , Font.BOLD, 30));

        selectTitle.setBounds(20, 100 , 310 , 35);
        selectTitle.setFont(new Font(null , Font.PLAIN , 20 ));

        pageSubtitle.setBounds(20,50,600, 35);
        pageSubtitle.setFont(new Font(null, Font.PLAIN, 18 ));

        goodInformations.setBounds(400, 135 , 300 , 40);
        goodInformations.setFocusable(false);
        goodInformations.addActionListener(this);

        goodUpdate.setBounds(400, 205 , 300 , 40);
        goodUpdate.setFocusable(false);
        goodUpdate.addActionListener(this);

        addGood.setBounds(400, 274 , 300 , 40);
        addGood.setFocusable(false);
        addGood.addActionListener(this);

        deleteGood.setBounds(400, 344 , 300 , 40);
        deleteGood.setFocusable(false);
        deleteGood.addActionListener(this);
    
        comebackButton.setBounds(600,400,100,25);
        comebackButton.setFocusable(false);
        comebackButton.addActionListener(this);

        goodsContainer.setLayout(new BoxLayout(goodsContainer, BoxLayout.Y_AXIS));

        scrollTeahcerContainer.setBounds(20 , 135 , 310 , 250);

        // Painel com todos os professores --------

        for (int i = 0; i < 20; i++) {
            JButton good = new JButton("Produto " + i + ": Kimono Nike Mike Tyson");
            good.setPreferredSize(new Dimension(290, 70));
            good.setFont(new Font(null , Font.PLAIN , 14));
            good.setFocusable(false);
            goodsContainer.add(good);
        }

        //-----------------------------------------

        frame.add(scrollTeahcerContainer, BorderLayout.CENTER);
        frame.add(comebackButton);
        frame.add(goodInformations);
        frame.add(addGood);
        frame.add(deleteGood);
        frame.add(goodUpdate);
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

        if(e.getSource() == goodInformations){
            GoodsInformation goodsInformation = new GoodsInformation();
            goodsInformation.setVisible(true);
        }

        if(e.getSource() == goodUpdate){
            GoodsUpdate goodsUpdate = new GoodsUpdate();
            goodsUpdate.setVisible(true);
        }

        if(e.getSource() == addGood){
            GoodsNew goodsNew = new GoodsNew();
            goodsNew.setVisible(true);
        }

    }

}
