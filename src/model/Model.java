/**
 * Practica 4 Algoritmos Avanzados - Ing Informática UIB
 *
 * @date 12/05/2023
 * @author jfher, JordiSM, peremarc, MarcoMG
 * @url 
 */
package model;

import view.View;
import controller.Controller;

/**
 * Modelo de la aplicación, aquí se guardan todos los datos necesarios para su
 * correcta operación.
 */
public class Model {

    // PUNTEROS DEL PATRÓN MVC
    private View vista;
    private Controller controlador;
    
    // CONSTRUCTORS
    public Model() {
    }

    public Model(View vista, Controller controlador) {
        this.vista = vista;
        this.controlador = controlador;
    }

    // CLASS METHODS
    

    // GETTERS & SETTERS
    public View getVista() {
        return vista;
    }

    public void setVista(View vista) {
        this.vista = vista;
    }

    public Controller getControlador() {
        return controlador;
    }

    public void setControlador(Controller controlador) {
        this.controlador = controlador;
    }

}
