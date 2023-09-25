import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 255, 255));
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblChooseADatastructure = new JLabel("CHOOSE A DATASTRUCTURE");
		lblChooseADatastructure.setForeground(new Color(0, 128, 255));
		lblChooseADatastructure.setFont(new Font("Castellar", Font.BOLD, 15));
		lblChooseADatastructure.setBounds(99, 10, 248, 19);
		contentPane.add(lblChooseADatastructure);
		
		JButton array = new JButton("ARRAY");
		array.setBackground(new Color(255, 255, 255));
		array.setForeground(new Color(255, 0, 0));
		array.setFont(new Font("Arial", Font.PLAIN, 12));
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE ARRAY WINDOW CODE OPENING HERE
				Array a=new Array();
				a.setVisible(true);
			}
		});
		array.setBounds(176, 48, 100, 25);
		contentPane.add(array);
		
		JButton stack = new JButton("STACK");
		stack.setBackground(new Color(255, 255, 255));
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE STACK WINDOW CODE OPENING HERE
				Stack s=new Stack();
				s.setVisible(true);
			}
		});
		stack.setForeground(new Color(0, 0, 0));
		stack.setFont(new Font("Arial", Font.PLAIN, 12));
		stack.setBounds(21, 86, 100, 25);
		contentPane.add(stack);
		
		JButton queue = new JButton("QUEUE");
		queue.setBackground(new Color(255, 255, 255));
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE QUEUE WINDOW CODE OPENING HERE
				new Queue().setVisible(true);
			}
		});
		queue.setForeground(new Color(0, 128, 255));
		queue.setFont(new Font("Arial", Font.PLAIN, 12));
		queue.setBounds(326, 86, 100, 25);
		contentPane.add(queue);
		
		JButton circularqueue = new JButton("CIRCULARQUEUE");
		circularqueue.setBackground(new Color(255, 255, 255));
		circularqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE CIRCULARQUEUE WINDOW CODE OPENING HERE
				new CircularQueue().setVisible(true);
			}
		});
		circularqueue.setForeground(new Color(64, 0, 0));
		circularqueue.setFont(new Font("Arial", Font.PLAIN, 12));
		circularqueue.setBounds(21, 148, 160, 25);
		contentPane.add(circularqueue);
		
		JButton singlylinkedlist = new JButton("SINGLYLINKEDLIST");
		singlylinkedlist.setBackground(new Color(255, 255, 255));
		singlylinkedlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE SINGLYLINKEDLIST WINDOW CODE OPENING HERE
				new SinglyLinkedList().setVisible(true);
			}
		});
		singlylinkedlist.setForeground(new Color(255, 0, 255));
		singlylinkedlist.setFont(new Font("Arial", Font.PLAIN, 12));
		singlylinkedlist.setBounds(266, 148, 160, 25);
		contentPane.add(singlylinkedlist);
		
		JButton doublylinkedlist_1 = new JButton("DOUBLYLINKEDLIST");
		doublylinkedlist_1.setBackground(new Color(255, 255, 255));
		doublylinkedlist_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DOUBLYLINKEDLIST WINDOW CODE OPENING HERE
				new DoublyLinkedList().setVisible(true);
			}
		});
		doublylinkedlist_1.setForeground(new Color(255, 0, 0));
		doublylinkedlist_1.setFont(new Font("Arial", Font.PLAIN, 12));
		doublylinkedlist_1.setBounds(141, 205, 160, 25);
		contentPane.add(doublylinkedlist_1);
	}
}
