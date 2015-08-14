/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameofchess;


import com.sun.deploy.panel.GeneralPanel;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;


/**
 * FXML Controller class
 *
 * @author richabhartia
 */
public class ChessBoardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    ImageView img_1 = new ImageView();
    ImageView img_2 = new ImageView();
    ImageView img_swap = new ImageView();

    @FXML
    Button button00;
    @FXML
    Button button01;
    @FXML 
    Button confirmMove;
    @FXML 
    GridPane gPane;
    
    @FXML 
    private void GridPane_OnMouseClick(ActionEvent event)
    {
        System.out.println("GridPane was clicked");
        ObservableList<Node> btn = gPane.getChildren();
        
        for(int i = 0; i < btn.get(0).length; i++)
        {
            
        }
    }

    @FXML
    private void button00_onAction(ActionEvent event)
    {
        System.out.println("Button 00 was clicked");
        //img_1 = (ImageView) button00.getGraphic();
        String style = button00.getStyle();
        
        if(style.contains("Gray") || style.contains("White"))
        {
           button00.setStyle("-fx-background-color: Green");
        }
        else
        {
           button00.setStyle("-fx-background-color: Gray");

        }
        System.out.println(style);        
    }
    
    @FXML
    private void button01_onAction(ActionEvent event)
    {
        System.out.println("Button 01 was clicked");
        //img_1 = (ImageView) button00.getGraphic();
        String style = button01.getStyle();
        
        if(style.contains("Gray") || style.contains("White"))
        {
           button01.setStyle("-fx-background-color: Green");
        }
        else
        {
           button01.setStyle("-fx-background-color: White");
        }
        System.out.println(style);        
    } 
    
    @FXML 
    private void ConfirmMove_OnAction(ActionEvent event)
    {
        System.out.println("Function with all buttons called");
        Button[] btn = new Button[2];
        btn[0] = button00;
        btn[1] = button01;
        int found = 0;
        int i = 0; 
        while ( (i < btn.length) && (found < 2))
        {
            System.out.println("Inside WHile");
            String style = btn[i].getStyle();
           
            if(style.contains("Geen"))
            {
                if (img_1 == null)
                {
                    img_1 = (ImageView) btn[i].getGraphic();
                    found++;
                }
                else
                {
                    img_2 = (ImageView) btn[i].getGraphic();
                    found++;    
                }
            }
            
            i++;
        }
        
        Image image1 = img_1.getImage();
        Image image2 = img_2.getImage();
       
        System.out.println(img_1.toString());
        System.out.println(img_2.toString());
        System.out.println("Image name:" +  image1.impl_getUrl());

        if (found == 2)
        {
            
            //Image imageSwap = img_swap.getImage();
            
            
            //button00.setGraphic(new ImageView(image2));
            //button01.setGraphic(new ImageView(image1));
        }
        
        img_1 = null;
        img_2 = null;
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
        
    } 
    
}
