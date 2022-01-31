package MiniProject;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPage extends Container {

    private MainFrame parent;

    private JButton addPageButton;
    private JButton listPageButton;
    private JButton exitButton;

    public MenuPage(MainFrame parent) {

        this.parent = parent;

        setSize(500,500);
        setLayout(null);

        addPageButton = new JButton("ADD STUDENT");
        addPageButton.setSize(300,30);
        addPageButton.setLocation(100,100);
        add(addPageButton);
        addPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parent.getMenuPage().setVisible(false);
                parent.getAddPage().setVisible(true);
            }
        });

        listPageButton = new JButton("LIST STUDENTS");
        listPageButton.setSize(300,30);
        listPageButton.setLocation(100,150);
        add(listPageButton);
        listPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                parent.getMenuPage().setVisible(false);
                parent.getListPage().setVisible(true);
            }
        });

        exitButton = new JButton("EXIT");
        exitButton.setSize(300,30);
        exitButton.setLocation(100,200);
        add(exitButton);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }

}
