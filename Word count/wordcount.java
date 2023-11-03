import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;

class wordcount {
	public static void main(String args[]) {
		JFrame f = new JFrame("Word Count By Ashwani");
		JLabel l2, l3, l4;
		JTextArea text;
		JLabel l1;
		JButton Submit, Clear;
		text = new JTextArea("");
		Submit = new JButton("SUBMIT");
		Clear = new JButton("CLEAR");
		l1 = new JLabel("Enter Your string Here : ");
		l2 = new JLabel("Words available with Spaces : ");
		l3 = new JLabel("Words available Without Spaces : ");
		l4 = new JLabel("Words : ");
		Font txtFont = new Font(Font.SERIF, Font.PLAIN, 20);
		l1.setFont(txtFont);
		l2.setFont(txtFont);
		l3.setFont(txtFont);
		l4.setFont(txtFont);
		l1.setBounds(10, 25, 200, 30);
		text.setBounds(18, 60, 450, 300);
		l2.setBounds(10, 370, 400, 30);
		l3.setBounds(10, 400, 400, 30);
		l4.setBounds(10, 430, 400, 30);
		Submit.setBounds(100, 470, 100, 50);
		Clear.setBounds(275, 470, 100, 50);
		text.setLineWrap(true);
		text.setWrapStyleWord(true);
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = text.getText().strip();
				int count = 0, i, word = 0;
				l2.setText("Words available with Spaces : " + str.length());
				for (i = 0; i < str.length(); i++) {
					if (str.charAt(i) != ' ')
						count++;
					else
						word++;
				}
				l3.setText("Words available Without Spaces : " + count);
				l4.setText("Words : " + (word + 1));
			}
		});
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText("");
				l2.setText("Words available with Spaces : ");
				l3.setText("Words available Without Spaces : ");
				l4.setText("Words : ");
			}
		});
		f.add(l1);
		f.add(text);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(Submit);
		f.add(Clear);
		f.setSize(500, 570);
		f.setResizable(false);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
