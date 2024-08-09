package servicio;

import dao.IDAO;
import modelo.Odontologo;
import dao.impl.ImplementacionDao;

import java.util.List;


public class OdontologoServicio {
    private IDAO<Odontologo> interfazDAO;

    public OdontologoServicio() {
        this.interfazDAO = new ImplementacionDao();
    }

    public Odontologo guardar(Odontologo odontologo) {
        return interfazDAO.guardar(odontologo);
    }

    public List<Odontologo> listarTodos() {
        return interfazDAO.listarTodos();
    }

}
