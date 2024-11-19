package co.edu.uniquindio.poo.controladoresView;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class SingInViewControler {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnCrearUsua"
    private Button btnCrearUsua; // Value injected by FXMLLoader

    @FXML // fx:id="comboxRol"
    private ComboBox<?> comboxRol; // Value injected by FXMLLoader

    @FXML // fx:id="txtConfirmContraseña"
    private TextField txtConfirmContraseña; // Value injected by FXMLLoader

    @FXML // fx:id="txtConfirmResp"
    private TextField txtConfirmResp; // Value injected by FXMLLoader

    @FXML // fx:id="txtContraseña"
    private TextField txtContraseña; // Value injected by FXMLLoader

    @FXML // fx:id="txtCorreo"
    private TextField txtCorreo; // Value injected by FXMLLoader

    @FXML // fx:id="txtNomUsua"
    private TextField txtNomUsua; // Value injected by FXMLLoader

    @FXML // fx:id="txtPregSeg"
    private TextField txtPregSeg; // Value injected by FXMLLoader

    @FXML // fx:id="txtRespuesta"
    private TextField txtRespuesta; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnCrearUsua != null : "fx:id=\"btnCrearUsua\" was not injected: check your FXML file 'singin.fxml'.";
        assert comboxRol != null : "fx:id=\"comboxRol\" was not injected: check your FXML file 'singin.fxml'.";
        assert txtConfirmContraseña != null : "fx:id=\"txtConfirmContraseña\" was not injected: check your FXML file 'singin.fxml'.";
        assert txtConfirmResp != null : "fx:id=\"txtConfirmResp\" was not injected: check your FXML file 'singin.fxml'.";
        assert txtContraseña != null : "fx:id=\"txtContraseña\" was not injected: check your FXML file 'singin.fxml'.";
        assert txtCorreo != null : "fx:id=\"txtCorreo\" was not injected: check your FXML file 'singin.fxml'.";
        assert txtNomUsua != null : "fx:id=\"txtNomUsua\" was not injected: check your FXML file 'singin.fxml'.";
        assert txtPregSeg != null : "fx:id=\"txtPregSeg\" was not injected: check your FXML file 'singin.fxml'.";
        assert txtRespuesta != null : "fx:id=\"txtRespuesta\" was not injected: check your FXML file 'singin.fxml'.";

    }

}
