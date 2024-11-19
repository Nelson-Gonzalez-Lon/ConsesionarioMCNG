package co.edu.uniquindio.poo.controladoresView;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RecuperacionIIViewControler {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnContinuar"
    private Button btnContinuar; // Value injected by FXMLLoader

    @FXML // fx:id="btnRegresar"
    private Button btnRegresar; // Value injected by FXMLLoader

    @FXML // fx:id="txtRespuesta"
    private TextField txtRespuesta; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnContinuar != null : "fx:id=\"btnContinuar\" was not injected: check your FXML file 'recuperacion2.fxml'.";
        assert btnRegresar != null : "fx:id=\"btnRegresar\" was not injected: check your FXML file 'recuperacion2.fxml'.";
        assert txtRespuesta != null : "fx:id=\"txtRespuesta\" was not injected: check your FXML file 'recuperacion2.fxml'.";

    }

}
