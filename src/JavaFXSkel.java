

/**
 * Created by Roman on 07.05.2018.
 */
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;

public class JavaFXSkel extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void init(){
        System.out.println("initialization...");
    }

    public void start(Stage myStage){
        System.out.println("Starting...");
        myStage.setTitle("Karkas of app");
        FlowPane rootNode = new FlowPane();
        Scene myScene = new Scene(rootNode, 300,200);
        myStage.setScene(myScene);
        myStage.show();
    }

    public void stop(){
        System.out.println("Stopping...");
    }
}
