package lesson8;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class CounterApp extends JFrame {
	private int value;
	private JLabel counterValueView;

	   public CounterApp(int initialValue) {
	       setBounds(500, 500, 500, 120);
	       setTitle("Simple Counter");
	       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	       Font font = new Font("Arial", Font.BOLD, 32);
	       counterValueView = new JLabel();
	       counterValueView.setFont(font);
	       counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
	       add(counterValueView, BorderLayout.CENTER);

	       value = initialValue;
	       counterValueView.setText(String.valueOf(value));

	       JPanel leftButtonPanel = new JPanel();
	       leftButtonPanel.setLayout(new BorderLayout());
	       JPanel rightButtonPanel = new JPanel();
	       rightButtonPanel.setLayout(new BorderLayout());
	       
	       JButton decrementButton = new JButton("<");
	       decrementButton.setFont(font);
	       leftButtonPanel.add(decrementButton, BorderLayout.EAST);

	       JButton incrementButton = new JButton(">");
	       incrementButton.setFont(font);
	       rightButtonPanel.add(incrementButton, BorderLayout.WEST);

	       decrementButton.addActionListener(new ActionListener() {
	           @Override
	           public void actionPerformed(ActionEvent actionEvent) {
	               value--;
	               update();
	           }
	       });

	       incrementButton.addActionListener(new ActionListener() {
	           @Override
	           public void actionPerformed(ActionEvent actionEvent) {
	               value++;
	               update();
	           }
	       });
	       
	       JButton decinalIncButton = new JButton(">>");
	       decinalIncButton.setFont(font);
	       rightButtonPanel.add(decinalIncButton, BorderLayout.EAST);
	       add(rightButtonPanel, BorderLayout.EAST);
	       
	       decinalIncButton.addActionListener(new ActionListener() {
	           @Override
	           public void actionPerformed(ActionEvent actionEvent) {
	               value+=10;
	               update();
	           }
	       });
	       
	       JButton decinalDecButton = new JButton("<<");
	       decinalDecButton.setFont(font);
	       leftButtonPanel.add(decinalDecButton, BorderLayout.WEST);
	       add(leftButtonPanel, BorderLayout.WEST);
	       
	       decinalDecButton.addActionListener(new ActionListener() {
	           @Override
	           public void actionPerformed(ActionEvent actionEvent) {
	               value-=10;
	               update();
	           }
	       });

	       setVisible(true);
	   }
	   
	   private void update() {
		   counterValueView.setText(String.valueOf(value));
	   }
}
