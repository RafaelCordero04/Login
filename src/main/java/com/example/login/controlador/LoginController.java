package com.example.login.controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField txtUsuario;

    @FXML
    private PasswordField txtPassword; // Cambiar a TextField si mantuviste la etiqueta original

    @FXML
    private Label lblMensaje;

    @FXML
    private Button btnIniciarSesion;

    @FXML
    public void iniciarSesion(ActionEvent event) {
        String usuario = txtUsuario.getText();
        String password = txtPassword.getText();

        if (usuario.isEmpty() || password.isEmpty()) {
            lblMensaje.setText("Por favor, ingrese sus credenciales.");
            lblMensaje.setStyle("-fx-text-fill: #ff5252;"); // Color rojo para error
        } else {
            lblMensaje.setText("Autenticando...");
            lblMensaje.setStyle("-fx-text-fill: #00b368;"); // Color verde

            // Aquí integrarás la lógica de autenticación HTTP que enviaste en la tarea de base de datos
        }
    }
}