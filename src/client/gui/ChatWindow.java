package client.gui;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ChatWindow extends  JFrame {
 
    private JButton sendButton;
    private JButton voiceButton;


    // private Client client;

    public ChatWindow(/*Client client*/) {
        /*this.client = client;*/
        sendButton = new JButton("Send");
        voiceButton = new JButton("Voice");

        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*client.sendMessage(chatField.getText());*/
                

            }
        });
        add(sendButton, BorderLayout.EAST);
        add(voiceButton, BorderLayout.WEST);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 700);
        setVisible(true);
    }

    public void appendMessage(String message) {
        
    }

    

    
}
