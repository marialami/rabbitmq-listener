package com.rabbit.manufactura.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ManufacturaListener {

    @RabbitListener(queues = {"notificacion.ventaitem.contabilidad"})
    public void recibirNotificacionCambiosContabilidad(String notificacion) {
        System.out.println("Notificacion: " + notificacion);
    }
}
