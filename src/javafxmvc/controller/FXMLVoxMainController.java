/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxmvc.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author vinicius caetano
 */
public class FXMLVoxMainController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private  MenuItem  MenuItemCadastrosClientes;
    @FXML
    private  MenuItem  MenuItemProcessoVendas;
    @FXML
    private  MenuItem  MenuItemGraficoVendaMes;
    @FXML
    private  MenuItem  MenuItemRelatorioQtdProdutoEstoque;
    @FXML
    private AnchorPane anchorPane;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
