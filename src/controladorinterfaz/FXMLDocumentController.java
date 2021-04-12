/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorinterfaz;

import bst.BST;
import bst.IBST;
import datos.Empleado;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import static javafx.scene.input.KeyCode.T;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField txtID;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtPuesto;
    @FXML
    private TextField txtDesp;

    BST bstE;
//    IBST<Empleado> bstE;

    @FXML
    private void insertarEmpleados(ActionEvent event) {

        int id = Integer.parseInt(txtID.getText());

        String nombre = txtNombre.getText();

        String puesto = txtPuesto.getText();

        String despacho = txtDesp.getText();

//        bstE.insertar(new Empleado(id, nombre, puesto, despacho));
        bstE.insertar(new Empleado(id, nombre, puesto, despacho));
    }

    @FXML
    private void mostrarEmpleados(ActionEvent event) {
        JOptionPane.showMessageDialog(null,bstE.toString());
    }

    @FXML
    private void existenEmpleados(ActionEvent event) {
//       bstE.existe(69);
    }

    @FXML
    private void estaVacio(ActionEvent event) {

    }

    @FXML
    private void obtenerEmpleados(ActionEvent event) {

    }

    @FXML
    private void esHoja(ActionEvent event) {

    }

    @FXML
    private void preOrden(ActionEvent event) {
     bstE.preOrden();
    }

    @FXML
    private void inOrden(ActionEvent event) {

    }

    @FXML
    private void postOrden(ActionEvent event) {

    }

    @FXML
    private void eliminarEmpleados(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
//      bstE = new BST();
        bstE = new BST();
    }

}
