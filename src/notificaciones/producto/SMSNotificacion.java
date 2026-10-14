package notificaciones.producto;

// Producto concreto
public class SMSNotificacion implements Notificacion {
    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("[SMS] Para: " + destinatario + " | " + mensaje);
    }
}
