package co.edu.uniquindio.poo.controladoresView;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class VenderVehiculoViewControler {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="DatePickFechaVenta"
    private DatePicker DatePickFechaVenta; // Value injected by FXMLLoader

    @FXML // fx:id="btnGuardar"
    private Button btnGuardar; // Value injected by FXMLLoader

    @FXML // fx:id="btnRegresar"
    private Button btnRegresar; // Value injected by FXMLLoader

    @FXML // fx:id="txtCodVehiVendido"
    private TextField txtCodVehiVendido; // Value injected by FXMLLoader

    @FXML // fx:id="txtIDClienteCompra"
    private TextField txtIDClienteCompra; // Value injected by FXMLLoader

    @FXML // fx:id="txtValorVenta"
    private TextField txtValorVenta; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert DatePickFechaVenta != null : "fx:id=\"DatePickFechaVenta\" was not injected: check your FXML file 'venderVehiculo.fxml'.";
        assert btnGuardar != null : "fx:id=\"btnGuardar\" was not injected: check your FXML file 'venderVehiculo.fxml'.";
        assert btnRegresar != null : "fx:id=\"btnRegresar\" was not injected: check your FXML file 'venderVehiculo.fxml'.";
        assert txtCodVehiVendido != null : "fx:id=\"txtCodVehiVendido\" was not injected: check your FXML file 'venderVehiculo.fxml'.";
        assert txtIDClienteCompra != null : "fx:id=\"txtIDClienteCompra\" was not injected: check your FXML file 'venderVehiculo.fxml'.";
        assert txtValorVenta != null : "fx:id=\"txtValorVenta\" was not injected: check your FXML file 'venderVehiculo.fxml'.";

    }

}
