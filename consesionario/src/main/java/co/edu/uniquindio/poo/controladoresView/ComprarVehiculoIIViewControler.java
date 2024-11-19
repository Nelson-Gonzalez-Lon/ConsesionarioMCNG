package co.edu.uniquindio.poo.controladoresView;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class ComprarVehiculoIIViewControler {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="DatePickFechaCompra"
    private DatePicker DatePickFechaCompra; // Value injected by FXMLLoader

    @FXML // fx:id="btnGuardar"
    private Button btnGuardar; // Value injected by FXMLLoader

    @FXML // fx:id="btnRegresar"
    private Button btnRegresar; // Value injected by FXMLLoader

    @FXML // fx:id="txtIDClienteVend"
    private TextField txtIDClienteVend; // Value injected by FXMLLoader

    @FXML // fx:id="txtValorCompra"
    private TextField txtValorCompra; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert DatePickFechaCompra != null : "fx:id=\"DatePickFechaCompra\" was not injected: check your FXML file 'comprarVehiculo2.fxml'.";
        assert btnGuardar != null : "fx:id=\"btnGuardar\" was not injected: check your FXML file 'comprarVehiculo2.fxml'.";
        assert btnRegresar != null : "fx:id=\"btnRegresar\" was not injected: check your FXML file 'comprarVehiculo2.fxml'.";
        assert txtIDClienteVend != null : "fx:id=\"txtIDClienteVend\" was not injected: check your FXML file 'comprarVehiculo2.fxml'.";
        assert txtValorCompra != null : "fx:id=\"txtValorCompra\" was not injected: check your FXML file 'comprarVehiculo2.fxml'.";

    }

}