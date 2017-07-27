/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compugrafica1;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author andres_david.londono
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField text1;
    @FXML
    private TextField text2;
    
    LinkedList<Estudiante> listaE;
    
    
    @FXML
    private void iniciar(ActionEvent event) {
        String Nombre = text1.getText();
        String Codigo = text2.getText();
        
        
     Estudiante objE= new Estudiante(Nombre, Codigo);
       boolean guardar=listaE.add(objE);
       
       if(guardar){
           text1.setText("");
           text2.setText("");
       }    
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listaE=new LinkedList<>();
    }    
    
}
