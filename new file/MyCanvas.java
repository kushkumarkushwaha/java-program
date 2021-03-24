import javax.swing.*;
public class sliderexample1 extends JFrame{
    public sliderexample1(){
        JSlider slider =new  JSlider(JSlider.HORIZONTAL,0,50,25);
        JPanel Panel=new JPanel();
        Panel.add(slider);
        add(Panel);
    }
        public static void main(String s[]){
            sliderexample1 frame = new sliderexample1();
            frame.pack();
            frame.setVisible(true);
            

        }

    }

   