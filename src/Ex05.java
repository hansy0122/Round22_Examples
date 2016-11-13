import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import javax.swing.tree.*;

class Ex05_sub extends JFrame{
	private BorderLayout bl=new BorderLayout();
	
	private JDesktopPane pane=new JDesktopPane();
	
	private JInternalFrame jif1=new JInternalFrame("1번",true,true,true,true);
	private JInternalFrame jif2=new JInternalFrame("2번",true,true,true,true);
	private JInternalFrame jif3=new JInternalFrame("3번",true,true,true,true);
	
	public Ex05_sub(String title){
	super(title);
	
	this.init();
	this.start();
	
	super.setSize(400,400);
	Dimension screen =Toolkit.getDefaultToolkit().getScreenSize();
	Dimension frm=this.getSize();
	int xpos=(int)(screen.getWidth()/2-frm.getWidth()/2);
	int ypos=(int)(screen.getHeight()/2-frm.getWidth()/2);
	super.setLocation(xpos, ypos);
	super.setResizable(false);
	super.setVisible(true);
	
	}
	public void init(){
		Container con=this.getContentPane(); //작업영역만 따로빼서 집어넣음
			con.setLayout(bl);
			jif1.setBounds(0,0,200,150);
			jif2.setBounds(20,20,200,150);
			jif3.setBounds(40,40,200,150);
			pane.add(jif1);
			pane.add(jif2);
			pane.add(jif3);
			jif1.setVisible(true);
			jif2.setVisible(true);
			jif3.setVisible(true);
			con.add("Center", pane);
	}
	public void start(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x눌리면 종료 //자주사용하는 기능 메소드로 정의해 놓음.
	}
}

public class Ex05 {
public static void main(String ar[]){
	Ex05_sub ex=new Ex05_sub("제목");
}
}


