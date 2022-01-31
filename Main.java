import java.sql.SQLException;

import singleton.ConexionSingleton;

public class Main {
    
    public static void main(String[] args){
        try {
        //Creacion de objeto singleton
        ConexionSingleton conexionSingleton = ConexionSingleton.getInstance(
            "jdbc:mysql://localhost:3306/dbTDiseño",
            "dbTDiseño_user",
            "12341234");
            //Select
            conexionSingleton.getConexion().query("select * from Users");
            //Insert
            conexionSingleton.getConexion().query("Insert into Users values ('Antonio Nava')");
            //Update
            conexionSingleton.getConexion().query("Update Users SET  [nombre] = 'Roberto Nava', WHERE nombre= 'Nombre Generico'");
            //Delete
            conexionSingleton.getConexion().query("Delete from Users where nombre = 'Juan Perez'");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }       
        
    }
}
