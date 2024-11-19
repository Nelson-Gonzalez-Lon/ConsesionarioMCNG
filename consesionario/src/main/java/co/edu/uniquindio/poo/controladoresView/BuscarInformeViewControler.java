package co.edu.uniquindio.poo.controladoresView;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class BuscarInformeViewControler {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="TablaInforme"
    private TableView<?> TablaInforme; // Value injected by FXMLLoader

    @FXML // fx:id="btnImprimir"
    private Button btnImprimir; // Value injected by FXMLLoader

    @FXML // fx:id="columnaCodigo"
    private TableColumn<?, ?> columnaCodigo; // Value injected by FXMLLoader

    @FXML // fx:id="columnaFecha"
    private TableColumn<?, ?> columnaFecha; // Value injected by FXMLLoader

    @FXML // fx:id="txtCodigoinf"
    private TextField txtCodigoinf; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert TablaInforme != null : "fx:id=\"TablaInforme\" was not injected: check your FXML file 'buscarInforme.fxml'.";
        assert btnImprimir != null : "fx:id=\"btnImprimir\" was not injected: check your FXML file 'buscarInforme.fxml'.";
        assert columnaCodigo != null : "fx:id=\"columnaCodigo\" was not injected: check your FXML file 'buscarInforme.fxml'.";
        assert columnaFecha != null : "fx:id=\"columnaFecha\" was not injected: check your FXML file 'buscarInforme.fxml'.";
        assert txtCodigoinf != null : "fx:id=\"txtCodigoinf\" was not injected: check your FXML file 'buscarInforme.fxml'.";

    }

}