/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameofchess;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author richabhartia
 */
public class FXMLDocumentController implements Initializable 
{
    
    @FXML
    private Label label;
    
    @FXML
    private void hostAGameButton(ActionEvent event) throws IOException 
    {
        try 
        {
            TextInputDialog inputDialog= new TextInputDialog();
       
        inputDialog.setTitle("Host a Game");
        inputDialog.setHeaderText("Enter game name");
        
        Optional<String> result = inputDialog.showAndWait();
        
        if (result.isPresent())
        {
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("ChessBoard.fxml"));
            Scene scene = new Scene(root);
        
            stage.setScene(scene);
            stage.show();

        }
        System.out.println("Host A Game Clicked!");
        //label.setText("Hello World!");
        }
        
        catch (Exception e) 
        {
            System.err.println("An Exception Occured" + e.toString());
        }

    }
    
     @FXML
    private void JoinAGameButton(ActionEvent event) throws IOException 
    {
        try 
        {
            TextInputDialog inputDialog= new TextInputDialog();
       
        inputDialog.setTitle("Join a Game");
        inputDialog.setHeaderText("Enter game name");
        
        Optional<String> result = inputDialog.showAndWait();
        
        if (result.isPresent())
        {
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("ChessBoard.fxml"));
            Scene scene = new Scene(root);
        
            stage.setScene(scene);
            stage.show();

        }
        System.out.println("Join A Game Clicked!");
        //label.setText("Hello World!");
        }
        
        catch (Exception e) 
        {
            System.err.println("An Exception Occured" + e.toString());
        }

    }
    
     @FXML
    private void RandomGameButton(ActionEvent event) throws IOException 
    {
        try 
        {
            /*
          TextInputDialog inputDialog= new TextInputDialog();
       
        inputDialog.setTitle("Host a Game");
        inputDialog.setHeaderText("Enter game name");
        
        Optional<String> result = inputDialog.showAndWait();
        
        if (result.isPresent())
        {*/
           
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("ChessBoard.fxml"));
            Scene scene = new Scene(root);
        
            stage.setScene(scene);
            stage.show();

        //}
        System.out.println("Random Game Clicked!");
        //label.setText("Hello World!");
        }
        
        catch (Exception e) 
        {
            System.err.println("An Exception Occured" + e.toString());
        }

    }
    
     @FXML
    private void ExitButton(ActionEvent event) throws IOException 
    {
        try 
        {
           Platform.exit();
        }
        
        catch (Exception e) 
        {
            System.err.println("An Exception Occured" + e.toString());
        }

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
