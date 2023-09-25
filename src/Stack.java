import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int s[];
	private int size;
	private int top=-1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 825, 614);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(226, 210, 156));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STACK DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 18));
		lblNewLabel.setBounds(299, 23, 225, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER STACK SIZE");
		lblNewLabel_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(75, 94, 150, 25);
		contentPane.add(lblNewLabel_1);
		
		sizefield = new JTextField();
		sizefield.setBounds(297, 92, 175, 25);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton createsize = new JButton("CREATE STACK");
		createsize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				code for creating stack size
				 size=Integer.valueOf(sizefield.getText());
				 s=new int[size];
				 String message="stack of size is "+size;
				 JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		createsize.setForeground(new Color(0, 0, 255));
		createsize.setFont(new Font("Constantia", Font.BOLD, 16));
		createsize.setBounds(554, 90, 150, 25);
		contentPane.add(createsize);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER ELEMENT");
		lblNewLabel_1_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(72, 174, 150, 25);
		contentPane.add(lblNewLabel_1_1);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(297, 169, 175, 25);
		contentPane.add(element);
		
		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				code for push
				if(top==size-1)
				{
					JOptionPane.showMessageDialog(contentPane,"push is not possible");
				}
				else
				{
					int elem=Integer.valueOf(element.getText());
				top++;
				s[top]=elem;
				JOptionPane.showMessageDialog(contentPane, "push is successfull");
				element.setText("");
				}
			}
		});
		push.setForeground(Color.BLUE);
		push.setFont(new Font("Constantia", Font.BOLD, 16));
		push.setBounds(555, 169, 150, 25);
		contentPane.add(push);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				code for pop
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane, "pop is not possible");
				}
				else
				{
			 String message="deleted element is"+s[top];
			 JOptionPane.showMessageDialog(contentPane, message);
					s[top]=0;
					top--;
				}
			}
		});
		pop.setForeground(Color.BLUE);
		pop.setFont(new Font("Constantia", Font.BOLD, 16));
		pop.setBounds(301, 265, 150, 25);
		contentPane.add(pop);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				code for display
				String msg="";
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane, "display is not possible");
				}
				
				for(int i=top; i>=0; i--)
				{
                  msg=msg+" "+s[i];
				}
				displaybox.setText(msg);
			}
		});
		display.setForeground(Color.BLUE);
		display.setFont(new Font("Constantia", Font.BOLD, 16));
		display.setBounds(302, 350, 150, 25);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setColumns(10);
		displaybox.setBounds(50, 429, 700, 35);
		contentPane.add(displaybox);
	}

}
