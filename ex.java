import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionListener;

public class ex extends JFrame{

    private JTextField txt;
    private JButton btn1;
    private JButton btn2;


    public ex(){
        super("Счетчик");
        setSize(330,250);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel label = new JLabel("Число");
        label.setBounds(25,75,50,25);

        txt = new JTextField("0");
        txt.setEditable(false);
        txt.setBounds(75,75,100,25);

        btn1 = new JButton("+1");
        btn1.setBounds(180,75,75,25);

        btn2 = new JButton("-1");
        btn2.setBounds(180,100,75,25);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int num, result;
                num = Integer.parseInt(txt.getText());
                if(num < 3){
                    result = num+1;
                    txt.setText(String.valueOf(result));
                }
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int num, result;
                num = Integer.parseInt(txt.getText());
                if(num > -5){
                    result = num-1;
                    txt.setText(String.valueOf(result));
                }
            }
        });

        add(label);
        add(txt);
        add(btn1);
        add(btn2);

        setVisible(true);
    }
    public static void main(String[] args) {
        new ex ();
    }
}