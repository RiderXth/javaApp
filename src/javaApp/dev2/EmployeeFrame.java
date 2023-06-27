package javaApp.dev2;

import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.awt.Component;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class EmployeeFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnumber;
	private JTextField txttdate;
	public JTextField txtprice;
	public JTextField txtmovie;
	private JTextField txtquality;
	private JTextField txtvacant;
	private JLabel lblvacant;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeFrame frame = new EmployeeFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void clock(){
	}


/**
* Create the frame.
*/
	public EmployeeFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 10, 723, 498);
		setLocationRelativeTo(null);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblchair01 = new JLabel("");
		lblchair01.setFont(new Font("Tahoma", Font.PLAIN, 5));
		lblchair01.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblchair01.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
				Image chair01 = new ImageIcon(this.getClass().getResource("/resource/occupied.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
				lblchair01.setIcon(new ImageIcon(chair01));
				txtnumber.setText("BLOCK A1");
			}
		});
		lblchair01.setHorizontalAlignment(SwingConstants.CENTER);
		if ( new File("/resource/notoccupied.png").exists()) {
			System.out.println("File /resource/notoccupied.png not Found ");
		}
		Image chair01 = new ImageIcon(this.getClass().getResource("/resource/notoccupied.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		lblchair01.setIcon(new ImageIcon(chair01));
		lblchair01.setBounds(132, 186, 40, 49);
		contentPane.add(lblchair01);
		JLabel lblchair01_2 = new JLabel("");
		lblchair01_2.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
			Image chair02 = new ImageIcon(this.getClass().getResource("/resource/occupied.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
			lblchair01_2.setIcon(new ImageIcon(chair02));
			txtnumber.setText("BLOCK A2");
			txttdate.setText("Vacant");
			}
		});
		lblchair01_2.setFont(new Font("Tahoma", Font.PLAIN, 5));
		Image chair02 = new ImageIcon(this.getClass().getResource("/resource/notoccupied.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		lblchair01_2.setIcon(new ImageIcon(chair02));
		lblchair01_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblchair01_2.setBounds(182, 186, 40, 49);
		contentPane.add(lblchair01_2);
		JLabel lblchair01_3 = new JLabel("");
		lblchair01_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Image chair03 = new ImageIcon(this.getClass().getResource("/resource/occupied.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
				lblchair01_3.setIcon(new ImageIcon(chair03));
				txtnumber.setText("BLOCK A3");
				txttdate.setText("Vacant");
				}
		});
		lblchair01_3.setFont(new Font("Tahoma", Font.PLAIN, 5));
		Image chair03 = new ImageIcon(this.getClass().getResource("/resource/notoccupied.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		lblchair01_3.setIcon(new ImageIcon(chair03));
		lblchair01_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblchair01_3.setBounds(232, 186, 40, 49);
		contentPane.add(lblchair01_3);
		JLabel lblchair01_4 = new JLabel("");
		lblchair01_4.setFont(new Font("Tahoma", Font.PLAIN, 5));
		Image chair04 = new ImageIcon(this.getClass().getResource("/resource/notoccupied.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		lblchair01_4.setIcon(new ImageIcon(chair04));
		lblchair01_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblchair01_4.setBounds(282, 186, 40, 49);
		contentPane.add(lblchair01_4);
		JLabel lblchair01_5 = new JLabel("");
		lblchair01_5.setFont(new Font("Tahoma", Font.PLAIN, 5));
		Image chair05 = new ImageIcon(this.getClass().getResource("/resource/notoccupied.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		lblchair01_5.setIcon(new ImageIcon(chair05));
		lblchair01_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblchair01_5.setBounds(332, 186, 40, 49);
		contentPane.add(lblchair01_5);
		JLabel lblchair01_6 = new JLabel("");
		lblchair01_6.setFont(new Font("Tahoma", Font.PLAIN, 5));
		Image chair06 = new ImageIcon(this.getClass().getResource("/resource/notoccupied.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		lblchair01_6.setIcon(new ImageIcon(chair06));
		lblchair01_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblchair01_6.setBounds(382, 186, 40, 49);
		contentPane.add(lblchair01_6);
		JLabel lblchair01_7 = new JLabel("");
		lblchair01_7.setFont(new Font("Tahoma", Font.PLAIN, 5));
		Image chair07 = new ImageIcon(this.getClass().getResource("/resource/notoccupied.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		lblchair01_7.setIcon(new ImageIcon(chair07));
		lblchair01_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblchair01_7.setBounds(432, 186, 40, 49);
		contentPane.add(lblchair01_7);
		JLabel lblchair01_8 = new JLabel("");
		lblchair01_8.setFont(new Font("Tahoma", Font.PLAIN, 5));
		Image chair08 = new ImageIcon(this.getClass().getResource("/resource/notoccupied.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		lblchair01_8.setIcon(new ImageIcon(chair08));
		lblchair01_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblchair01_8.setBounds(482, 186, 40, 49);
		contentPane.add(lblchair01_8);
		JLabel lblchair01_9 = new JLabel("");
		lblchair01_9.setFont(new Font("Tahoma", Font.PLAIN, 5));
		Image chair09 = new ImageIcon(this.getClass().getResource("/resource/notoccupied.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		lblchair01_9.setIcon(new ImageIcon(chair09));
		lblchair01_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblchair01_9.setBounds(532, 186, 40, 49);
		contentPane.add(lblchair01_9);
		JLabel lblchair01_10 = new JLabel("");
		lblchair01_10.setFont(new Font("Tahoma", Font.PLAIN, 5));
		Image chair10 = new ImageIcon(this.getClass().getResource("/resource/notoccupied.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		lblchair01_10.setIcon(new ImageIcon(chair10));
		lblchair01_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblchair01_10.setBounds(582, 186, 40, 49);
		contentPane.add(lblchair01_10);
		JLabel lblchair01_11 = new JLabel("");
		lblchair01_11.setFont(new Font("Tahoma", Font.PLAIN, 5));
		Image chair11 = new ImageIcon(this.getClass().getResource("/resource/notoccupied.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		lblchair01_11.setIcon(new ImageIcon(chair11));
		lblchair01_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblchair01_11.setBounds(132, 246, 40, 49);
		contentPane.add(lblchair01_11);
		JLabel lblchair01_12 = new JLabel("");
		lblchair01_12.setFont(new Font("Tahoma", Font.PLAIN, 5));
		Image chair12 = new ImageIcon(this.getClass().getResource("/resource/notoccupied.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		lblchair01_12.setIcon(new ImageIcon(chair12));
		lblchair01_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblchair01_12.setBounds(182, 246, 40, 49);
		contentPane.add(lblchair01_12);
		JLabel lblchair01_13 = new JLabel("");
		lblchair01_13.setFont(new Font("Tahoma", Font.PLAIN, 5));
		Image chair13 = new ImageIcon(this.getClass().getResource("/resource/notoccupied.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		lblchair01_13.setIcon(new ImageIcon(chair13));
		lblchair01_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblchair01_13.setBounds(232, 246, 40, 49);
		contentPane.add(lblchair01_13);
		JLabel lblchair01_14 = new JLabel("");
		lblchair01_14.setFont(new Font("Tahoma", Font.PLAIN, 5));
		Image chair14 = new ImageIcon(this.getClass().getResource("/resource/notoccupied.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		lblchair01_14.setIcon(new ImageIcon(chair14));
		lblchair01_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblchair01_14.setBounds(282, 246, 40, 49);
		contentPane.add(lblchair01_14);
		JLabel lblchair01_15 = new JLabel("");
		lblchair01_15.setFont(new Font("Tahoma", Font.PLAIN, 5));
		Image chair15 = new ImageIcon(this.getClass().getResource("/resource/notoccupied.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		lblchair01_15.setIcon(new ImageIcon(chair15));
		lblchair01_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblchair01_15.setBounds(332, 246, 40, 49);
		contentPane.add(lblchair01_15);
		JLabel lblchair01_16 = new JLabel("");
		lblchair01_16.setFont(new Font("Tahoma", Font.PLAIN, 5));
		Image chair16 = new ImageIcon(this.getClass().getResource("/resource/notoccupied.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		lblchair01_16.setIcon(new ImageIcon(chair16));
		lblchair01_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblchair01_16.setBounds(382, 246, 40, 49);
		contentPane.add(lblchair01_16);
		JLabel lblchair01_17 = new JLabel("");
		lblchair01_17.setFont(new Font("Tahoma", Font.PLAIN, 5));
		Image chair17 = new ImageIcon(this.getClass().getResource("/resource/notoccupied.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		lblchair01_17.setIcon(new ImageIcon(chair17));
		lblchair01_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblchair01_17.setBounds(432, 246, 40, 49);
		contentPane.add(lblchair01_17);
		JLabel lblchair01_18 = new JLabel("");
		lblchair01_18.setFont(new Font("Tahoma", Font.PLAIN, 5));
		Image chair18 = new ImageIcon(this.getClass().getResource("/resource/notoccupied.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		lblchair01_18.setIcon(new ImageIcon(chair18));
		lblchair01_18.setHorizontalAlignment(SwingConstants.CENTER);
		lblchair01_18.setBounds(482, 246, 40, 49);
		contentPane.add(lblchair01_18);
		JLabel lblchair01_19 = new JLabel("");
		lblchair01_19.setFont(new Font("Tahoma", Font.PLAIN, 5));
		Image chair19 = new ImageIcon(this.getClass().getResource("/resource/notoccupied.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		lblchair01_19.setIcon(new ImageIcon(chair19));
		lblchair01_19.setHorizontalAlignment(SwingConstants.CENTER);
		lblchair01_19.setBounds(532, 246, 40, 49);
		contentPane.add(lblchair01_19);
		JLabel lblchair01_20 = new JLabel("");
		lblchair01_20.setFont(new Font("Tahoma", Font.PLAIN, 5));
		Image chair20 = new ImageIcon(this.getClass().getResource("/resource/notoccupied.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		lblchair01_20.setIcon(new ImageIcon(chair20));
		lblchair01_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblchair01_20.setBounds(582, 246, 40, 49);
		contentPane.add(lblchair01_20);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 205));
		panel.setBorder(null);
		panel.setBounds(26, 46, 687, 106);
		contentPane.add(panel);
		panel.setLayout(null);
	}
}
