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
        txtNombre.clear();
        txtPuesto.clear();
        txtDesp.clear();
        txtID.clear();

    }

    @FXML
    private void existenEmpleados(ActionEvent event) {
        int id;
        String nombre;
        boolean existe;
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado que desea verificar si se encuentra en el árbol");
        id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del empleado que desea verificar si se encuentra en el árbol"));
        existe = bstE.existe(id);
        if(existe == true){
            JOptionPane.showMessageDialog(null, "Su empleado se encuentra en el árbol");
        }else{
            JOptionPane.showMessageDialog(null, "Su empleado no se encuentra en el árbol");
        }
        
    }

    @FXML
    private void estaVacio(ActionEvent event) {
        boolean vacio = bstE.esVacio();
        if(vacio == true){
            JOptionPane.showMessageDialog(null, "El árbol está vacío");
        }else{
            JOptionPane.showMessageDialog(null, "El arbol no está vacío");
        }

    }

    @FXML
    private void obtenerEmpleados(ActionEvent event) {
        int id;
        id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del empleado que desea obtener"));        
        boolean existe = bstE.existe(id);
        if(existe == true){
            Empleado emple = bstE.obtener(id);
            JOptionPane.showMessageDialog(null, "El empleado que corresponde al ID introducido es " + emple.toString());
        }else{
            JOptionPane.showMessageDialog(null, "Su empleado no se encuentra en el árbol");
        }
        

    }

    @FXML
    private void esHoja(ActionEvent event) {
        boolean hoja = bstE.esHoja();
        if(hoja == true){
            JOptionPane.showMessageDialog(null, "Sí es una hoja");
        }else{
            JOptionPane.showMessageDialog(null, "No es una hoja");
        }

    }

    @FXML
    private void preOrden(ActionEvent event) {
     bstE.preOrden();
     JOptionPane.showMessageDialog(null, "Revisa la consola pls :D");
    }

    @FXML
    private void inOrden(ActionEvent event) {
     bstE.inOrden();
     JOptionPane.showMessageDialog(null, "Revisa la consola pls :D");

    }

    @FXML
    private void postOrden(ActionEvent event) {
     bstE.postOrden();
     JOptionPane.showMessageDialog(null, "Revisa la consola pls :D");

    }

    @FXML
    private void eliminarEmpleados(ActionEvent event) {
        int id;
        id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del empleado que desea eliminar"));
        bstE.eliminar(id);
        JOptionPane.showMessageDialog(null, "El empleado se ha eliminado");

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
//      bstE = new BST();
        bstE = new BST();
    }

}
