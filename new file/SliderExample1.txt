import javax.swing.*;
public class SliderExample1 extends JFrame{
    public SliderExample1(){
        JSlider slider =new  JSlider(JSlider.HORIZONTAL,0,50,25);
        JPanel Panel=new JPanel();
        Panel.add(slider);
        add(Panel);
    }
        public static void main(String s[]){
            SliderExample1 frame = new SliderExample1();
            frame.pack();
            frame.setVisible(true);
            

        }

    }

   