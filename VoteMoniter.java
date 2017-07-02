import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VoteMoniter  extends Frame implements ActionListener {
	

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
box2.setBounds(200,45,50,15);
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
Vote.wf.setVisible(true);
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
