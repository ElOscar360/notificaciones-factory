package notificaciones.factory;

import notificaciones.producto.EmailNotificacion;
import notificaciones.producto.Notificacion;
import notificaciones.producto.SMSNotificacion;
import notificaciones.producto.WhatsAppNotificacion;

// Fábrica: equivale a SimplePizzaFactory.
// Es la única clase que conoce las clases concretas.
public class NotificacionFactory {

    public Notificacion crearNotificacion(String tipo) {
        Notificacion notificacion = null;

        if (tipo.equalsIgnoreCase("email")) {
            notificacion = new EmailNotificacion();
        } else if (tipo.equalsIgnoreCase("sms")) {
            notificacion = new SMSNotificacion();
        } else if (tipo.equalsIgnoreCase("whatsapp")) {
            notificacion = new WhatsAppNotificacion();
        } else {
            throw new IllegalArgumentException("Tipo de notificación no soportado: " + tipo);
        }
        return notificacion;
    }
}
