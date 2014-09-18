package fxml.fa.controls.test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.net.URL;

/**
 * Created by nrf on 18/09/2014.
 */
public class App extends Application {
    static {
        Font.loadFont(App.class.getResource("/font/fontawesome-webfont.ttf").toExternalForm(), 10);
    }

    @Override
    public void start(final Stage primaryStage) throws Exception {
        URL resource = getClass().getResource("/fxml/app.fxml");
        primaryStage.setScene(new Scene(FXMLLoader.load(resource), 500, 500));
        primaryStage.setTitle("FontAwesomeFX demo");
        primaryStage.show();
    }

    public static void main(String... args){
        launch(args);
    }
}