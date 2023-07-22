package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ViewController {

	@FXML
	private TextField usTxtField;
	
	@FXML PasswordField passField;
	
	@FXML
	private Button btn;
	
	public void btnAction() {
		System.out.println("Usário: " + usTxtField.getText().toString());
		System.out.println("Senha: " + passField.getText().toString());
		System.out.println("Teste.");
	}
	
}
