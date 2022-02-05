
package ventana;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;

public class conectar {
    Connection conectar;
    
    public Connection conexion(){
    try {
        Class.forName("com.mysql.jdbc.Driver");
        conectar = DriverManager.getConnection("jdbc:mysql://localhost/zoologico","root","root");
    }   catch (ClassNotFoundException | SQLException e) {
        System.out.print(e.getMessage());
    }      
        return conectar;
    
}
    
}

