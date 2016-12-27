package GoldenData;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Input extends JFrame {
	static final int num = 1;

	public String Input_From_KeyBoard() {
		Scanner a = new Scanner(System.in);
		String newa = a.next();
		return newa;
	}

	public static void main(String[] args) {
		Input que = new Input();
		Input opt = new Input();
		ArrayList<Input> quelist = new ArrayList<Input>();
		ArrayList<Input> optlist = new ArrayList<Input>();
		ArrayList<String> questionlist = new ArrayList<String>();
		ArrayList<String> optionlist = new ArrayList<String>();
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
