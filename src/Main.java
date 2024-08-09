import modelo.Odontologo;
import servicio.OdontologoServicio;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Odontologo odontologo = new Odontologo(123, "martin", "suarez", 123);
        OdontologoServicio servicio = new OdontologoServicio();
        servicio.guardar(odontologo);
        System.out.println("Este es el odontologo");
        System.out.println(odontologo.toString());

        Odontologo od2 = new Odontologo(134, "vfvf", "Colombifvfa", 1233);
        Odontologo od3 = new Odontologo(1334, "vfvf", "Colombifvfa", 123333);
        servicio.guardar(od2);
        servicio.guardar(od3);
        System.out.println("lista");
        servicio.listarTodos();

        //Con sql 

        Odontologo1 odontologo = new Odontologo1(1,
                "Maria",
                "Perez",
                654321
               );

        OdontologoServicio1 servicio = new OdontologoServicio1();

        servicio.guardar(odontologo);

        System.out.println("*****");
        System.out.println(odontologo.toString());

        Odontologo1 odontologo2 = new Odontologo1(2,
                "Maria",
                "Perez",
                654321
        );

        OdontologoServicio1 odontologoServicio = new OdontologoServicio1();

        servicio.guardar(odontologo2);

        System.out.println("*****");
        System.out.println(odontologo.toString());

        servicio.listarTodos();


    }


}
