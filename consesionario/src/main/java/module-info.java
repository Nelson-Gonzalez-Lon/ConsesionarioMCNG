module co.edu.uniquindio.poo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires javafx.graphics;
    requires java.desktop;
    
    exports co.edu.uniquindio.poo;
    opens co.edu.uniquindio.poo.model to javafx.base;
    opens co.edu.uniquindio.poo.controladoresView to javafx.fxml;
}
