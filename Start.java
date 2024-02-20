
// @author roni0

public class Start {
 
    public static void main(String[] args) {
        App login = new App();
        login.setVisible(true);
        login.setLocationRelativeTo(null);        
        
        ConectarDB conexion = new ConectarDB();
      //conexion.verTablas(); ---> Llamada al metodo oculto
        conexion.desconectar();
    }
}
