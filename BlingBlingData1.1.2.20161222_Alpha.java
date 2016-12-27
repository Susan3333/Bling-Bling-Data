package GoldenData;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Input extends JFrame {
	static final int num = 3;

	public String Input_From_KeyBoard() {
		Scanner a = new Scanner(System.in);
		String newa = a.next();
		return newa;
	}

	public static void SwingTittle() {
		JFrame frm = new JFrame();
		frm.setBounds(0, 0, 960, 540);
		frm.setTitle("Goden Data");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField text = new JTextField();
		text.setText("Welcome to Goden Data!");
		text.setEditable(false);
		text.setFont(new Font("楷体", Font.BOLD | Font.ITALIC, 16));

		text.setHorizontalAlignment(JTextField.CENTER);
		frm.getContentPane().add(text, BorderLayout.CENTER);
		JButton enter = new JButton();
		enter.setText("点击进入");
		enter.setBackground(Color.pink);
		enter.setFont(new Font("楷体", Font.BOLD | Font.ITALIC, 14));
		enter.setHorizontalAlignment(JButton.CENTER);
		frm.getContentPane().add(enter, BorderLayout.PAGE_END);
		enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frm1 = new JFrame();
				frm1.setLayout(null);
				frm1.setBounds(0, 0, 960, 540);
				frm1.setTitle("Goden Data");
				frm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				// JPanel panel = new JPanel();
				// frm1.getContentPane().add(panel,BorderLayout.NORTH);
				// input.setHorizontalAlignment(SwingConstants.LEFT);
				// input.setColumns(30);
				JTextField Q1 = new JTextField();
				Q1.setText("请输入第一个问题");
				Q1.setEditable(false);
				Q1.setFont(new Font("楷体", Font.BOLD | Font.ITALIC, 16));
				Q1.setBounds(10, 10, 700, 40);
				frm1.add(Q1);
				JTextField S1 = new JTextField("s1");
				S1.setEditable(false);
				S1.setBounds(10, 50, 700, 40);
				frm1.add(S1);
				S1.setEditable(true);
				frm1.setVisible(true);
				// JTextArea jta = new JTextArea(5, 15);
				// jta.setTabSize(3);
				// jta.setFont(new Font("标楷体", Font.BOLD, 16));
				// jta.setLineWrap(true);// 激活自动换行功能
				// jta.setWrapStyleWord(true);// 激活断行不断字功能
				// panel.add(jta);

			}
		});
		frm.setVisible(true);
	}

	public static void main(String[] args) {
		Input que = new Input();
		Input opt = new Input();
		ArrayList<Input> quelist = new ArrayList<Input>();
		ArrayList<Input> optlist = new ArrayList<Input>();
		final ArrayList<String> questionlist = new ArrayList<String>();
		ArrayList<String> optionlist = new ArrayList<String>();

		JFrame frm = new JFrame();
		frm.setBounds(0, 0, 960, 540);
		frm.setTitle("Goden Data");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField text = new JTextField();
		text.setText("Welcome to Goden Data!");
		text.setEditable(false);
		text.setFont(new Font("楷体", Font.BOLD | Font.ITALIC, 16));

		text.setHorizontalAlignment(JTextField.CENTER);
		frm.getContentPane().add(text, BorderLayout.CENTER);
		JButton enter = new JButton();
		enter.setText("点击进入");
		enter.setBackground(Color.pink);
		enter.setFont(new Font("楷体", Font.BOLD | Font.ITALIC, 14));
		enter.setHorizontalAlignment(JButton.CENTER);
		frm.getContentPane().add(enter, BorderLayout.PAGE_END);
		enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frm1 = new JFrame();
				frm1.setLayout(null);
				frm1.setBounds(0, 0, 1920, 1080);
				frm1.setTitle("Goden Data");
				frm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				// JPanel panel = new JPanel();
				// frm1.getContentPane().add(panel,BorderLayout.NORTH);
				// input.setHorizontalAlignment(SwingConstants.LEFT);
				// input.setColumns(30);
				for (int i = 0; i < num; i++) {
					JTextField Q1 = new JTextField();
					Q1.setText("请输入第" + (i + 1) + "个问题：");
					Q1.setBounds(10, 10 + (i * 350), 700, 40);
					Q1.setEditable(false);
					Q1.setFont(new Font("楷体", Font.BOLD | Font.ITALIC, 16));
					frm1.setVisible(true);
					frm1.add(Q1);
					for (int j = 0; j < 4; j++) {
//						FileWriter fwQ1 = null;
//						String c = questionlist.get(i) + "\r\n";
//						try {
//							fwQ1 = new FileWriter("d://data.txt", true);
//							fwQ1.write(c);
//							fwQ1.close();
//						} catch (IOException e1) {
//							e1.printStackTrace();
//						}

						JTextField S1 = new JTextField(" ");
						S1.setEditable(false);
						S1.setBounds(10, i * 350 + (j + 1) * 60, 700, 40);
						frm1.add(S1);
						S1.setEditable(true);
					}
				}
				// JTextArea jta = new JTextArea(5, 15);
				// jta.setTabSize(3);
				// jta.setFont(new Font("标楷体", Font.BOLD, 16));
				// jta.setLineWrap(true);// 激活自动换行功能
				// jta.setWrapStyleWord(true);// 激活断行不断字功能
				// panel.add(jta);

			}
		});
		frm.setVisible(true);

		for (int i = 0; i <= num; i++) {
			System.out.println("请输入第" + (i + 1) + "个问题：");
			quelist.add(que);
			questionlist.add(que.Input_From_KeyBoard());
			FileWriter fwQ1 = null;
			try {
				fwQ1 = new FileWriter("d://data.txt", true);
				String c = questionlist.get(i) + "\r\n";
				fwQ1.write(c);
				fwQ1.close();
			} catch (IOException e1) {
				e1.printStackTrace();
				System.out.println("写入失败");
				System.exit(-1);
			}

			System.out.print("请输入第" + (i + 1) + "个问题的选项：");
			optlist.add(opt);
			for (int i1 = 0; i1 < 3; i1++) {
				System.out.print("请输入第" + (i1 + 1) + "个选项：");
				optionlist.add(opt.Input_From_KeyBoard());
				FileWriter fwO1 = null;
				try {
					fwO1 = new FileWriter("d://data.txt", true);
					String c = optionlist.get(i) + "\r\n";
					fwO1.write(c);
					fwO1.close();

				} catch (IOException e1) {
					e1.printStackTrace();
					System.out.println("写入失败");
					System.exit(-1);
				}
			}

		}

	}

}
