import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int count=0;
	private int size;
	private int f=0;
	private int cq[];
	private int r=-1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 939, 669);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CIRCULARQUEUE DATA STRUCTURE\r\n");
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 18));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(305, 21, 315, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER QUEUE SIZE");
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(79, 98, 200, 30);
		contentPane.add(lblNewLabel_1);
		
		sizefield = new JTextField();
		sizefield.setBackground(new Color(255, 255, 0));
		sizefield.setBounds(332, 97, 200, 30);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton createsize = new JButton("CREATE SIZE\r\n");
		createsize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CODE FOR CREATING THE SIZE
				int size=Integer.valueOf(sizefield.getText());
				cq=new int[size];
				JOptionPane.showMessageDialog(contentPane, "size of "+size+" is created");
			}
		});
		createsize.setFont(new Font("Constantia", Font.BOLD, 16));
		createsize.setBounds(667, 101, 175, 30);
		contentPane.add(createsize);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(79, 185, 200, 30);
		contentPane.add(lblNewLabel_1_1);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBackground(new Color(255, 255, 0));
		element.setBounds(332, 185, 200, 30);
		contentPane.add(element);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CODE FOR INSERTION
				size = cq.length;
				if(count ==size)	
				{
				JOptionPane.showMessageDialog(contentPane, "insertion is not possible");
				}
				else {
					int elem=Integer.valueOf(element.getText());
					r=(r+1)%size;
					cq[r]=elem;
					count++;
                    JOptionPane.showMessageDialog(contentPane, "insertion is succcessful");
                    element.setText("");
				}
			}
		});
		insert.setFont(new Font("Constantia", Font.BOLD, 16));
		insert.setBounds(667, 188, 175, 30);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CODE FOR DELETION
				if(count==0)
				 {
					 JOptionPane.showMessageDialog(contentPane, "deletion not possible");
				 }
				 else {
					 
					JOptionPane.showMessageDialog(contentPane, "deleted element is "+cq[f]);
					 f=(f+1)%5;
					 count--;
				 }
			}
		});
		delete.setFont(new Font("Constantia", Font.BOLD, 16));
		delete.setBounds(347, 271, 175, 30);
		contentPane.add(delete);
		
		JLabel lblNewLabel_1_2 = new JLabel("DISPLAY THE CIRCULARQUEUE ELEMENT\r\n");
		lblNewLabel_1_2.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(303, 357, 400, 30);
		contentPane.add(lblNewLabel_1_2);
		
		displaybox = new JTextField();
		displaybox.setColumns(10);
		displaybox.setBackground(Color.YELLOW);
		displaybox.setBounds(100, 426, 700, 30);
		contentPane.add(displaybox);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CODE FOR DISPLAY
				String msg="";
				int f1=f; 
				 if(count==0)
				 {
					 JOptionPane.showMessageDialog(contentPane, "display not possible");
				 }
				 else
				 {
					 for (int i=1; i<=count; i++)
					 {
						msg=msg+" "+cq[f1];
						 f1=(f1+1)%size;
					 }
					displaybox.setText(msg);
				 }
			}
		});
		display.setFont(new Font("Constantia", Font.BOLD, 16));
		display.setBounds(357, 524, 175, 30);
		contentPane.add(display);
	}

}
