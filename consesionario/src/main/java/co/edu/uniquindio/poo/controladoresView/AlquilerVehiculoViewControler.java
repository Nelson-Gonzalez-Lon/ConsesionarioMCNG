package co.edu.uniquindio.poo.controladoresView;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class AlquilerVehiculoViewControler{

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="DatePckFechaFin"
    private DatePicker DatePckFechaFin; // Value injected by FXMLLoader

    @FXML // fx:id="DatePickFechaIni"
    private DatePicker DatePickFechaIni; // Value injected by FXMLLoader

    @FXML // fx:id="btnGuardar"
    private Button btnGuardar; // Value injected by FXMLLoader

    @FXML // fx:id="btnRegresar"
    private Button btnRegresar; // Value injected by FXMLLoader

    @FXML // fx:id="txtCodVehicAlq"
    private TextField txtCodVehicAlq; // Value injected by FXMLLoader

    @FXML // fx:id="txtID"
    private TextField txtID; // Value injected by FXMLLoader

    @FXML // fx:id="txtTarifaDiaria"
    private TextField txtTarifaDiaria; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert DatePckFechaFin != null : "fx:id=\"DatePckFechaFin\" was not injected: check your FXML file 'alquilerVehiculo.fxml'.";
        assert DatePickFechaIni != null : "fx:id=\"DatePickFechaIni\" was not injected: check your FXML file 'alquilerVehiculo.fxml'.";
        assert btnGuardar != null : "fx:id=\"btnGuardar\" was not injected: check your FXML file 'alquilerVehiculo.fxml'.";
        assert btnRegresar != null : "fx:id=\"btnRegresar\" was not injected: check your FXML file 'alquilerVehiculo.fxml'.";
        assert txtCodVehicAlq != null : "fx:id=\"txtCodVehicAlq\" was not injected: check your FXML file 'alquilerVehiculo.fxml'.";
        assert txtID != null : "fx:id=\"txtID\" was not injected: check your FXML file 'alquilerVehiculo.fxml'.";
        assert txtTarifaDiaria != null : "fx:id=\"txtTarifaDiaria\" was not injected: check your FXML file 'alquilerVehiculo.fxml'.";

    }

}
