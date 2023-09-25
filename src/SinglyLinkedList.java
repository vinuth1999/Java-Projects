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

public class SinglyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField rearelement;
	private JTextField frontelement;
	private JTextField displaybox;
	class Node
	{
		int data;
		Node link;
	}
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglyLinkedList frame = new SinglyLinkedList();
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
	public SinglyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 988, 697);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SINGLY LINKED LIST DATA STRUCTURE\r\n");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 20));
		lblNewLabel.setBounds(286, 21, 374, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(66, 90, 200, 30);
		contentPane.add(lblNewLabel_1);
		
		rearelement = new JTextField();
		rearelement.setBounds(368, 89, 200, 30);
		contentPane.add(rearelement);
		rearelement.setColumns(10);
		
		JButton rear = new JButton("INSERT REAR");
		rear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CODE FOR INSERT REAR
				Node temp;
				int elem=Integer.valueOf(rearelement.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.link=null;

			if(first==null)
			{
				first=newnode;  
				JOptionPane.showMessageDialog(contentPane, "element inserted "+first.data);
			     rearelement.setText("");
			}
			else
			{
				temp=first;
			while(temp.link!=null)
			{
			temp=temp.link;
			}
			temp.link=newnode;
			JOptionPane.showMessageDialog(contentPane, "element inserted ");
			}
		     rearelement.setText("");
			}
		});
		rear.setForeground(new Color(255, 0, 0));
		rear.setFont(new Font("Constantia", Font.BOLD, 16));
		rear.setBounds(674, 90, 200, 30);
		contentPane.add(rear);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(66, 201, 200, 30);
		contentPane.add(lblNewLabel_1_1);
		
		frontelement = new JTextField();
		frontelement.setColumns(10);
		frontelement.setBounds(368, 190, 200, 30);
		contentPane.add(frontelement);
		
		JButton front = new JButton("INSERT FRONT");
		front.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CODE FOR INSERT FRONT
				
				int elem=Integer.valueOf(frontelement.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.link=null;

				if(first==null)
				{
				first=newnode;	
				JOptionPane.showMessageDialog(contentPane, "element inserted "+first.data);
			     rearelement.setText("");
				}
				else
				{
				    newnode.link=first;
				    first=newnode;
				    JOptionPane.showMessageDialog(contentPane, "element is inserted "+elem);
				}
				frontelement.setText("");
			}
		});
		front.setForeground(Color.RED);
		front.setFont(new Font("Constantia", Font.BOLD, 16));
		front.setBounds(673, 191, 200, 30);
		contentPane.add(front);
		
		JButton btnDeleteRear = new JButton("DELETE REAR");
		btnDeleteRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CODE FOR DELETE REAR
				Node temp;
				if(first==null)
				{
				JOptionPane.showMessageDialog(contentPane, "deletion not possible");	
				}
				else if(first.link==null)
				{
					JOptionPane.showMessageDialog(contentPane, "element deleted is"+first.data);
					first=null;
				}
				else
				{
					temp=first;
					while(temp.link.link!=null)
					{
					temp=temp.link;
					}
					JOptionPane.showMessageDialog(contentPane, "element deleted is "+temp.link.data);
					temp.link=null;
				}
				
			}
		});
		btnDeleteRear.setForeground(Color.RED);
		btnDeleteRear.setFont(new Font("Constantia", Font.BOLD, 16));
		btnDeleteRear.setBounds(368, 289, 200, 30);
		contentPane.add(btnDeleteRear);
		
		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CODE FOR DELETE FRONT
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "element deleted is not possible");
				}
				else if(first.link==null)
				{
					JOptionPane.showMessageDialog(contentPane, "element deleted is "+first.data);
					first=null;
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "element deleted is "+first.data);
					first=first.link;
				}
			}
		});
		deletefront.setForeground(Color.RED);
		deletefront.setFont(new Font("Constantia", Font.BOLD, 16));
		deletefront.setBounds(368, 374, 200, 30);
		contentPane.add(deletefront);
		
		JLabel lblNewLabel_1_2 = new JLabel("DISPLAY THE SINGLY LINKED LIST ELEMENTS");
		lblNewLabel_1_2.setForeground(new Color(98, 43, 213));
		lblNewLabel_1_2.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(300, 458, 360, 20);
		contentPane.add(lblNewLabel_1_2);
		
		displaybox = new JTextField();
		displaybox.setColumns(10);
		displaybox.setBounds(90, 518, 800, 30);
		contentPane.add(displaybox);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CODE FOR DISPLAY FORWARD
				Node temp;
				if(first==null)
				{
                  JOptionPane.showMessageDialog(contentPane, "Display is not possible");
				}
				else if(first.link==null)
				{
				JOptionPane.showMessageDialog(contentPane, first.data);
                displaybox.setText(String.valueOf(first.data));
				}
				else
				{
					String msg="";
					temp=first;
				while(temp!=null)
				{
					
					msg=msg+" "+temp.data;
				    temp=temp.link;	
				}
			displaybox.setText(msg);
				}
			}
		});
		display.setForeground(Color.RED);
		display.setFont(new Font("Constantia", Font.BOLD, 16));
		display.setBounds(334, 589, 300, 30);
		contentPane.add(display);
	}

}
