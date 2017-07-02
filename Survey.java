import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.EventObject;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

class MyPanel2 extends Panel implements ItemListener,ActionListener{


	@Override
	public void actionPerformed(ActionEvent arg0) {
	
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
	
	}}
	





public class Survey {

	private static final Checkbox box1_1 = null;
	private static final Checkbox box1_2 = null;
	private static final Checkbox box1_3 = null;
	private static String a;
	private static Object tjiao;
    static VoteMoniter vm;
    
    
	public static void main(String[] args) throws Exception {
	JFrame panel2=new JFrame("调查问卷");
	panel2.setLayout(null);
	JLabel bt=new JLabel("餐饮市场问卷调查");
	bt.setFont(new Font("宋体",Font.BOLD, 20));
	bt.setBounds(406,25,300,30);
	panel2.getContentPane().add(bt);
	
	BufferedReader br;
	br = new BufferedReader(new InputStreamReader(
											new FileInputStream("F:/问卷调查Demo.txt")));
	int j=0;
	String[]arr=new String[100];
	for(int i=0;i<arr.length;i++){
		arr[i]=readLine(++j,br);
	}
	//String a=
	/*String b=readLine(++j,br);
	String c=readLine(++j,br);
	String d=readLine(++j,br);*/
	
	int k=0;
	JLabel ques1;
	ques1=new JLabel("1.\t"+arr[k++]);
	ques1.setBounds(50, 60, 800, 20);
	panel2.getContentPane().add(ques1);
	
	final Checkbox box1_1,box1_2,box1_3;

	box1_1=new Checkbox(arr[k++]);
	box1_1.setBounds(70,100,820, 45);
	addItemEvent(box1_1);
	panel2.getContentPane().add(box1_1);
	
	box1_2=new Checkbox(arr[k++]);
	box1_2.setBounds(70,145,820, 45);
	addItemEvent(box1_2);
	panel2.getContentPane().add(box1_2);
	
	box1_3=new Checkbox(arr[k++]);
	box1_3.setBounds(70,190,820, 45);
	addItemEvent(box1_3);
	panel2.getContentPane().add(box1_3);
	
	
	JLabel ques2;
	ques2=new JLabel("2.\t"+arr[k++]);
	ques2.setBounds(50, 235, 800, 20);
	panel2.getContentPane().add(ques2);
	
	final Checkbox box2_1;
	final Checkbox box2_2;
	final Checkbox box2_3;
	box2_1=new Checkbox(arr[k++]);
	box2_1.setBounds(70,275,820, 45);
	addItemEvent(box2_1);
	panel2.getContentPane().add(box2_1);
	
	box2_2=new Checkbox(arr[k++]);
	box2_2.setBounds(70,320,820, 45);
	addItemEvent(box2_2);
	panel2.getContentPane().add(box2_2);
	
	box2_3=new Checkbox(arr[k++]);
	box2_3.setBounds(70,365,820, 45);
	addItemEvent(box2_3);
	panel2.getContentPane().add(box2_3);
	
	
	JLabel ques3;
	ques3=new JLabel("3.\t"+arr[k++]);
	ques3.setBounds(50, 405, 800, 20);
	panel2.getContentPane().add(ques3);
	
	final Checkbox box3_1;
	final Checkbox box3_2;
	final Checkbox box3_3;
	box3_1=new Checkbox(arr[k++]);
	box3_1.setBounds(70,450,820, 45);
	addItemEvent(box3_1);
	panel2.getContentPane().add(box3_1);
	
	box3_2=new Checkbox(arr[k++]);
	box3_2.setBounds(70,495,820, 45);
	addItemEvent(box3_2);
	panel2.getContentPane().add(box3_2);
	
	box3_3=new Checkbox(arr[k++]);
	box3_3.setBounds(70,540,820, 45);
	addItemEvent(box3_3);
	panel2.getContentPane().add(box3_3);
	
	final JButton tjiao;
	JButton tji;

	tjiao=new JButton("提交");
	tjiao.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	if(e.getSource()==tjiao)
        	{
        			
						num++;
        				if(box1_1.getState())
        					numz++;
        				if(box1_2.getState())
        					numl++;
        				if(box1_3.getState())
        					numw++;
        				if(box2_1.getState())
        					numa++;
        				if(box2_2.getState())
        					numb++;
        				if(box2_3.getState())
        					numd++;
        				if(box3_1.getState())
        					nume++;
        				if(box3_2.getState())
        					numf++;
        				if(box3_3.getState())
        					numg++;
        				
        				//tji.setEnabled();
        	}
        }
    });

	tjiao.setBounds(750, 700,70, 30);
	panel2.getContentPane().add(tjiao);
	
	tji=new JButton("统计");
	tji.setEnabled(true);
	tji.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	JFrame panel3= new JFrame("结果统计");
        	panel3.setLayout(null);
        	this.setResizable(false);
        	JLabel bt1=new JLabel("问卷调查统计结果");
        	bt1.setFont(new Font("宋体",Font.BOLD, 20));
        	bt1.setBounds(406,25,300,30);
        	panel3.getContentPane().add(bt1);
        	JTextArea text;
        	text=new JTextArea();
        	text.setFont(new Font("Georgea",Font.PLAIN, 16));
        	text.setBounds(100, 100, 800, 600);
        	panel3.getContentPane().add(text);
        	text.append("\n\t此次投票共:"+Integer.toString(num)+"人\n\n");
        	text.append("\n\t调查1：\n\t\t选择“"+box1_1.getLabel()+"”的票数为:"
        	                                             +Integer.toString(numz)+"\n\n");
        	text.append("\t\t选择“"+box1_2.getLabel()+"”的票数为:"+Integer.toString(numl)+"\n\n");
        	text.append("\t\t选择“"+box1_3.getLabel()+"”的票数为:"+Integer.toString(numw)+"\n\n");
        	
        	text.append("\n\t调查2：\n\t\t选择“"+box2_1.getLabel()+"”的票数为:"
                    +Integer.toString(numa)+"\n\n");
