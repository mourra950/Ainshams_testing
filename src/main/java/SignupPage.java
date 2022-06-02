import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class SignupPage {

    public Button BackButton;

    public TextField Email;

    public TextField Name;

    public TextField Password;

    public TextField Phone;

    public Button SignUpButton;

    @FXML
    void BackToMain(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SignupPage.class.getResource("LoginPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) Phone.getScene().getWindow();
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void SignUpPage(ActionEvent event) throws SQLException {
        try {
            if (!Name.getText().isEmpty() && !Password.getText().isEmpty() && !Phone.getText().isEmpty() && !Email.getText().isEmpty()) {
                DBconnector.connect("INSERT INTO `main`.`Users`(`email`,`password`,`phone`,`name`) VALUES ('" + Email.getText() + "','" + Password.getText() + "','" + Phone.getText() + "','" + Name.getText() + "');");
            } else {
                Alertbox.display("Error", "can not be empty");
            }
        } catch (Exception e) {
            Alertbox.display("SQl Error", "the email already exists");
        }
    }

}
