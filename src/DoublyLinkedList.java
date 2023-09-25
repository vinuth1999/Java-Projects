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

public class DoublyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField rearelement;
	private JTextField frontelement;
	private JTextField displaybox;
	private Node first;
	public class Node
	{
		int data;
		Node prelink;
		Node nextlink;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 796, 556);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(150, 169, 233));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(255, 0, 128));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 18));
		lblNewLabel.setBounds(200, 26, 351, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(70, 95, 200, 30);
		contentPane.add(lblNewLabel_1);
		
		rearelement = new JTextField();
		rearelement.setBounds(322, 94, 150, 30);
		contentPane.add(rearelement);
		rearelement.setColumns(10);
		
		JButton insertrear = new JButton("INSERT REAR");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CODE FOR INSERT REAR
				Node temp;
		       int elem=Integer.valueOf(rearelement.getText());
		         Node newnode=new Node();
		         newnode.data=elem;
		         newnode.nextlink=null;
		         newnode.prelink=null;
		         
		         if(first==null)
		         {
		                  first=newnode;  
		                  JOptionPane.showMessageDialog(contentPane, "element is inserted");
		                  rearelement.setText("");
		        	 
		         }
		         else
		         {
		        	 temp=first;
		        	 while(temp.nextlink!=null)
		        	 {
		        		 temp=temp.nextlink;
		        		 
		        	 }
		        	 temp.nextlink=newnode;
		        	 newnode.prelink=temp;
		        	 JOptionPane.showMessageDialog(contentPane, "element is inserted");
		             rearelement.setText("");
		         }
			}
		});
		insertrear.setFont(new Font("Constantia", Font.BOLD, 16));
		insertrear.setBounds(547, 95, 200, 30);
		contentPane.add(insertrear);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(70, 176, 200, 30);
		contentPane.add(lblNewLabel_1_1);
		
		frontelement = new JTextField();
		frontelement.setColumns(10);
		frontelement.setBounds(321, 171, 150, 30);
		contentPane.add(frontelement);
		
		JButton insertfront = new JButton("INSERT FRONT");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CODE FOR INSERT FRONT
				int elem=Integer.valueOf(frontelement.getText());
				 
				Node newnode=new Node();
				newnode.data=elem;
				newnode.nextlink=null;
				newnode.prelink=null;
				if(first==null)
				{
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "element inserted is successful");
				}
				else
				{
		            newnode.nextlink=first;
		            first.prelink=newnode;
		            first=newnode;
		            JOptionPane.showMessageDialog(contentPane, "element is inserted successful");
		             frontelement.setText("");
				}
			}
		});
		insertfront.setFont(new Font("Constantia", Font.BOLD, 16));
		insertfront.setBounds(547, 171, 200, 30);
		contentPane.add(insertfront);
		
		JButton deleterear = new JButton("DELETE REAR");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CODE FOR DELETE REAR
				Node temp;
			     if(first==null)
			     {
			    	 JOptionPane.showMessageDialog(contentPane, "Deletion is not possible");
			     }
			     
			     else if(first.nextlink==null)
			     {
			    	 JOptionPane.showMessageDialog(contentPane, "deleted element is"+first.data);
			    	 first=null;
			     }
			     else
			     {
			    	 temp=first;
			    	 while(temp.nextlink.nextlink!=null)
			    	 {
			    		 temp=temp.nextlink;
			    	 }
			    	 JOptionPane.showMessageDialog(contentPane, "deleted element is"+temp.nextlink.data);
			    	 temp.nextlink=null;
			     }
			}
		});
		deleterear.setFont(new Font("Constantia", Font.BOLD, 16));
		deleterear.setBounds(299, 251, 200, 30);
		contentPane.add(deleterear);
		
		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CODE FOR DELETE FRONT
				if(first==null)
					JOptionPane.showMessageDialog(contentPane, "Deletion is not possible");
			          else if(first.nextlink==null)
			          {
			        	  JOptionPane.showMessageDialog(contentPane, "deleted element is"+first.data);
			            first=null;
			          }
			          else
			          {
			        	  first=first.nextlink;
			        	  first.prelink=null;
			          }
			}
		});
		deletefront.setFont(new Font("Constantia", Font.BOLD, 16));
		deletefront.setBounds(299, 320, 200, 30);
		contentPane.add(deletefront);
		
		displaybox = new JTextField();
		displaybox.setColumns(10);
		displaybox.setBounds(95, 464, 600, 30);
		contentPane.add(displaybox);
		
		JButton displayforward = new JButton("DISPLAY FORWARD");
		displayforward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CODE FOR DISPLAY FORWARD
				
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "display not possible");
				}
				else if(first.nextlink==null)
				{
					String msg="";
					JOptionPane.showMessageDialog(contentPane,first.data);
					displaybox.setText(msg);
				}
				else
				{
					String msg="";
					temp=first;
					while(temp!=null)
					{
						msg=msg+" "+temp.data;
					temp=temp.nextlink;	
		             				
					}
					displaybox.setText(msg);
				}
			}
		});
		displayforward.setFont(new Font("Constantia", Font.BOLD, 16));
		displayforward.setBounds(104, 398, 200, 30);
		contentPane.add(displayforward);
		
		JButton displayreverse = new JButton("DISPLAY REVERSE");
		displayreverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CODE FOR DISPLAY REVERSE
				Node temp;
				
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "display is not possible");
				}
				else if(first.nextlink==null)
				{
					JOptionPane.showMessageDialog(contentPane, first.data);
				}
				else
				{
					String msg="";
					temp=first;
					while(temp.nextlink!=null)
					{
						temp=temp.nextlink;
					}
					while(temp!=null)
					{
						msg=msg+" "+temp.data;
						temp=temp.prelink;
					}
				}
				
			}
		});
		displayreverse.setFont(new Font("Constantia", Font.BOLD, 16));
		displayreverse.setBounds(495, 401, 200, 30);
		contentPane.add(displayreverse);
	}

}
