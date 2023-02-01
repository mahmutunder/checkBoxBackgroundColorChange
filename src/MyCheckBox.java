import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyCheckBox extends JFrame {

    private JCheckBox red;
    private JCheckBox green;
    private JCheckBox blue;
    private JPanel panel;

    public MyCheckBox() {
        red = new JCheckBox("Red");
        red.addItemListener(new Item());
        green = new JCheckBox("Green");
        green.addItemListener(new Item());
        blue = new JCheckBox("Blue");
        blue.addItemListener(new Item());
        panel = new JPanel();
        setTitle("Check box");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setBorder(BorderFactory.createLineBorder(Color.black,25));
       // getContentPane().setBackground(Color.red);

        panel.add(red);
        panel.add(green);
        panel.add(blue);

        add(panel);


        setVisible(true);


    }

    public static void main(String[] args) {
        new MyCheckBox();
    }

    private class Item implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {

            if (e.getSource() == red) {

                if(red.isSelected()){
                    panel.setBackground(Color.red);

                }else{
                    panel.setBackground(Color.gray);
                }

            }

                if (green.isSelected()) {
                    panel.setBackground(Color.green);
                }
                if (blue.isSelected()) {
                    panel.setBackground(Color.blue);
                }
            }
        }
    }
