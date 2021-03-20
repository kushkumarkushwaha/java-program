import javax.swing.*;
class TextFieldExample
{
    public static void main(String ar[])
    {
    JFrame f=new JFrame("TextFieldExamle");
    JTextField t1,t2;
    t1=new JTextField("welcome to luv ");
    t1.setBounds(50,100,200,30);
    t2=new JTextField("love ");
    t2.setBounds(50,150,200,30);
    f.add(t1);
    f.add(t2);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
}}