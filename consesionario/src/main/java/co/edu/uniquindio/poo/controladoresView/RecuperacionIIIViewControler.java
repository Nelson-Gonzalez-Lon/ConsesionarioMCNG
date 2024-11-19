package co.edu.uniquindio.poo.controladoresView;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RecuperacionIIIViewControler {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnGuardar"
    private Button btnGuardar; // Value injected by FXMLLoader

    @FXML // fx:id="txtConfirmContra"
    private TextField txtConfirmContra; // Value injected by FXMLLoader

    @FXML // fx:id="txtNuevContra"
    private TextField txtNuevContra; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnGuardar != null : "fx:id=\"btnGuardar\" was not injected: check your FXML file 'recuperacion3.fxml'.";
        assert txtConfirmContra != null : "fx:id=\"txtConfirmContra\" was not injected: check your FXML file 'recuperacion3.fxml'.";
        assert txtNuevContra != null : "fx:id=\"txtNuevContra\" was not injected: check your FXML file 'recuperacion3.fxml'.";

    }

}
