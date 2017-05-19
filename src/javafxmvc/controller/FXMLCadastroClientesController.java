/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxmvc.controller;

import java.net.URL;
import java.sql.Connection;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxmvc.model.dao.ClienteDAO;
import javafxmvc.model.database.Database;
import javafxmvc.model.database.DatabaseFactory;
import javafxmvc.model.domain.Cliente;

/**
 * FXML Controller class
 *
 * @author vinicius caetano
 */
public class FXMLCadastroClientesController implements Initializable {
    
    
   
            
           
                    
                  
            
                           
                                   
                                    
     @FXML
    private TableView<Cliente> tableViewClientes;

    @FXML
    private TableColumn<Cliente, String> tabelaColunaClienteNome;

    @FXML
    private TableColumn<Cliente, String> tabelaColunaCPF;

    @FXML
    private Button btnInserir;

    @FXML
    private Button btnAlterar;

    @FXML
    private Button btnRemover;

    @FXML
    private Label labelClienteCodigo;

    @FXML
    private Label labelClienteNome;

    @FXML
    private Label labelClienteCPF;

    @FXML
    private Label labelClienteTelefone;

    
    private List <Cliente> listClientes;
    private ObservableList<Cliente> observableListClientes;
    
    //Atritutos para manipulação banco de dados
    
    private final Database database = DatabaseFactory.getDatabase("postgresql");
    private final Connection connection = database.conectar();
    private final ClienteDAO clienteDAO = new ClienteDAO();
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        clienteDAO.setConnection(connection);
       carregarTabelaClientes();
    }  
    
    public  void carregarTabelaClientes(){
        
        tabelaColunaClienteNome.setCellValueFactory(new PropertyValueFactory<>("nome") );
        tabelaColunaCPF.setCellValueFactory(new PropertyValueFactory<>("CPF"));
        
        listClientes = clienteDAO.listar();
        
        observableListClientes = FXCollections.observableArrayList(listClientes);
        tableViewClientes.setItems(observableListClientes);
    }
    
}
