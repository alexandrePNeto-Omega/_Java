package gui;

import java.awt.Container;
import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ViewController implements Initializable{
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Constraints.setTextFieldInteger(passField);
		Constraints.setTextFieldMaxLength(usTxtField, 3);
	}	//	init	
	
	@FXML
	private TextField usTxtField;
	
	@FXML PasswordField passField;
	
	@FXML
	private Button btn;
	
	public void btnAction() {
		int n1 = Integer.parseInt(usTxtField.getText().toString());
		int n2 = Integer.parseInt(passField.getText().toString());
		System.out.println(n1 + n2);
	}
}
