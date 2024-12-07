package Main.Java;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    private static Stage primaryStage;

    @Override
    public void start(Stage stage) throws Exception {
        primaryStage = stage;
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("login.fxml"))));
        primaryStage.setTitle("Zeppeli's Listening Bar");
        primaryStage.show();
    }

    public static void changeScene(String fxml) throws Exception {
        primaryStage.setScene(new Scene(FXMLLoader.load(App.class.getResource(fxml))));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
