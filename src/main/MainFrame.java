package MiniProject;



import javax.swing.*;
import java.util.ArrayList;

public class MainFrame extends JFrame {

    private MenuPage menuPage;
    private AddPage addPage;
    private ListPage listPage;
    public static ArrayList<Students> students=new ArrayList<MiniProject.Students>();
    public static int studentNumber=0;
    private AddPage getAddPage;



    public MainFrame(){


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("STUDENT APPLICATION");
        setSize(500,500);
        setLayout(null);

        menuPage = new MenuPage(this);
        menuPage.setVisible(true);
        add(menuPage);

        addPage = new AddPage(this);
        addPage.setVisible(false);
        add(addPage);

        listPage = new ListPage(this);
        listPage.setVisible(false);
        add(listPage);

    }

    public MenuPage getMenuPage() {
        return menuPage;
    }

    public AddPage getAddPage() {
        return getAddPage;
    }

    public ListPage getListPage() {
        return listPage;

    }



}

