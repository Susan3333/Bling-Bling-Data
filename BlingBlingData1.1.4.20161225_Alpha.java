import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Goldendata extends JFrame {
	static final int num = 3;

	public String Input_From_KeyBoard() {
		@SuppressWarnings("resource")
		Scanner a = new Scanner(System.in);
		String newa = a.next();
		return newa;
	}

	public static void saveToFile(String fileName, JTextField s1) throws Exception {
		FileWriter out = new FileWriter(fileName, true);
		out.write(s1.getText() + "\r\n");
		out.close();
	}

	public static void main(String[] args) {

		JFrame frm = new JFrame();
		frm.setLayout(null);
		frm.setBounds(0, 0, 960, 540);
		frm.setTitle("BlingBling 数据");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField text = new JTextField();
		text.setText("Welcome to BlingBling Data!");
		text.setEditable(false);
		text.setBounds(0, 0, 960, 450);
		text.setFont(new Font("楷体", Font.BOLD | Font.ITALIC, 16));
		text.setHorizontalAlignment(JTextField.CENTER);
		text.setBackground(Color.orange);
		frm.getContentPane().add(text, BorderLayout.CENTER);
		JButton enter = new JButton();
		JButton enter1 = new JButton();
		JButton enter2 = new JButton();
		JButton enter3 = new JButton();
		JButton enter4 = new JButton();
		JButton enter5 = new JButton();
		enter.setText("发布调查");
		enter1.setText("参与调查");
		enter2.setText("发布投票");
		enter3.setText("参与投票");
		enter4.setText("抽奖");
		enter5.setText("注册登录");

		enter.setBounds(50, 450, 100, 40);
		enter.setBackground(Color.pink);
		enter.setFont(new Font("楷体", Font.BOLD | Font.ITALIC, 14));
		enter.setHorizontalAlignment(JButton.CENTER);
		frm.getContentPane().add(enter, BorderLayout.PAGE_END);

		enter1.setBounds(200, 450, 100, 40);
		enter1.setBackground(Color.pink);
		enter1.setFont(new Font("楷体", Font.BOLD | Font.ITALIC, 14));
		enter1.setHorizontalAlignment(JButton.CENTER);
		frm.getContentPane().add(enter1, BorderLayout.PAGE_END);

		enter2.setBounds(350, 450, 100, 40);
		enter2.setBackground(Color.pink);
		enter2.setFont(new Font("楷体", Font.BOLD | Font.ITALIC, 14));
		enter2.setHorizontalAlignment(JButton.CENTER);
		frm.getContentPane().add(enter2, BorderLayout.PAGE_END);

		enter3.setBounds(500, 450, 100, 40);
		enter3.setBackground(Color.pink);
		enter3.setFont(new Font("楷体", Font.BOLD | Font.ITALIC, 14));
		enter3.setHorizontalAlignment(JButton.CENTER);
		frm.getContentPane().add(enter3, BorderLayout.PAGE_END);

		enter4.setBounds(650, 450, 100, 40);
		enter4.setBackground(Color.pink);
		enter4.setFont(new Font("楷体", Font.BOLD | Font.ITALIC, 14));
		enter4.setHorizontalAlignment(JButton.CENTER);
		frm.getContentPane().add(enter4, BorderLayout.PAGE_END);

		enter5.setBounds(800, 450, 100, 40);
		enter5.setBackground(Color.pink);
		enter5.setFont(new Font("楷体", Font.BOLD | Font.ITALIC, 14));
		enter5.setHorizontalAlignment(JButton.CENTER);
		frm.getContentPane().add(enter5, BorderLayout.PAGE_END);
		enter2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JFrame frm2 = new JFrame();
				frm2.setLayout(null);
				frm2.setBounds(0, 0, 960, 540);
				frm2.setTitle("BlingBling 数据");
				frm2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frm2.setVisible(true);

				JTextField Q2 = new JTextField();
				Q2.setText("请输入投票主题：");
				Q2.setBackground(Color.orange);
				Q2.setBounds(10, 10, 700, 40);
				Q2.setEditable(false);
				Q2.setFont(new Font("楷体", Font.BOLD | Font.ITALIC, 16));
				frm2.add(Q2);

				final JTextField S2 = new JTextField();
				S2.setEditable(true);
				S2.setBounds(10, 60, 700, 40);

				JButton button1 = new JButton();
				button1.setText("确定");
				button1.setFont(new Font("楷体", Font.BOLD | Font.ITALIC, 14));
				button1.setBounds(750, 60, 65, 40);
				button1.setBackground(Color.pink);
				frm2.getContentPane().add(button1, BorderLayout.PAGE_END);
				button1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							saveToFile("d://data3.txt", S2);
						} catch (Exception e1) {
							e1.printStackTrace();
						}
					}
				});
				frm2.add(S2);

				JTextField Q3 = new JTextField();
				Q3.setText("请输入投票选项：");
				Q3.setBackground(Color.orange);
				Q3.setBounds(10, 110, 700, 40);
				Q3.setEditable(false);
				Q3.setFont(new Font("楷体", Font.BOLD | Font.ITALIC, 16));
				frm2.add(Q3);

				for (int j = 0; j < 3; j++) {
					final JTextField S3 = new JTextField();
					S3.setEditable(true);
					S3.setBounds(10, (j + 2) * 60 + 60, 700, 40);

					JButton button11 = new JButton();
					button11.setText("确定");
					button11.setFont(new Font("楷体", Font.BOLD | Font.ITALIC, 14));
					button11.setBounds(750, (j + 2) * 60 + 60, 65, 40);
					button11.setBackground(Color.pink);
					frm2.getContentPane().add(button11, BorderLayout.PAGE_END);
					button11.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							try {
								saveToFile("d://vote.txt", S3);
							} catch (Exception e1) {
								e1.printStackTrace();
							}
						}
					});

					frm2.add(S3);
				}

				S2.setEditable(true);
				frm2.setVisible(true);

			}
		});

		enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frm1 = new JFrame();
				frm1.setLayout(null);
				frm1.setBounds(0, 0, 960, 540);
				frm1.setTitle("BlingBling 数据");
				frm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				for (int i = 0; i < num; i++) {

					JTextField Q1 = new JTextField();
					Q1.setText("请输入第" + (i + 1) + "个问题：");
					Q1.setBackground(Color.orange);
					Q1.setBounds(10, 10 + (i * 350), 700, 40);
					Q1.setEditable(false);
					Q1.setFont(new Font("楷体", Font.BOLD | Font.ITALIC, 16));
					frm1.add(Q1);
					for (int j = 0; j < 4; j++) {

						final JTextField S1 = new JTextField();
						S1.setEditable(true);
						S1.setBounds(10, i * 350 + (j + 1) * 60, 700, 40);

						JButton button1 = new JButton();
						button1.setText("确定");
						button1.setFont(new Font("楷体", Font.BOLD | Font.ITALIC, 14));
						button1.setBounds(750, i * 350 + (j + 1) * 60, 65, 40);
						button1.setBackground(Color.pink);
						frm1.getContentPane().add(button1, BorderLayout.PAGE_END);
						button1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								try {
									saveToFile("d://investigation.txt", S1);
								} catch (Exception e1) {
									e1.printStackTrace();
								}
							}
						});
						frm1.add(S1);
						S1.setEditable(true);
						frm1.setVisible(true);
					}
				}

			}
		});
		frm.setVisible(true);

	}

}
