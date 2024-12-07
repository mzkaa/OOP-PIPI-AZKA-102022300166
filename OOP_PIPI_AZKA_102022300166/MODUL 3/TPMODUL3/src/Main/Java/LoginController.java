package Main.Java;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private TextField usernameField;

    @FXML
    private TextField passwordField;

    @FXML
    public void login(ActionEvent event) throws Exception {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if ("admin".equals(username) && "1234".equals(password)) {
            App.changeScene("inventory.fxml");
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Username atau password salah!");
            alert.show();
        }
    }
}
