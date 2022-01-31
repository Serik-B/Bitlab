package MiniProject;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListPage extends Container {

    private MainFrame parent;

    private JLabel label;
    private JButton back;
    private JButton update;
    private String header[] = {"Name", "Surname", "Age"};
    private JTextArea area1;

    public ListPage(MainFrame parent) {

        this.parent = parent;
        setSize(500, 500);
        setLayout(null);
        JTextArea area1 = new JTextArea();
        area1.setSize(400, 250);
        area1.setLocation(50, 80);
        area1.setEditable(false);
        add(area1);

        label = new JLabel("LIST STUDENTS");
        label.setSize(300, 30);
        label.setLocation(50, 30);
        add(label);
        update=new JButton("Update");
        update.setSize(100, 30);
        update.setLocation(50, 400);
        add(update);
        update.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i< MainFrame.studentNumber; i++) {
                    area1.append(MainFrame.students.get(i).toString() + "\n");
                }
            }
        });
        back = new JButton("BACK");
        back.setSize(100,30);
        back.setLocation(350,400);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                parent.getListPage().setVisible(false);
                parent.getMenuPage().setVisible(true);
            }
        });
    }
}



