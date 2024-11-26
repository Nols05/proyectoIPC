package main.java.conecta4.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Alert;
import main.java.conecta4.services.AuthenticationService;

public class LoginController {
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;

    private AuthenticationService authService = new AuthenticationService();

    @FXML
    public void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (authService.authenticate(username, password)) {
            // Navegar al juego
            System.out.println("Login successful");
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Credenciales incorrectas");
            alert.show();
        }
    }
}
