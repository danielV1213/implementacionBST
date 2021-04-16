/*
  * Clase "ImplementacionBST": clase main de la aplicación FX. También se utiliza para establecer algunas configuraciones 
    iniciales pertenecientes a la interfaz del Scene Builder.
    del Empleado.
 * @author1 santiago.giraldo_car@uao.edu.co Santiago Giraldo 2170265
 * @author2 juan_jose.jimenez@uao.edu.co Juan Jiménez 2195626
 * @author3 juan_seb.orejuela@uao.edu.co Sebastián Orejuela 2195416
 * @author4 daniel_andres.velez@uao.edu.co Daniel Vélez 2195145
 * @date 16 abril 2021
 * @version 1.0
 */
package vista;

import controladorinterfaz.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ImplementacionBST extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
        stage.setTitle("Árbol de Búsqueda Binaria");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
