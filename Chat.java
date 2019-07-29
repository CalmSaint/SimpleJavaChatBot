package chatBotPack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class Chat extends JFrame {
	
	//typing area
	private JTextField textEnter=new JTextField();
	
	//chat Area
	private JTextArea textChat=new JTextArea();
	
	
	public Chat(){
		//Frame Attributes
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Sets the operation that will happen by default when the user initiates a "close" on this frame
		this.setSize(600,600); //sets the screen size
		this.setVisible(true);
		this.setResizable(false); //sets whether the frame is resizable by user or not
		this.setLayout(null);
		this.setTitle("Java AI");
		
		//textEnter Attributes
		textEnter.setLocation(2, 548); //starting position on x-axis and y-axis
		textEnter.setSize(591,30);
		
		//textEnter Action Events
		textEnter.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg) {
				String uText=textEnter.getText();
				textChat.append("You: "+uText+"\n");
				textEnter.setText("");
				
				if(uText.matches("[hH][iI]")) {
					chatCall("Hello Human !");
				}
				else {
					int decider=(int)(Math.random()*3+1);
					if(decider==1) chatCall("I didn't get that");
					else if(decider==2) chatCall("Please Rephrase That");
					else if(decider==3) chatCall("????????");
				}
			}
		});
		
		
		//TextChat Attributes
		textChat.setLocation(5, 15);
		textChat.setSize(560,510);
		
		//add items to Frame
		this.add(textEnter);
		this.add(textChat);
	}
	
	//to append the messages which AI will send
	public void chatCall(String s) {
		textChat.append("AI: "+s+"\n");
	}
	
	public static void main(String[] args) {
		Chat c=new Chat();
	}
}
