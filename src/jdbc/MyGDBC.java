package jdbc;

import classe.departement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static service.serviceDepartement.gettoutDept;

public class MyGDBC {
    public static void main(String[] args) throws SQLException {
        String url;
        url="jdbc:mysql://localhost:3306/jdbc";
        String root="root";
        String password=null;

        try {
            Connection cx = DriverManager.getConnection(url, root, password);
            System.out.println("Good Connection");


//            createTable(cx);
            List<departement> departements = gettoutDept(cx);
            for (departement departement : departements) {
                System.out.println(departement.toString());
            }





        } catch (SQLException e) {
            System.out.println("Bad Connection");
            e.printStackTrace();
        }
    }


    public static void insertDepartement(departement departement, Connection cx) throws SQLException {
        String query = "INSERT INTO departement (id, intitule,responsable) values (?,?,.)";

        PreparedStatement ps = cx.prepareStatement(query);

        ps.setString(1, departement.getIntitule());
        ps.setInt(2, departement.getId());

        ps.executeUpdate();


    }

    public static void deleteDepartement(int id, Connection cx) throws SQLException {
        String query = "DELETE  from departement where id = ?";
        PreparedStatement ps = cx.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();


    }



    public static List<departement> getAllDepartements(Connection cx) throws SQLException {
        String query = "SELECT * from departement";
        List<departement> departements = new ArrayList<>();

        Statement st = cx.createStatement();

        ResultSet r = st.executeQuery(query);

        while (r.next()) {
            departements.add(
                    new departement(r.getString("intitule"),
                            r.getInt("Id"),
                            r.getInt("responsable")
                    )
            );
        }

        return departements;


    }

    public static void createTable(Connection cx) throws SQLException {
        String query = "CREATE TABLE IF NOT EXISTS departement(\n" +
                "                                       id int primary key auto_increment,\n" +
                "                                       intitule nvarchar(255),\n" +
                "                                       responsable nvarchar(255)\n" +
                ");";

        Statement st = cx.createStatement();

        st.execute(query);


    }
}