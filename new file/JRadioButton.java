import javax.swing.*;
import java.awt.*;
class JRadioButton
{
public static void main(String ar[])
{
    JFrame f=new JFrame();
    f.setBounds(100,100,700,500);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c=f.getContentPane();
    c.setLayout(null);
    
    JRadioButton radio1=new JRadioButton("Male");
    radio1.setBounds(100,50,100,20);
    c.add(radio1);
    JRadioButton radio2=new JRadioButton("Female");
    radio2.setBounds(200,50,100,20);
    c.add(radio2);
    ButtonGroup gender=new ButtonGroup();
    gender.add(radio1);
    gender.add(radio2);
    f.setVisible(true);
}
}
