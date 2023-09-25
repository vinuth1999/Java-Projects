import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField elementfield;
	private JTextField displaybox;
	private	int r=-1;
	private	int f=0;
	private	int size; 
	private int q[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 675);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUEUE DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 16));
		lblNewLabel.setBounds(325, 20, 196, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE QUEUE SIZE");
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(65, 92, 200, 30);
		contentPane.add(lblNewLabel_1);
		
		sizefield = new JTextField();
		sizefield.setBounds(346, 91, 200, 30);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton createsize = new JButton("CREATE SIZE");
		createsize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CODE FOR CREATING THE QUEUE SIZE
				int size=Integer.valueOf(sizefield.getText());
			 q=new int[size];
			 JOptionPane.showMessageDialog(contentPane, "size of queue is "+size);
			}
		});
		createsize.setBounds(657, 90, 150, 30);
		contentPane.add(createsize);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER AN ELEMENT\r\n");
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(65, 186, 200, 30);
		contentPane.add(lblNewLabel_1_1);
		
		elementfield = new JTextField();
		elementfield.setColumns(10);
		elementfield.setBounds(347, 180, 200, 30);
		contentPane.add(elementfield);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CODE FOR INSERTION
				size=q.length;
				if (r==size-1)
				{
				JOptionPane.showMessageDialog(contentPane, "insertion is not possible");	
				}
				else
				{
					int elem=Integer.valueOf(elementfield.getText());
					r++;
					q[r]=elem;
					JOptionPane.showMessageDialog(contentPane, "insertion is success");
					elementfield.setText("");
				}
			}
		});
		insert.setBounds(657, 180, 100, 30);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CODE FOR DELETION
			      if(r==-1||f>r)
			      {
			    	  JOptionPane.showMessageDialog(contentPane, "deletion is not possible");	
			      }
			            else
			      {
			            	JOptionPane.showMessageDialog(contentPane, "Deleted element is"+q[f]);
			      f++;
			      }
			}
		});
		delete.setBounds(388, 275, 100, 30);
		contentPane.add(delete);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("DISPLAY THE QUEUE ELEMENT");
		lblNewLabel_1_1_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(325, 375, 300, 30);
		contentPane.add(lblNewLabel_1_1_1);
		
		displaybox = new JTextField();
		displaybox.setColumns(10);
		displaybox.setBounds(50, 444, 750, 30);
		contentPane.add(displaybox);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CODE FOR DISPLAY THE QUEUE ELEMENT
				String msg="";
				if(r==-1||f>r)
				{
				JOptionPane.showMessageDialog(contentPane, "display is not possible");
				}
				else
				{
				for (int i=f; i<=r; i++)
				{
				msg=msg+" "+q[i];
				}
				displaybox.setText(msg);
				}
				
			}
		});
		display.setBounds(388, 528, 100, 30);
		contentPane.add(display);
	}
}
