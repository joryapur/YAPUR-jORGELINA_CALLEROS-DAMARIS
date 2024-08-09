package dao.impl;

import modelo.Odontologo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import servicio.OdontologoServicio;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ImplementacionDaoTest {

    @Test
    public void casoUno() {
        Odontologo od1 = new Odontologo(1223, "JOSE","GOMEZ",234);
        Odontologo od2 = new Odontologo(345, "marta","gris",124);
        OdontologoServicio servicio = new OdontologoServicio();
        servicio.guardar(od1);
        servicio.guardar(od2);
        List<Odontologo> odontologos = servicio.listarTodos();

        assertEquals(2, odontologos.size());
        assertEquals(od1, odontologos.get(0));
        assertEquals(od2, odontologos.get(1));



    }

}