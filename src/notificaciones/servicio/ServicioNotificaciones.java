package notificaciones.servicio;

import notificaciones.factory.NotificacionFactory;
import notificaciones.producto.Notificacion;

// Cliente de la fábrica: equivale a PizzaStore.
// No importa ninguna clase concreta, solo la interfaz.
public class ServicioNotificaciones {
    private NotificacionFactory factory;

    public ServicioNotificaciones(NotificacionFactory factory) {
        this.factory = factory;
    }

    public void notificar(String tipo, String destinatario, String mensaje) {
        Notificacion notificacion = factory.crearNotificacion(tipo);
        notificacion.enviar(destinatario, mensaje);
    }
}
