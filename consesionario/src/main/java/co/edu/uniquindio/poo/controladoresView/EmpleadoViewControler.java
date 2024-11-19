package co.edu.uniquindio.poo.controladoresView;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class EmpleadoViewControler {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="ColumnaEstado"
    private TableColumn<?, ?> ColumnaEstado; // Value injected by FXMLLoader

    @FXML // fx:id="ColumnaMarca"
    private TableColumn<?, ?> ColumnaMarca; // Value injected by FXMLLoader

    @FXML // fx:id="ColumnaTipo"
    private TableColumn<?, ?> ColumnaTipo; // Value injected by FXMLLoader

    @FXML // fx:id="btnAlquilarVehic"
    private Button btnAlquilarVehic; // Value injected by FXMLLoader

    @FXML // fx:id="btnComprarVehic"
    private Button btnComprarVehic; // Value injected by FXMLLoader

    @FXML // fx:id="btnRegistroClien"
    private Button btnRegistroClien; // Value injected by FXMLLoader

    @FXML // fx:id="btnRegistroVehic"
    private Button btnRegistroVehic; // Value injected by FXMLLoader

    @FXML // fx:id="btnRegresar"
    private Button btnRegresar; // Value injected by FXMLLoader

    @FXML // fx:id="btnVenderVehic"
    private Button btnVenderVehic; // Value injected by FXMLLoader

    @FXML // fx:id="columnaCodigo"
    private TableColumn<?, ?> columnaCodigo; // Value injected by FXMLLoader

    @FXML // fx:id="tablaEmpleado"
    private TableView<?> tablaEmpleado; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert ColumnaEstado != null : "fx:id=\"ColumnaEstado\" was not injected: check your FXML file 'empleado.fxml'.";
        assert ColumnaMarca != null : "fx:id=\"ColumnaMarca\" was not injected: check your FXML file 'empleado.fxml'.";
        assert ColumnaTipo != null : "fx:id=\"ColumnaTipo\" was not injected: check your FXML file 'empleado.fxml'.";
        assert btnAlquilarVehic != null : "fx:id=\"btnAlquilarVehic\" was not injected: check your FXML file 'empleado.fxml'.";
        assert btnComprarVehic != null : "fx:id=\"btnComprarVehic\" was not injected: check your FXML file 'empleado.fxml'.";
        assert btnRegistroClien != null : "fx:id=\"btnRegistroClien\" was not injected: check your FXML file 'empleado.fxml'.";
        assert btnRegistroVehic != null : "fx:id=\"btnRegistroVehic\" was not injected: check your FXML file 'empleado.fxml'.";
        assert btnRegresar != null : "fx:id=\"btnRegresar\" was not injected: check your FXML file 'empleado.fxml'.";
        assert btnVenderVehic != null : "fx:id=\"btnVenderVehic\" was not injected: check your FXML file 'empleado.fxml'.";
        assert columnaCodigo != null : "fx:id=\"columnaCodigo\" was not injected: check your FXML file 'empleado.fxml'.";
        assert tablaEmpleado != null : "fx:id=\"tablaEmpleado\" was not injected: check your FXML file 'empleado.fxml'.";

    }

}
