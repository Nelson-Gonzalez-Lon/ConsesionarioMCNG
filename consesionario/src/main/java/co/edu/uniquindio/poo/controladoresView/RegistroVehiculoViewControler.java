package co.edu.uniquindio.poo.controladoresView;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class RegistroVehiculoViewControler {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnGuardar"
    private Button btnGuardar; // Value injected by FXMLLoader

    @FXML // fx:id="btnRegresar"
    private Button btnRegresar; // Value injected by FXMLLoader

    @FXML // fx:id="combox4x4"
    private ComboBox<?> combox4x4; // Value injected by FXMLLoader

    @FXML // fx:id="comboxABS"
    private ComboBox<?> comboxABS; // Value injected by FXMLLoader

    @FXML // fx:id="comboxAireAcondi"
    private ComboBox<?> comboxAireAcondi; // Value injected by FXMLLoader

    @FXML // fx:id="comboxAsisPermcarr"
    private ComboBox<?> comboxAsisPermcarr; // Value injected by FXMLLoader

    @FXML // fx:id="comboxBolsaAire"
    private ComboBox<?> comboxBolsaAire; // Value injected by FXMLLoader

    @FXML // fx:id="comboxCamColi"
    private ComboBox<?> comboxCamColi; // Value injected by FXMLLoader

    @FXML // fx:id="comboxCamReversa"
    private ComboBox<?> comboxCamReversa; // Value injected by FXMLLoader

    @FXML // fx:id="comboxCombust"
    private ComboBox<?> comboxCombust; // Value injected by FXMLLoader

    @FXML // fx:id="comboxEnchufable"
    private ComboBox<?> comboxEnchufable; // Value injected by FXMLLoader

    @FXML // fx:id="comboxEstado"
    private ComboBox<?> comboxEstado; // Value injected by FXMLLoader

    @FXML // fx:id="comboxLigero"
    private ComboBox<?> comboxLigero; // Value injected by FXMLLoader

    @FXML // fx:id="comboxSenTrafic"
    private ComboBox<?> comboxSenTrafic; // Value injected by FXMLLoader

    @FXML // fx:id="comboxTipo"
    private ComboBox<?> comboxTipo; // Value injected by FXMLLoader

    @FXML // fx:id="textAcel0a100"
    private TextField textAcel0a100; // Value injected by FXMLLoader

    @FXML // fx:id="txtAutonomia"
    private TextField txtAutonomia; // Value injected by FXMLLoader

    @FXML // fx:id="txtCaballosFuerza"
    private TextField txtCaballosFuerza; // Value injected by FXMLLoader

    @FXML // fx:id="txtCambios"
    private TextField txtCambios; // Value injected by FXMLLoader

    @FXML // fx:id="txtCapCarga"
    private TextField txtCapCarga; // Value injected by FXMLLoader

    @FXML // fx:id="txtCapMalet"
    private TextField txtCapMalet; // Value injected by FXMLLoader

    @FXML // fx:id="txtCodigo"
    private TextField txtCodigo; // Value injected by FXMLLoader

    @FXML // fx:id="txtMarca"
    private TextField txtMarca; // Value injected by FXMLLoader

    @FXML // fx:id="txtModelo"
    private TextField txtModelo; // Value injected by FXMLLoader

    @FXML // fx:id="txtNBolsasAire"
    private TextField txtNBolsasAire; // Value injected by FXMLLoader

    @FXML // fx:id="txtNPuertas"
    private TextField txtNPuertas; // Value injected by FXMLLoader

    @FXML // fx:id="txtNSalidasEmerg"
    private TextField txtNSalidasEmerg; // Value injected by FXMLLoader

    @FXML // fx:id="txtNejes"
    private TextField txtNejes; // Value injected by FXMLLoader

    @FXML // fx:id="txtNpasajeros"
    private TextField txtNpasajeros; // Value injected by FXMLLoader

    @FXML // fx:id="txtTiempoCarga"
    private TextField txtTiempoCarga; // Value injected by FXMLLoader

    @FXML // fx:id="txtVelMax"
    private TextField txtVelMax; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnGuardar != null : "fx:id=\"btnGuardar\" was not injected: check your FXML file 'registroVehiculo.fxml'.";
        assert btnRegresar != null : "fx:id=\"btnRegresar\" was not injected: check your FXML file 'registroVehiculo.fxml'.";
        assert combox4x4 != null : "fx:id=\"combox4x4\" was not injected: check your FXML file 'registroVehiculo.fxml'.";
        assert comboxABS != null : "fx:id=\"comboxABS\" was not injected: check your FXML file 'registroVehiculo.fxml'.";
        assert comboxAireAcondi != null : "fx:id=\"comboxAireAcondi\" was not injected: check your FXML file 'registroVehiculo.fxml'.";
        assert comboxAsisPermcarr != null : "fx:id=\"comboxAsisPermcarr\" was not injected: check your FXML file 'registroVehiculo.fxml'.";
        assert comboxBolsaAire != null : "fx:id=\"comboxBolsaAire\" was not injected: check your FXML file 'registroVehiculo.fxml'.";
        assert comboxCamColi != null : "fx:id=\"comboxCamColi\" was not injected: check your FXML file 'registroVehiculo.fxml'.";
        assert comboxCamReversa != null : "fx:id=\"comboxCamReversa\" was not injected: check your FXML file 'registroVehiculo.fxml'.";
        assert comboxCombust != null : "fx:id=\"comboxCombust\" was not injected: check your FXML file 'registroVehiculo.fxml'.";
        assert comboxEnchufable != null : "fx:id=\"comboxEnchufable\" was not injected: check your FXML file 'registroVehiculo.fxml'.";
        assert comboxEstado != null : "fx:id=\"comboxEstado\" was not injected: check your FXML file 'registroVehiculo.fxml'.";
        assert comboxLigero != null : "fx:id=\"comboxLigero\" was not injected: check your FXML file 'registroVehiculo.fxml'.";
        assert comboxSenTrafic != null : "fx:id=\"comboxSenTrafic\" was not injected: check your FXML file 'registroVehiculo.fxml'.";
        assert comboxTipo != null : "fx:id=\"comboxTipo\" was not injected: check your FXML file 'registroVehiculo.fxml'.";
        assert textAcel0a100 != null : "fx:id=\"textAcel0a100\" was not injected: check your FXML file 'registroVehiculo.fxml'.";
        assert txtAutonomia != null : "fx:id=\"txtAutonomia\" was not injected: check your FXML file 'registroVehiculo.fxml'.";
        assert txtCaballosFuerza != null : "fx:id=\"txtCaballosFuerza\" was not injected: check your FXML file 'registroVehiculo.fxml'.";
        assert txtCambios != null : "fx:id=\"txtCambios\" was not injected: check your FXML file 'registroVehiculo.fxml'.";
        assert txtCapCarga != null : "fx:id=\"txtCapCarga\" was not injected: check your FXML file 'registroVehiculo.fxml'.";
        assert txtCapMalet != null : "fx:id=\"txtCapMalet\" was not injected: check your FXML file 'registroVehiculo.fxml'.";
        assert txtCodigo != null : "fx:id=\"txtCodigo\" was not injected: check your FXML file 'registroVehiculo.fxml'.";
        assert txtMarca != null : "fx:id=\"txtMarca\" was not injected: check your FXML file 'registroVehiculo.fxml'.";
        assert txtModelo != null : "fx:id=\"txtModelo\" was not injected: check your FXML file 'registroVehiculo.fxml'.";
        assert txtNBolsasAire != null : "fx:id=\"txtNBolsasAire\" was not injected: check your FXML file 'registroVehiculo.fxml'.";
        assert txtNPuertas != null : "fx:id=\"txtNPuertas\" was not injected: check your FXML file 'registroVehiculo.fxml'.";
        assert txtNSalidasEmerg != null : "fx:id=\"txtNSalidasEmerg\" was not injected: check your FXML file 'registroVehiculo.fxml'.";
        assert txtNejes != null : "fx:id=\"txtNejes\" was not injected: check your FXML file 'registroVehiculo.fxml'.";
        assert txtNpasajeros != null : "fx:id=\"txtNpasajeros\" was not injected: check your FXML file 'registroVehiculo.fxml'.";
        assert txtTiempoCarga != null : "fx:id=\"txtTiempoCarga\" was not injected: check your FXML file 'registroVehiculo.fxml'.";
        assert txtVelMax != null : "fx:id=\"txtVelMax\" was not injected: check your FXML file 'registroVehiculo.fxml'.";

    }

}
