package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import model.entitis.Coisa;

public class ViewController implements Initializable {

	@FXML
	private ComboBox<Coisa> comboBoxCoisa;
	private ObservableList<Coisa> listCoisa;

	@FXML
	private Button buttonCoisa;
	
	@FXML
	public void onClickButton() {
		for(Coisa coisa : comboBoxCoisa.getItems())
			System.out.println(coisa);
	}
	
	@FXML
	public void onSelectCosia() {
		Coisa coisa = comboBoxCoisa.getSelectionModel().getSelectedItem();
		System.out.println(coisa);
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		List<Coisa> coisas = new ArrayList<>();
		coisas.add(new Coisa("Coisa 01", 1));
		coisas.add(new Coisa("Coisa 02", 2));
		coisas.add(new Coisa("Coisa 03", 3));

		listCoisa = FXCollections.observableArrayList(coisas);
		comboBoxCoisa.setItems(listCoisa);

		Callback<ListView<Coisa>, ListCell<Coisa>> factory = lv -> new ListCell<Coisa>() {
			@Override
			protected void updateItem(Coisa item, boolean empty) {
				super.updateItem(item, empty);
				setText(empty ? "" : item.getNome());
			}
		};
		
		comboBoxCoisa.setCellFactory(factory);
		comboBoxCoisa.setButtonCell(factory.call(null));
	}

}
