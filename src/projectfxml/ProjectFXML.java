package projectfxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ProjectFXML extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        //Parent root2 = FXMLLoader.load(getClass().getResource("LoginController"));
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);        
    }
    
    public static String getFileName(){        
        return "vehicles.csv";
    }
    public static String getAdminFileName(){ 
    return "Admin.csv";}
}