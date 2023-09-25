import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField position;
	private JTextField deletedposition;
	private JTextField displaybox;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 451);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAY DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 16));
		lblNewLabel.setBounds(251, 11, 203, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER ARRAY LENGTH");
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(141, 64, 162, 18);
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setBounds(405, 60, 152, 19);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton create = new JButton("CREATE ARRAY");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for creating Array
//                         String len = length.getText();
//                    int l= Integer.valueOf(len);     
				int len= Integer.valueOf(length.getText());
				arr=new int[len];
				String message="Array length "+len+" created";
			 JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		create.setForeground(new Color(0, 0, 0));
		create.setFont(new Font("Constantia", Font.BOLD, 12));
		create.setBounds(286, 104, 150, 25);
		contentPane.add(create);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER THE ELEMENT");
		lblNewLabel_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(10, 169, 152, 18);
		contentPane.add(lblNewLabel_1_1);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(174, 165, 73, 19);
		contentPane.add(element);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("POSITION");
		lblNewLabel_1_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(261, 169, 73, 18);
		contentPane.add(lblNewLabel_1_1_1);
		
		position = new JTextField();
		position.setColumns(10);
		position.setBounds(360, 164, 106, 22);
		contentPane.add(position);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("ENTER THE POSITION");
		lblNewLabel_1_1_2.setForeground(Color.BLUE);
		lblNewLabel_1_1_2.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1_1_2.setBounds(76, 235, 157, 18);
		contentPane.add(lblNewLabel_1_1_2);
		
		deletedposition = new JTextField();
		deletedposition.setColumns(10);
		deletedposition.setBounds(272, 231, 96, 19);
		contentPane.add(deletedposition);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for delete
			int pos=Integer.valueOf(deletedposition.getText());
			arr[pos]=0;
			String message="deleted position "+pos;
			JOptionPane.showMessageDialog(contentPane, message);
			deletedposition.setText("");
			}
		});
		delete.setForeground(Color.BLACK);
		delete.setFont(new Font("Constantia", Font.BOLD, 12));
		delete.setBounds(485, 230, 100, 25);
		contentPane.add(delete);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for insertion
				int elem=Integer.valueOf(element.getText());
				int pos = Integer.valueOf(position.getText());
				arr[pos]=elem;
				String message = "element "+elem+" is inserted in "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				element.setText("");
				position.setText("");
			}
		});
		insert.setForeground(Color.BLACK);
		insert.setFont(new Font("Constantia", Font.BOLD, 12));
		insert.setBounds(526, 161, 100, 25);
		contentPane.add(insert);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("DISPLAY THE ARRAY ELEMENT");
		lblNewLabel_1_1_2_1.setForeground(Color.BLUE);
		lblNewLabel_1_1_2_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1_1_2_1.setBounds(284, 275, 217, 18);
		contentPane.add(lblNewLabel_1_1_2_1);
		
		displaybox = new JTextField();
		displaybox.setColumns(10);
		displaybox.setBounds(100, 300, 500, 25);
		contentPane.add(displaybox);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for display
				String msg="";
				for(int i=0; i<=arr.length-1; i++)
				{
					msg=msg+" "+arr[i];
				}
				displaybox.setText(msg);
			}
		});
		display.setForeground(Color.BLACK);
		display.setFont(new Font("Constantia", Font.BOLD, 12));
		display.setBounds(320, 350, 100, 25);
		contentPane.add(display);
	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
