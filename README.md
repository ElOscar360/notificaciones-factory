# Sistema de notificaciones - Patrón Factory


## Estructura

```
src/notificaciones/
├── Main.java
├── producto/    -> Notificacion (interfaz) y sus implementaciones
├── factory/     -> NotificacionFactory (crea las notificaciones)
└── servicio/    -> ServicioNotificaciones (cliente de la fábrica)
```

## Para agregar un canal nuevo

1. Crear una clase que implemente `Notificacion` en `producto/`.
2. Agregar un `else if` en `NotificacionFactory`.
