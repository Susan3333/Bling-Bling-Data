import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.JLabel;

public class MyPanel1  extends Panel implements ItemListener,ActionListener{
	private static final int CENTER = 0;
	JLabel question;
	Panel p1,p2,p3;
	Checkbox box1,box2,box3,box4,box5;
	TextArea text;
	String t;
	Button btVote,bttj,btCan;
	CheckboxGroup group;
	static String str1,str2;
	static int numz,numl,numw,numa;
	VoteMoniter vm;
	String q;

private static String readLine(int lineNumber,BufferedReader reader)throws Exception{
String line="";
int i=0;
//while(i<lineNumber){
line=reader.readLine();
//  i++;
// }
return line;
}





MyPanel1 () throws Exception
{

	p1=new Panel();
	p2=new Panel();

	int j=0;
	BufferedReader br;
	br = new BufferedReader(new InputStreamReader(
											new FileInputStream("F:/投票Demo.txt")));
	//String q=readLine(++j,br);
	String a=readLine(++j,br);
	String b=readLine(++j,br);
	String c=readLine(++j,br);
	question=new JLabel(q);
	question.setHorizontalAlignment(CENTER);
	//p1.add(question);
	box1=new Checkbox(a);
	box1.addItemListener(this);
	p1.add(box1);
	box2=new Checkbox(b);
	box2.addItemListener(this);p1.add(box2);
	box3=new Checkbox(c);
	box3.addItemListener(this);
	p1.add(box3);
	text=new TextArea(10,40);

	btVote=new Button("投票");
	btVote.addActionListener(this);
	bttj=new Button("统计");
	bttj.addActionListener(this);
	btCan=new Button("二次投票");
	btCan.addActionListener(this);
	btCan.setEnabled(false);

	vm=new VoteMoniter("二次投票");
	p2.add(btVote);
	p2.add(bttj);
	p2.add(btCan);
	add(p1,BorderLayout.NORTH);
	add(text,BorderLayout.CENTER);
	add(p2,BorderLayout.SOUTH);
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==btVote)
{
	if(box1.getState())
		numz++;
	if(box2.getState())
		numl++;
	if(box3.getState())
		numw++;
	btCan.setEnabled(true);
}

if(e.getSource()==bttj)
{
numa=numz+numl+numw;
text.setText(" ");
text.append("统计票数如下"+"\n\n\n");
text.append(box1.getLabel()+"的票数为:"+Integer.toString(numz)+"\n\n");
text.append(box2.getLabel()+"的票数为:"+Integer.toString(numl)+"\n\n");
text.append(box3.getLabel()+"的票数为:"+Integer.toString(numw)+"\n\n");
text.append("总票数为:"+Integer.toString(numa));
box1.setState(false);
box2.setState(false);
box3.setState(false);
}

if(e.getSource()==btCan)
{
CheckTwo();
vm.setVisible(true);
vm.box1.setLabel(str1);
vm.box2.setLabel(str2);
text.setText("");

}
}
public void CheckTwo()
{
if((numz>numw)&&(numl>numw))
{
	str1=box1.getLabel();
	str2=box2.getLabel();
}
if((numz>numl)&&(numw>numl))
{
	str1=box1.getLabel();
	str2=box3.getLabel();
}
if((numw>numz)&&(numl>numz))
{
	str1=box2.getLabel();
	str2=box3.getLabel();
}
}

public void itemStateChanged(ItemEvent e)
{
if(box1.getState()&&box2.getState()&&box3.getState())
{
Checkbox box=(Checkbox)e.getSource();
box.setState(false);
}
}
}
