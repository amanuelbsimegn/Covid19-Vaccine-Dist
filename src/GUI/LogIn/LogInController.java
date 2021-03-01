package GUI.LogIn;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LogInController {
	@FXML private TextField userNameText, passwordText;

	@FXML
	public void handleLogIn(ActionEvent actionEvent) {
		String userName = userNameText.getText();
		String password = passwordText.getText();



//		System.out.println(result);
	}
}
