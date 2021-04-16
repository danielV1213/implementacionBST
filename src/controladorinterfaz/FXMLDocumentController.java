/*
 * Controlador de archivo FXML: clase utilizada para referenciar los distintos elementos gráficos de la interfaz creada en
 JavaFX Scene Builder e implementar métodos que generen distintas funciones para el programa.
 * @author1 santiago.giraldo_car@uao.edu.co Santiago Giraldo 2170265
 * @author2 juan_jose.jimenez@uao.edu.co Juan Jiménez 2195626
 * @author3 juan_seb.orejuela@uao.edu.co Sebastián Orejuela 2195416
 * @author4 daniel_andres.velez@uao.edu.co Daniel Vélez 2195145
 * @date 16 abril 2021
 * @version 1.0

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

    /**
     * insertarEmpleados.
     *
     * @param event. // Este método se encarga insertar un objeto de tipo
     * empleado en la interfaz grafica con sus respectivos atributos tales como
     * el id del Empleado, Nombre del Empleado, Puesto del Empleado y Despacho
     * del Empleado.
     * @return No cuenta con un retorno.
     */
    @FXML
    private void insertarEmpleados(ActionEvent event) {

        int id = Integer.parseInt(txtID.getText());

        String nombre = txtNombre.getText();

        String puesto = txtPuesto.getText();

        String despacho = txtDesp.getText();

//        bstE.insertar(new Empleado(id, nombre, puesto, despacho));
        bstE.insertar(new Empleado(id, nombre, puesto, despacho));
    }

    /**
     * mostrarEmpleados.
     *
     * @param event. // Este método se encarga limpiar los diferentes txt de la
     * interfaz.
     * @return No cuenta con un retorno.
     */
    @FXML
    private void mostrarEmpleados(ActionEvent event) {
        txtNombre.clear();
        txtPuesto.clear();
        txtDesp.clear();
        txtID.clear();

    }

    /**
     * existenEmpleados.
     *
     * @param event. // Este método se encarga verificar su un objeto de tipo
     * Empleado existe en el arbol mediante su id.
     * @return No cuenta con un retorno.
     */
    @FXML
    private void existenEmpleados(ActionEvent event) {
        int id;
        String nombre;
        boolean existe;
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado que desea verificar si se encuentra en el árbol");
        id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del empleado que desea verificar si se encuentra en el árbol"));
        existe = bstE.existe(id);
        if (existe == true) {
            JOptionPane.showMessageDialog(null, "Su empleado se encuentra en el árbol");
        } else {
            JOptionPane.showMessageDialog(null, "Su empleado no se encuentra en el árbol");
        }

    }

    /**
     * estaVacio.
     *
     * @param event. // Este método se encarga verificar si el arbol está o no
     * vacío.
     * @return No cuenta con un retorno.
     */
    @FXML
    private void estaVacio(ActionEvent event) {
        boolean vacio = bstE.esVacio();
        if (vacio == true) {
            JOptionPane.showMessageDialog(null, "El árbol está vacío");
        } else {
            JOptionPane.showMessageDialog(null, "El arbol no está vacío");
        }

    }

    /**
     * obtenerEmpleados.
     *
     * @param event. // Este método se encarga obtener un objeto de tipo
     * empleado, mediante su id, del arbol binario y mostrarlo en pantalla
     * @return No cuenta con un retorno.
     */
    @FXML
    private void obtenerEmpleados(ActionEvent event) {
        int id;
        id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del empleado que desea obtener"));
        boolean existe = bstE.existe(id);
        if (existe == true) {
            Empleado emple = bstE.obtener(id);
            JOptionPane.showMessageDialog(null, "El empleado que corresponde al ID introducido es " + emple.toString());
        } else {
            JOptionPane.showMessageDialog(null, "Su empleado no se encuentra en el árbol");
        }

    }

    /**
     * esHoja.
     *
     * @param event. // Este método se encarga llamar al metodo esHoja de la
     * libreria BST para verificar si un objeto es hoja o no.
     */
    @FXML
    private void esHoja(ActionEvent event) {
        boolean hoja = bstE.esHoja();
        if (hoja == true) {
            JOptionPane.showMessageDialog(null, "Sí es una hoja");
        } else {
            JOptionPane.showMessageDialog(null, "No es una hoja");
        }

    }

    /**
     * preOrden.
     *
     * @param event. // Este método se encarga llamar al metodo preOrden de la
     * libreria BST.
     * @return No cuenta con un retorno.
     */
    @FXML
    private void preOrden(ActionEvent event) {
        String pre = "";
        pre = bstE.preOrden();
        JOptionPane.showMessageDialog(null, pre);
//     bstE.preOrden();
//     JOptionPane.showMessageDialog(null, "Revisa la consola pls :D");
    }

    /**
     * inOrden.
     *
     * @param event. // Este método se encarga llamar al metodo inOrden de la
     * libreria BST.
     * @return No cuenta con un retorno.
     */
    @FXML
    private void inOrden(ActionEvent event) {
        String in = "";
        in = bstE.inOrden();
        JOptionPane.showMessageDialog(null, in);

    }

    /**
     * postOrden.
     *
     * @param event. // Este método se encarga llamar al metodo postOrden de la
     * libreria BST.
     * @return No cuenta con un retorno.
     */
    @FXML
    private void postOrden(ActionEvent event) {
        String post = "";
        post = bstE.postOrden();
        JOptionPane.showMessageDialog(null, post);

    }

    /**
     * eliminarEmpleados.
     *
     * @param event. // Este método se encarga llamar al metodo eliminar de la
     * libreria BST.
     * @return No cuenta con un retorno.
     */
    @FXML
    private void eliminarEmpleados(ActionEvent event) {
        int id;
        id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del empleado que desea eliminar"));
        bstE.eliminar(id);
        JOptionPane.showMessageDialog(null, "El empleado se ha eliminado");

    }

    /**
     * Initialize.
     *
     * @param url, rb. // Este método se encarga de inicializar todos los
     * atributos pertenecientes al proyecto JavaFX.
     * @return No cuenta con un retorno.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//      bstE = new BST();
        bstE = new BST();
    }

}
