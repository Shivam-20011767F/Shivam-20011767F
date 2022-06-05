package Unit_04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class P17_SwingInJava_4F {

	public static void main(String[] args) {

		SwingInJava_4F obj = new SwingInJava_4F();
	}

}

class SwingInJava_4F extends JFrame {

	JTextField t1;
	JTextField t2;

	JButton b1;
	JButton b2;

	JLabel l1;

	SwingInJava_4F() {

		t1 = new JTextField(20);
		t2 = new JTextField(20);

		b1 = new JButton("Sum");
		b2 = new JButton("Multi");

		l1 = new JLabel("Result");

		add(t1);
		add(t2);
		add(b1);
		add(b2);

		add(l1);

		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int a1 = Integer.parseInt(t1.getText());
				int a2 = Integer.parseInt(t2.getText());

				if (e.getSource() == b1) {
					Integer sum = a1 + a2;
					l1.setText(sum.toString());
				}

				if (e.getSource() == b2) {
					Integer sum = a1 * a2;
					l1.setText(sum.toString());
				}

			}
		};

		b1.addActionListener(al);
		b2.addActionListener(al);

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}