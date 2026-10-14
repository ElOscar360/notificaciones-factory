package notificaciones.producto;

// Producto concreto
public class WhatsAppNotificacion implements Notificacion {
    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("[WHATSAPP] Para: " + destinatario + " | " + mensaje);
    }
}
