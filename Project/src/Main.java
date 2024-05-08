import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {

    
    WebView webView = new WebView();

    webView.getEngine().load("http://www.youtube.com/embed/qfj4TnckoCQ?autoplay=1");
    VBox vbox = new VBox(webView);
    Scene scene = new Scene(vbox, 960, 600);

    primaryStage.setScene(scene);
    primaryStage.show();
}
}