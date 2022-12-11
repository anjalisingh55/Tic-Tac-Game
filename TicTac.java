import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
	Button b[]=new Button[9];
	int x=100,y=100,w=100,h=100;
	FDemo()
	{
		setLayout(null);
		Font f=new Font("Arial Black",Font.BOLD,30);
		setFont(f);
		int k=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				b[k]=new Button("");
				b[k].setSize(w,h);
				b[k].setLocation(x,y);
				add(b[k]);
				b[k].addActionListener(this);
				k++;
				x=x+100;
			}
			x=100;
			y=y+100;
		}
	}
	int c=0;
	public void actionPerformed(ActionEvent e)
	{
		Button b1=(Button)e.getSource();
		if(c%2==0)
		{
			b1.setLabel("O");
		}
		else
		{
			b1.setLabel("X");
		}
		b1.addActionListener(this);
		c++;
		
		if(
		(b[0].getLabel()=="X" && b[1].getLabel()=="X" && b[2].getLabel()=="X")
		||
		(b[3].getLabel()=="X" && b[4].getLabel()=="X" && b[5].getLabel()=="X")
		||
		(b[6].getLabel()=="X" && b[7].getLabel()=="X" && b[8].getLabel()=="X")
		||
		(b[0].getLabel()=="X" && b[4].getLabel()=="X" && b[8].getLabel()=="X")
		||
		(b[2].getLabel()=="X" && b[4].getLabel()=="X" && b[6].getLabel()=="X")
		||
		(b[0].getLabel()=="X" && b[3].getLabel()=="X" && b[6].getLabel()=="X")
		||
		(b[1].getLabel()=="X" && b[4].getLabel()=="X" && b[7].getLabel()=="X")
		||
		(b[2].getLabel()=="X" && b[5].getLabel()=="X" && b[8].getLabel()=="X")
		)
		{
			//System.out.println("player one is winner");
			JOptionPane.showMessageDialog(null,"player one is winner");
		}	
		else if(
		(b[0].getLabel()=="O" && b[1].getLabel()=="O" && b[2].getLabel()=="O")
		||
		(b[3].getLabel()=="O" && b[4].getLabel()=="O" && b[5].getLabel()=="O")
		||
		(b[6].getLabel()=="O" && b[7].getLabel()=="O" && b[8].getLabel()=="O")
		||
		(b[0].getLabel()=="O" && b[3].getLabel()=="O" && b[6].getLabel()=="O")
		||
		(b[1].getLabel()=="O" && b[4].getLabel()=="O" && b[7].getLabel()=="O")
		||
		(b[2].getLabel()=="O" && b[5].getLabel()=="O" && b[8].getLabel()=="O")
		||
		(b[0].getLabel()=="O" && b[4].getLabel()=="O" && b[8].getLabel()=="O")
		||
		(b[2].getLabel()=="O" && b[4].getLabel()=="O" && b[6].getLabel()=="O")
		)
		{
			JOptionPane.showMessageDialog(null,"player two is winner");
		}	
	}
}
class TicTac
{
	public static void main(String args[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(500,500);
		f.setLocation(400,100);
		f.setBackground(Color.black);
	}
}