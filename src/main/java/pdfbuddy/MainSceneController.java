package pdfbuddy;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;

public class MainSceneController implements Initializable {

    private double xOffset = 0;
    private double yOffset = 0;
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
    @FXML
    public void createPDFsFromImagesClicked(ActionEvent event) throws IOException {
        Parent temp = FXMLLoader.load(getClass().getResource("/fxml/CreatePDFsFromImagesScene.fxml"));

        Scene scene = new Scene(temp);
        Stage primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow = new Stage();
        newWindow.setTitle("Cut Pages From PDF");
        newWindow.setScene(scene);

        // Specifies the modality for new window.
        newWindow.initModality(Modality.WINDOW_MODAL);
        newWindow.initStyle(StageStyle.UNDECORATED);
        // Specifies the owner Window (parent) for new window
        newWindow.initOwner(primaryStage);

        // Set position of second window, related to primary window.
        //newWindow.setX(primaryStage.getX() + 200);
        //newWindow.setY(primaryStage.getY() + 100);

        newWindow.show();
    }
    @FXML
    public void extractImagesFromPDFClicked(ActionEvent event) throws IOException {
        Parent temp = FXMLLoader.load(getClass().getResource("/fxml/ExtractImagesFromPDFScene.fxml"));

        Scene scene = new Scene(temp);
        Stage primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow = new Stage();
        newWindow.setTitle("Extract Images From PDF");
        newWindow.setScene(scene);

        // Specifies the modality for new window.
        newWindow.initModality(Modality.WINDOW_MODAL);
        newWindow.initStyle(StageStyle.UNDECORATED);
        // Specifies the owner Window (parent) for new window
        newWindow.initOwner(primaryStage);

        // Set position of second window, related to primary window.
        //newWindow.setX(primaryStage.getX() + 200);
        //newWindow.setY(primaryStage.getY() + 100);

        newWindow.show();
    }
    @FXML
    public void extractPagesFromPDFClicked(ActionEvent event) throws IOException {
        Parent temp = FXMLLoader.load(getClass().getResource("/fxml/ExtractPagesFromPDFScene.fxml"));

        Scene scene = new Scene(temp);
        Stage primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow = new Stage();
        newWindow.setTitle("Extract Pages From PDF");
        newWindow.setScene(scene);

        // Specifies the modality for new window.
        newWindow.initModality(Modality.WINDOW_MODAL);
        newWindow.initStyle(StageStyle.UNDECORATED);
        // Specifies the owner Window (parent) for new window
        newWindow.initOwner(primaryStage);

        // Set position of second window, related to primary window.
        //newWindow.setX(primaryStage.getX() + 200);
        //newWindow.setY(primaryStage.getY() + 100);

        newWindow.show();
    }
    @FXML
    public void removePagesFromPDFClicked(ActionEvent event) throws IOException {
        Parent temp = FXMLLoader.load(getClass().getResource("/fxml/RemovePagesFromPDFScene.fxml"));

        Scene scene = new Scene(temp);
        Stage primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow = new Stage();
        newWindow.setTitle("Cut Pages From PDF");
        newWindow.setScene(scene);

        // Specifies the modality for new window.
        newWindow.initModality(Modality.WINDOW_MODAL);
        newWindow.initStyle(StageStyle.UNDECORATED);
        // Specifies the owner Window (parent) for new window
        newWindow.initOwner(primaryStage);

        // Set position of second window, related to primary window.
        //newWindow.setX(primaryStage.getX() + 200);
        //newWindow.setY(primaryStage.getY() + 100);

        newWindow.show();
    }
    @FXML
    public void mergePDFsClicked(ActionEvent event) throws IOException {
        Parent temp = FXMLLoader.load(getClass().getResource("/fxml/MergePDFsScene.fxml"));

        Scene scene = new Scene(temp);
        Stage primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow = new Stage();
        newWindow.setTitle("Cut Pages From PDF");
        newWindow.setScene(scene);

        // Specifies the modality for new window.
        newWindow.initModality(Modality.WINDOW_MODAL);
        newWindow.initStyle(StageStyle.UNDECORATED);
        // Specifies the owner Window (parent) for new window
        newWindow.initOwner(primaryStage);

        // Set position of second window, related to primary window.
        //newWindow.setX(primaryStage.getX() + 200);
        //newWindow.setY(primaryStage.getY() + 100);

        newWindow.show();
    }

}
