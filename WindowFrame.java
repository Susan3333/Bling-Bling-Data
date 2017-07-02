import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowFrame extends Frame implements WindowListener {

MyPanel1 panel1;
WindowFrame(String s) throws Exception
{
super(s);
panel1=new MyPanel1();
panel1.setVisible(true);
add(panel1);
addWindowListener(this);
setBounds(100,200,400,300);
setVisible(true);
validate();
}
public void windowActivated(WindowEvent e)
{
}
public void windowDeactivated(WindowEvent e)
{
}
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
public void windowClosed(WindowEvent e)
{

}
public void windowIconified(WindowEvent e)
{

}
public void windowDeiconified(WindowEvent e)
{

}
public void windowOpened(WindowEvent e)
{

}


}
