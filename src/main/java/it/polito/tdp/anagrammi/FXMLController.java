package it.polito.tdp.anagrammi;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.anagrammi.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	private Model model; 

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea txtAnagrammiCorretti;

    @FXML
    private TextArea txtAnagrammiErrati;

    @FXML
    private TextField txtParola;

    @FXML
    void doAnagramma(ActionEvent event) {
    	txtAnagrammiCorretti.clear();
    	txtAnagrammiErrati.clear();
    	String parola = txtParola.getText(); 
    	if(parola.contains("0123456789")) {
    		txtAnagrammiErrati.setText("Non è possibile inserire numeri");
    		return;
    	}
    	List<String> listaIntera = model.trovaAnagrammi(parola); 
    	List<String> listaCorretta = model.trovaAnagrammiGiusti(parola); 
    	
    	for(String s: listaIntera) {
    		if(listaCorretta.contains(s)) {
    			txtAnagrammiCorretti.appendText(s+"\n");
    		}else {
    			txtAnagrammiErrati.appendText(s+"\n");
    		}
    	}
    	return; 

    }

    @FXML
    void doReset(ActionEvent event) {
    	txtParola.clear();
    	txtAnagrammiCorretti.clear();
    	txtAnagrammiErrati.clear();
    	

    }

    @FXML
    void initialize() {
        assert txtAnagrammiCorretti != null : "fx:id=\"txtAnagrammiCorretti\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtAnagrammiErrati != null : "fx:id=\"txtAnagrammiErrati\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        model = new Model();

    }

}
