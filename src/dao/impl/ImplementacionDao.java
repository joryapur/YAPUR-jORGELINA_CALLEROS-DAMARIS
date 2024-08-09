package dao.impl;

import dao.IDAO;
import modelo.Odontologo;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class ImplementacionDao implements IDAO<Odontologo> {



    public ImplementacionDao() {
    }

    private List<Odontologo> odontologoList = new ArrayList<Odontologo>();

    @Override
    public Odontologo guardar(Odontologo od) {
        try {
            if (odontologoList.contains(od)) {
                System.out.println("Ya existe ese odontologo");

            }
            else {
                odontologoList.add(od);
                System.out.println("Se agrego el odontologo");

            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return od;
    }

    @Override
    public List<Odontologo> listarTodos() {
        for (int i = 0; i < odontologoList.size(); i++) {
            System.out.println(odontologoList.get(i).toString());
        }

        return this.odontologoList;
    }



}
