import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import javax.swing.tree.*;

class Ex04_sub extends JFrame{
	private JFileChooser jfc=new JFileChooser(".");
	
	public Ex04_sub(String title){
	super(title);
	
	this.init();
	this.start();
	
	super.setSize(300,200);
	Dimension screen =Toolkit.getDefaultToolkit().getScreenSize();
	Dimension frm=this.getSize();
	int xpos=(int)(screen.getWidth()/2-frm.getWidth()/2);
	int ypos=(int)(screen.getHeight()/2-frm.getWidth()/2);
	super.setLocation(xpos, ypos);
	super.setResizable(false);
	super.setVisible(true);
	
	
	try{Thread.sleep(2000);
	}catch(InterruptedException e){}
	
	String str=JOptionPane.showInputDialog(this,"이름=","입력!",JOptionPane.QUESTION_MESSAGE);
	System.out.println("str"+str);
	
	/*int x=JOptionPane.showConfirmDialog(this,"정말로 삭제하시겠습니까?","삭제",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
	System.out.println(x);*/
	//JOptionPane.showMessageDialog(this, "경고입니다","경고",JOptionPane.WARNING_MESSAGE); // 마지막은 dialog에 들어가는 icon선택
	
	/*try{Thread.sleep(2000);
	}catch(InterruptedException e){}
	
	Color cc=JColorChooser.showDialog(this, "색상선택", Color.black);
	System.out.println("cc="+cc);
	
	try{Thread.sleep(2000);
	}catch(InterruptedException e){}
	
	int x=jfc.showOpenDialog(this); //jfc.showSaveDialog(this);
	System.out.println(x); //x는 열기버튼 클릭시 0 취소 혹은 x클릭시 1
*/	}
	public void init(){
		Container con=this.getContentPane(); //작업영역만 따로빼서 집어넣음
		
	}
	public void start(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x눌리면 종료 //자주사용하는 기능 메소드로 정의해 놓음.
	}
}

public class Ex04 {
public static void main(String ar[]){
	Ex04_sub ex=new Ex04_sub("제목");
}
}
