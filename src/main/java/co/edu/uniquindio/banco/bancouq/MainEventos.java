package co.edu.uniquindio.banco.bancouq;

import co.edu.uniquindio.banco.bancouq.controller.ModelFactoryController;
import co.edu.uniquindio.banco.bancouq.mapping.dto.EmpleadoDto;

import java.util.List;

public class MainEventos {

    public static void main(String[] args) {
        ModelFactoryController modelFactoryController = ModelFactoryController.getInstance();

        EmpleadoDto empleadoDto = new EmpleadoDto(
                "juan",
                "arias",
                "546",
                "654",
                "armenia",
                "",
                "",
                "Auxiliar",
                "Unicentro"
                );

        if(modelFactoryController.agregarEmpleado(empleadoDto)){
            System.out.println("No existe se agrgeo correctamente");
        }else{
            System.out.println("Ya existe");
        }

        List<EmpleadoDto> empleadoDtoList = modelFactoryController.obtenerEmpleados();
        empleadoDtoList.forEach(System.out::println);
    }
}
