package co.edu.uniquindio.poo.controladoresView;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class AdministradorViewControler {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="ColumnaCorreo"
    private TableColumn<?, ?> ColumnaCorreo; // Value injected by FXMLLoader

    @FXML // fx:id="ColumnaId"
    private TableColumn<?, ?> ColumnaId; // Value injected by FXMLLoader

    @FXML // fx:id="btnActualizarEmpl"
    private Button btnActualizarEmpl; // Value injected by FXMLLoader

    @FXML // fx:id="btnBloqEmpleado"
    private Button btnBloqEmpleado; // Value injected by FXMLLoader

    @FXML // fx:id="btnBuscInform"
    private Button btnBuscInform; // Value injected by FXMLLoader

    @FXML // fx:id="btnRegistroEmple"
    private Button btnRegistroEmple; // Value injected by FXMLLoader

    @FXML // fx:id="btnRegresar"
    private Button btnRegresar; // Value injected by FXMLLoader

    @FXML // fx:id="columnaNombre"
    private TableColumn<?, ?> columnaNombre; // Value injected by FXMLLoader

    @FXML // fx:id="tablaAdm"
    private TableView<?> tablaAdm; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert ColumnaCorreo != null : "fx:id=\"ColumnaCorreo\" was not injected: check your FXML file 'administrador.fxml'.";
        assert ColumnaId != null : "fx:id=\"ColumnaId\" was not injected: check your FXML file 'administrador.fxml'.";
        assert btnActualizarEmpl != null : "fx:id=\"btnActualizarEmpl\" was not injected: check your FXML file 'administrador.fxml'.";
        assert btnBloqEmpleado != null : "fx:id=\"btnBloqEmpleado\" was not injected: check your FXML file 'administrador.fxml'.";
        assert btnBuscInform != null : "fx:id=\"btnBuscInform\" was not injected: check your FXML file 'administrador.fxml'.";
        assert btnRegistroEmple != null : "fx:id=\"btnRegistroEmple\" was not injected: check your FXML file 'administrador.fxml'.";
        assert btnRegresar != null : "fx:id=\"btnRegresar\" was not injected: check your FXML file 'administrador.fxml'.";
        assert columnaNombre != null : "fx:id=\"columnaNombre\" was not injected: check your FXML file 'administrador.fxml'.";
        assert tablaAdm != null : "fx:id=\"tablaAdm\" was not injected: check your FXML file 'administrador.fxml'.";

    }
    
}
