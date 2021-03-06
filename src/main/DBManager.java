package MiniProject;
import JDBC.Items;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBManager {
    private Connection connection;

    public void connect() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Items?useUnicode=true&serverTimezone=UTC", "root", ""
            );
            System.out.println("CONNECTED");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public ArrayList<Students> getAllStudents(){
        ArrayList<Students> students = new ArrayList<>();
        try{
            PreparedStatement st = connection.prepareStatement("SELECT * FROM Students");

            ResultSet rs = st.executeQuery();

            while (rs.next()){
                Long id = rs.getLong("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");


                int age = rs.getInt("age");

                students.add(new Students(id,name,surname,age));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return students;
    }
    public void addStudents(Students studnt){
        try{

            PreparedStatement st = connection.prepareStatement("INSERT INTO students(id, name, surname, age) values(NULL,?,?,?)");

            st.setString(1,studnt.getName());
            st.setString(2,studnt.getSurname());
            st.setDouble(2,studnt.getAge());

            st.executeUpdate();

            st.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public void deleteStudents(Long id){
        try{
            PreparedStatement st = connection.prepareStatement("DELETE FROM students where id = ?");

            st.setLong(1, id);         st.executeUpdate();

            st.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
