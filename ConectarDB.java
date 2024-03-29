import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
//Clase creada para realizar la conexion/desconexion de la base de datos 
public class ConectarDB {
	//Atributos de la clase necesaria para realizar la conexion.
    private static Connection conn;
    private static final String driver="com.mysql.cj.jdbc.Driver";
    private static final String user="admin";
    private static final String password="t$PaTd9c";
    private static final String database="App";
    private static final String url="jdbc:mysql://database-1.cplm5hfv9nvv.eu-south-2.rds.amazonaws.com:3306/"+database;
    //Llamada al constructor(vacio) para realizar la conexion
    public ConectarDB(){
        conn= null;
        try{
            //Realizamos la conexion
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            //Condicional en donde se informara al usuario de la correcta coneccion a dicha base
            if(conn!=null){
               System.out.println("-------------------------------------------------");                
               System.out.println("Conectado a la base de datos: "+database);
            }
        //Captacion de errores durante la conexion.
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error al conectar "+e);
        }
    }
    /*Es un metodo para poder ver que tablas hay creadas dentro de la Baser de Datos
    public void verTablas(){
        Statement st = null;
        try{
        st = (Statement) conn.createStatement();
        String sql = "SHOW TABLES";
        ResultSet rs= null;
        rs=st.executeQuery(sql);
        while (rs.next()) {   
            String tablename = rs.getString(1);
            System.out.println(tablename);
        }
        }catch (SQLException e){
        System.out.println("Error al conectar "+e);
        }
    }*/
    //Funcion implementada para la desconexion de la base de datos
    public void desconectar(){
        //Condicional en donde se comprueba si hay alguna conexion activa
        if(conn!=null){
            try {
                //Cerramos la conexion y se lo indicamos al usuario
                conn.close();
                System.out.println("-------------------------------------------------");                
                System.out.println("Desconectado de la base de datos: "+database);
            //Captacion de errores durante la desconexion.
            } catch (SQLException e) {
                System.out.println("Error al desconectar "+e);
            }
        }
    } 
     
}