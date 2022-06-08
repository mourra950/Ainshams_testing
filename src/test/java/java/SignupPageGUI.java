package java;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxAssert;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;
import org.testfx.matcher.control.LabeledMatchers;

import java.io.IOException;
import java.util.Objects;

@ExtendWith(ApplicationExtension.class)
public class SignupPageGUI {

    @Start
    private void start(Stage stage) throws IOException {
        stage.setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("SignupPage.fxml")))));
        stage.show();
    }

    @Test
    void signUpPage(FxRobot robot) throws InterruptedException {
        robot.interact(() -> robot.lookup("#Email").queryAs(TextField.class).setText("test12"));
        Thread.sleep(100);
        robot.interact(() -> robot.lookup("#Phone").queryAs(TextField.class).setText("test12"));
        Thread.sleep(10000);
        robot.interact(() -> robot.lookup("#Name").queryAs(TextField.class).setText("test12"));
        Thread.sleep(100);
        robot.interact(() -> robot.lookup("#Password").queryAs(TextField.class).setText("test12"));
        Thread.sleep(100);
        robot.clickOn("#SignUpButton");


    }
}
