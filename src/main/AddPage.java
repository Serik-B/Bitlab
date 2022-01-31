package MiniProject;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPage extends Container {
    private JButton button;
    private MainFrame parent;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel label;
    private JButton back;
    private JButton add;
    private JComboBox agesBox;

    private Integer[]ages=new Integer[101];


    public AddPage(MainFrame parent) {
        for( Integer i=0;i<=100;i++){
            ages[i]=i;}
        this.parent = parent;
        setSize(500,500);
        setLayout(null);

        label = new JLabel("NAME:");
        label.setSize(200,30);
        label.setLocation(100,50);
        add(label);

        textField1 = new JTextField();
        textField1.setSize(350,30);
        textField1.setLocation(200,50);
        add(textField1);

        label = new JLabel("SURNAME:");
        label.setSize(200,30);
        label.setLocation(100,100);
        add(label);
        textField2 = new JTextField("");
        textField2.setSize(350,30);
        textField2.setLocation(200,100);
        add(textField2);

        label = new JLabel("AGE:");
        label.setSize(200,30);
        label.setLocation(100,200);
        add(label);

        agesBox = new JComboBox(ages);
        agesBox.setSize(200,30);
        agesBox.setLocation(150,150);
        add(agesBox);




        add = new JButton("ADD");
        add.setSize(100,30);
        add.setLocation(150,300);
        add(add);


       add.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
//                MainFrame.students.set(MainFrame.studentNumber+1, new Students(null, textField1.getText(), textField2.getText(), (int)agesBox.getSelectedItem()));
//               MainFrame.studentNumber++;
//
               textField1.setText("");
                textField2.setText("");
              agesBox.setSelectedIndex(0);

          }
     }
       );


        back = new JButton("BACK");
        back.setSize(100,30);
        back.setLocation(400,300);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parent.getAddPage().setVisible(false);
                parent.getMenuPage().setVisible(true);
            }
        });
    }
}
