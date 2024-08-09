package dao.Implementacion;

import dao.IDao1;
import entidades.Odontologo1;
import dao.BD1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ImplementacionDaoH2_1 implements IDao1<Odontologo1> {
    @Override
    public Odontologo1 guardar(Odontologo1 odontologo) {
        Connection connection = null;

        try {

            connection = BD1.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO ODONTOLOGOS (" +
                            "ID, NOMBRE, APELLIDO, MATRICULA) VALUES " +
                            "(?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS
            );

            preparedStatement.setInt(2, odontologo.getId());
            preparedStatement.setString(2, odontologo.getNombre());
            preparedStatement.setString(3, odontologo.getApellido());
            preparedStatement.setInt(4, odontologo.getMatricula());


            preparedStatement.execute();

            //guardé el odntologo y se generó el id

            ResultSet rs = preparedStatement.getGeneratedKeys();



        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return odontologo;
    }

    @Override
    public List<Odontologo1> listarTodos() {
        Connection connection = null;

        List<Odontologo1> odontologoList = new ArrayList<>();
        Odontologo1 odontologo = null;

        try {
            connection = BD1.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT * FROM ODONTOLOGOS"
            );

            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()) {
                Odontologo1 Odontologo = new Odontologo1(rs.getInt(1), rs.getString(2),
                        rs.getString(3), rs.getInt(4));

                odontologoList.add(odontologo);

                System.out.println(odontologo.toString());
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return odontologoList;

    }
}