text.append("\t\t选择“"+box2_2.getLabel()+"”的票数为:"+Integer.toString(numb)+"\n\n");
text.append("\t\t选择“"+box2_3.getLabel()+"”的票数为:"+Integer.toString(numd)+"\n\n");

text.append("\n\t调查3：\n\t\t选择“"+box3_1.getLabel()+"”的票数为:"
        +Integer.toString(nume)+"\n\n");
text.append("\t\t选择“"+box3_2.getLabel()+"”的票数为:"+Integer.toString(numf)+"\n\n");
text.append("\t\t选择“"+box3_3.getLabel()+"”的票数为:"+Integer.toString(numg)+"\n\n");
        	panel3.setBounds(100, 200, 1000,800);
        	panel3.setVisible(true);
        }

		private void setResizable(boolean b) {
			// TODO Auto-generated method stub
			
		}
    });
	tji.setBounds(850, 700,70, 30);
	panel2.getContentPane().add(tji);
	

	panel2.setBounds(100, 200, 1000,800);
	panel2.setVisible(true);
	}


	
		

	private static void addItemEvent(Checkbox box1_12) {
		// TODO Auto-generated method stub
		
	}

	static int  num=0,numz,numl,numw,numa,numb,numc,numd,nume,numf,numg;
	

public void actionPerformed(ActionEvent e)
{}
class VoteMoniter extends Frame implements ActionListener{


Checkbox box1,box2;
CheckboxGroup cbg;
TextArea ta;
Button bt1,bt2,bt3;
int x,y=0;
VoteMoniter(String s)
{
super(s);
setLayout(null);
cbg=new CheckboxGroup();
box1=new Checkbox(" ",true,cbg);
box2=new Checkbox(" ",false,cbg);
ta=new TextArea();
box1.setBounds(150,45,40,15);
box2.setBounds(200,45,40,15);
ta.setBounds(50,70,300,175);
bt1=new Button("投票");
bt2=new Button("统计");
bt3=new Button("返回");
bt1.setBounds(115,250,46,20);
bt2.setBounds(166,250,46,20);
bt3.setBounds(217,250,46,20);
add(box1);
add(box2);
add(ta);
add(bt1);
bt1.addActionListener(this);
add(bt2);
bt2.addActionListener(this);
add(bt3);
bt3.addActionListener(this);

setBounds(100,200,400,300);
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
}
);
validate();

}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==bt3)
{
setVisible(false);
//Survey.wf.setVisible(true);
}
if(e.getSource()==bt1)
{
if(box1.getState())
x++;
if(box2.getState())
y++;
}
if(e.getSource()==bt2)
{
ta.setText("");
ta.append("\n最后票数如下"+"\n\n");
ta.append(box1.getLabel()+"的票数为:"+x+"\n\n");
ta.append(box2.getLabel()+"的票数为:"+y+"\n\n");
ta.append("总的票数为:"+(x+y)+"\n\n");
}
}

	
	
}
private static String readLine(int lineNumber,BufferedReader reader)throws Exception{
    	String line="";
    	int i=0;
        line=reader.readLine();
        return line;
}}
