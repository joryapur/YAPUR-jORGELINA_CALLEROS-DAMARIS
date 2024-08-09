package servicio;

import dao.IDao1;
import dao.Implementacion.ImplementacionDaoH2_1;
import entidades.Odontologo1;

import java.util.List;

public class OdontologoServicio1 {

    private IDao1<Odontologo1> Idao;

    public OdontologoServicio1() {
        this.Idao = new ImplementacionDaoH2_1();
    }

    public Odontologo1 guardar(Odontologo1 odontologo) {
        return Idao.guardar(odontologo);
    }

    public List<Odontologo1> listarTodos() {
        return Idao.listarTodos();
    }

}
