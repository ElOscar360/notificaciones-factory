package notificaciones;

import notificaciones.factory.NotificacionFactory;
import notificaciones.servicio.ServicioNotificaciones;

public class Main {
    public static void main(String[] args) {
        NotificacionFactory factory = new NotificacionFactory();
        ServicioNotificaciones servicio = new ServicioNotificaciones(factory);

        servicio.notificar("email", "oscar@correo.com", "Bienvenido a la plataforma");
        servicio.notificar("sms", "+57 300 123 4567", "Tu código es 482913");
        servicio.notificar("whatsapp", "+57 300 123 4567", "Tu pedido va en camino");
    }
}
