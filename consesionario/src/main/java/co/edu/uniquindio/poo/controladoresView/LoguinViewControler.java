package co.edu.uniquindio.poo.controladoresView;

 import java.net.URL;
 import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controles.EmpleadoControler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
 import javafx.scene.control.Button;
 import javafx.scene.control.ComboBox;
 import javafx.scene.control.TextField;
 
 public class LoguinViewControler {

    App app;
 
     @FXML // ResourceBundle that was given to the FXMLLoader
     private ResourceBundle resources;
 
     @FXML // URL location of the FXML file that was given to the FXMLLoader
     private URL location;
 
     @FXML // fx:id="btnCrearUsuario"
     private Button btnCrearUsuario; // Value injected by FXMLLoader
 
     @FXML // fx:id="btnIngresar"
     private Button btnIngresar; // Value injected by FXMLLoader
 
     @FXML // fx:id="btnRecuperarContraseña"
     private Button btnRecuperarContraseña; // Value injected by FXMLLoader
 
     @FXML // fx:id="comboxRol"
     private ComboBox<?> comboxRol; // Value injected by FXMLLoader
 
     @FXML // fx:id="txtContraseña"
     private TextField txtContraseña; // Value injected by FXMLLoader
 
     @FXML // fx:id="txtNomUsu"
     private TextField txtNomUsu; // Value injected by FXMLLoader
 
    @FXML
    void crearUsuarioAction(ActionEvent event) {

    }

    @FXML
    void ingresarAction(ActionEvent event) {

        Boolean esAdministrador = false;
        String usuario = txtNomUsu.getText();
        String contraseña = txtNomUsu.getText();

        if (esAdministrador) {
            
        }else{
            boolean usuarioExiste = EmpleadoControler.buscarEmpleado(contraseña, usuario);
            if (usuarioExiste) {
                //**Enviar a ventana empleado
            }
        }
    }

    @FXML
    void recuperarAction(ActionEvent event) {

    }
     @FXML // This method is called by the FXMLLoader when initialization is complete
     void initialize() {
         assert btnCrearUsuario != null : "fx:id=\"btnCrearUsuario\" was not injected: check your FXML file 'loguin.fxml'.";
         assert btnIngresar != null : "fx:id=\"btnIngresar\" was not injected: check your FXML file 'loguin.fxml'.";
         assert btnRecuperarContraseña != null : "fx:id=\"btnRecuperarContraseña\" was not injected: check your FXML file 'loguin.fxml'.";
         assert comboxRol != null : "fx:id=\"comboxRol\" was not injected: check your FXML file 'loguin.fxml'.";
         assert txtContraseña != null : "fx:id=\"txtContraseña\" was not injected: check your FXML file 'loguin.fxml'.";
         assert txtNomUsu != null : "fx:id=\"txtNomUsu\" was not injected: check your FXML file 'loguin.fxml'.";
 
     }
 
     public void setApp(App app) {
         this.app = app;
     }
 }
 
