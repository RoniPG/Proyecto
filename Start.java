
// @author roni0

public class Start {
 
    public static void main(String[] args) {
        ConectarDB conexion = new ConectarDB();
      //conexion.verTablas(); ---> Llamada al metodo oculto
        conexion.desconectar();
    }
}
