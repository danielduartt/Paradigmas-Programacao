import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaginaLogin implements ActionListener{

    JFrame frame = new JFrame();
    JButton loggiButton = new JButton("Login");
    JButton resetButton = new JButton("Apagar");
    JTextField idField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JLabel idLabel = new JLabel("Usuário: ");
    JLabel passwordLabel = new JLabel("Senha: ");
    JLabel messageLabel = new JLabel();

    HashMap<String , String> loginInfo = new HashMap<String,String>();
    
    public PaginaLogin(HashMap<String , String> loginInfoOriginal){

        loginInfo = loginInfoOriginal;

        idLabel.setBounds(50,100,75,25);
        passwordLabel.setBounds(50,150,75,25);

        messageLabel.setBounds(125 , 250 , 250 , 35);
        messageLabel.setFont(new Font(null,Font.ITALIC,25));

        idField.setBounds(125 , 100 , 200 , 25);
        passwordField.setBounds(125 , 150 , 200 , 25);

        loggiButton.setBounds(125 , 200 , 100 , 25);
        loggiButton.setFocusable(false);
        loggiButton.addActionListener(this);

        resetButton.setBounds(225 , 200 , 100 , 25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        frame.add(idLabel);
        frame.add(passwordLabel);
        frame.add(messageLabel);
        frame.add(idField);
        frame.add(passwordField);
        frame.add(loggiButton);
        frame.add(resetButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420 , 420);
        frame.setLayout(null);
        frame.setVisible(true);

    }   

    @Override
    public void actionPerformed(ActionEvent e){

        if(e.getSource() == resetButton) {
            idField.setText("");
            passwordField.setText("");
        }

        if(e.getSource() == loggiButton){
            
            String userId = idField.getText();
            String userPassword = String.valueOf(passwordField.getPassword());


            // Aqui que o Hashmap atua
            if(loginInfo.containsKey(userId)){ // Pega o login que esta sendo recebido no dormulario de login e verifica se possui alguma chave com esse valor
                if (loginInfo.get(userId).equals(userPassword)) { // Se houver uma chave com o valor a cima, verifica se a senha QUE ESTA ATRELADA A ELE é igual a senha enviada pelo formulario de login
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Usuário logado!");

                    WelcomePage welcomePage = new WelcomePage();

                }

                else{
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Usuário ou senha incorreto!");
                }

            }

            else{
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Usuário ou senha incorreto!");
                }

        }

    }

}
