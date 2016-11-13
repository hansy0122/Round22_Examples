import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import javax.swing.tree.*;

class Ex02_sub extends JFrame{
	
	private JButton jbt1=new JButton("EMPTY");
	private JButton jbt2=new JButton("LINE");
	private JButton jbt3=new JButton("ETCHED");
	private JButton jbt4=new JButton("BEVEL");
	private JButton jbt5=new JButton("SOFTBEVEL");
	private JButton jbt6=new JButton("MATTE");
	private JButton jbt7=new JButton("TITLED");
	private JButton jbt8=new JButton("COMPOUND");
	
	
	private GridLayout bl=new GridLayout(4,2,5,5);
	
	public Ex02_sub(String title){
	super(title);
	
	this.init();
	this.start();
	
	super.setSize(300,300);
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
		EmptyBorder b1=new EmptyBorder(5,3,5,3);
		jbt1.setBorder(b1);
		LineBorder b2=new LineBorder(Color.red,3);
		jbt2.setBorder(b2);
		EtchedBorder b3=new EtchedBorder();
		jbt3.setBorder(b3);
		BevelBorder b4=new BevelBorder(BevelBorder.RAISED);
		jbt4.setBorder(b4);
		SoftBevelBorder b5=new SoftBevelBorder(SoftBevelBorder.LOWERED);
		jbt5.setBorder(b5);
		MatteBorder b6=new MatteBorder(5,10,15,20,Color.blue);
		jbt6.setBorder(b6);
		TitledBorder b7=new TitledBorder("제목");
		jbt7.setBorder(b7);
		CompoundBorder b8=new CompoundBorder(b4,b7);
		jbt8.setBorder(b8);
		con.add(jbt1);con.add(jbt2);con.add(jbt3);con.add(jbt4);con.add(jbt5);con.add(jbt6);con.add(jbt7);con.add(jbt8);
	}
	public void start(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x눌리면 종료 //자주사용하는 기능 메소드로 정의해 놓음.
	}
}

public class Ex02 {
public static void main(String ar[]){
	Ex02_sub ex=new Ex02_sub("제목");
}
}
