package notificaciones.producto;

// Producto concreto
public class EmailNotificacion implements Notificacion {
    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("[EMAIL] Para: " + destinatario + " | " + mensaje);
    }
}
