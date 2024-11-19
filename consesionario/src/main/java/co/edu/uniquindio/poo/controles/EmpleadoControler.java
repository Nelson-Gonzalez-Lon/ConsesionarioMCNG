package co.edu.uniquindio.poo.controles;

import co.edu.uniquindio.poo.model.Concesionario;

public class EmpleadoControler {

    static Concesionario concesionario;
        
        public EmpleadoControler(Concesionario concesionario){
            EmpleadoControler.concesionario = concesionario;
        }
    
        public static boolean buscarEmpleado(String contraseña, String usuario){
            return concesionario.iniciarSecion(contraseña,usuario);
    }
}