package unidad.dos.componentes;
import java.sql.*;
import java.sql.Connection;
public class PruebaMysqlConn {

    public static void main(String[] args) {
        Connection conn;
        Statement stm;
        ResultSet rst;

        String Query="Select * from alumnos";
        String URL="jdbc:mysql://localhost/TAP2021";

        try{
            conn=DriverManager.
                    getConnection(URL,"root","");
            stm=conn.createStatement();
            rst=stm.executeQuery(Query);
            while(rst.next()){
                System.out.println(rst.getString(1)
                        +"--"+rst.getString(2));

            }
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
