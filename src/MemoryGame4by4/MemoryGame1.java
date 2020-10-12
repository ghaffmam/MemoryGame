/*
 * Group Member's Name: Mamona Ghaffar, Fizah Shahid     
 * Date: April 8, 2020
 * Project: Animal Memory Game 4 by 4
 */
package MemoryGame4by4;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

public class MemoryGame1 extends Application{
    ImageView lastSquare = null;
    
    @Override
    public void start(Stage primaryStage){
    try {
    primaryStage.setTitle("Animal Memory Game");
    primaryStage.getIcons().add(new Image("Images/lion-face-icon.png"));

    GridPane root = new GridPane();
    Scene scene = new Scene(root,400,400);

    Image eImg = new Image("Images/elephant.jpg");
    Image fImg = new Image("Images/fox.png");
    Image dImg = new Image("Images/deer.JPG");
    Image lImg = new Image("Images/lion.jpg");
    Image cImg = new Image("Images/cheetah.JPG");
    Image rImg = new Image("Images/rino.JPG");
    Image tImg = new Image("Images/tiger.jpg");
    Image bImg = new Image("Images/bear.JPG");
    Image pImg = new Image("Images/placeholder.jpg");

    // Step 1: Create
    ImageView iView1 = new ImageView(pImg);
    ImageView iView2 = new ImageView(pImg);
    ImageView iView3 = new ImageView(pImg);
    ImageView iView4 = new ImageView(pImg);
    ImageView iView5 = new ImageView(pImg);
    ImageView iView6 = new ImageView(pImg);
    ImageView iView7 = new ImageView(pImg);
    ImageView iView8 = new ImageView(pImg);
    ImageView iView9 = new ImageView(pImg);
    ImageView iView10 = new ImageView(pImg);
    ImageView iView11 = new ImageView(pImg);
    ImageView iView12 = new ImageView(pImg);
    ImageView iView13 = new ImageView(pImg);
    ImageView iView14 = new ImageView(pImg);
    ImageView iView15 = new ImageView(pImg);
    ImageView iView16 = new ImageView(pImg);

    // Set images width & height by 100 pixels.
    iView1.setFitWidth(100);
    iView1.setFitHeight(100);

    iView2.setFitWidth(100);
    iView2.setFitHeight(100);

    iView3.setFitWidth(100);
    iView3.setFitHeight(100);

    iView4.setFitWidth(100);
    iView4.setFitHeight(100);

    iView5.setFitWidth(100);
    iView5.setFitHeight(100);

    iView6.setFitWidth(100);
    iView6.setFitHeight(100);

    iView7.setFitWidth(100);
    iView7.setFitHeight(100);

    iView8.setFitWidth(100);
    iView8.setFitHeight(100);

    iView9.setFitWidth(100);
    iView9.setFitHeight(100);

    iView10.setFitWidth(100);
    iView10.setFitHeight(100);

    iView11.setFitWidth(100);
    iView11.setFitHeight(100);

    iView12.setFitWidth(100);
    iView12.setFitHeight(100);

    iView13.setFitWidth(100);
    iView13.setFitHeight(100);

    iView14.setFitWidth(100);
    iView14.setFitHeight(100);

    iView15.setFitWidth(100);
    iView15.setFitHeight(100);

    iView16.setFitWidth(100);
    iView16.setFitHeight(100);

    iView1.setPreserveRatio(true);
    iView2.setPreserveRatio(true);
    iView3.setPreserveRatio(true);
    iView4.setPreserveRatio(true);
    iView5.setPreserveRatio(true);
    iView6.setPreserveRatio(true);
    iView7.setPreserveRatio(true);
    iView8.setPreserveRatio(true);
    iView9.setPreserveRatio(true);
    iView10.setPreserveRatio(true);
    iView11.setPreserveRatio(true);
    iView12.setPreserveRatio(true);
    iView13.setPreserveRatio(true);
    iView14.setPreserveRatio(true);
    iView15.setPreserveRatio(true);
    iView16.setPreserveRatio(true);

    // Step 2: Put on screen
    root.add(iView1, 0, 0);
    root.add(iView2, 0, 1);
    root.add(iView3, 0, 2);
    root.add(iView4, 0, 3);

    root.add(iView5, 1, 0);
    root.add(iView6, 1, 1);
    root.add(iView7, 1, 2);
    root.add(iView8, 1, 3);

    root.add(iView9, 2, 0);
    root.add(iView10, 2, 1);
    root.add(iView11, 2, 2);
    root.add(iView12, 2, 3);

    root.add(iView13, 3, 0);
    root.add(iView14, 3, 1);
    root.add(iView15, 3, 2);
    root.add(iView16, 3, 3);

    // Step 3: Wire up the onclick handler
    iView1.setOnMouseClicked(new EventHandler<MouseEvent>() {
    @Override
    public void handle(MouseEvent event) {
            if(lastSquare!=null && lastSquare .getImage() != eImg)
            {
                lastSquare.setImage(pImg);
                lastSquare=iView1;
            }
            else if(lastSquare!=null && lastSquare.getImage()==eImg)
            {
                iView16.setImage(eImg);
                iView1.setImage(eImg);
                lastSquare=null;
            }
            else if(lastSquare==null)
            {
                iView1.setImage(eImg);
                lastSquare=iView1;  
            }
        iView1.setImage(eImg);
    }
});
    iView2.setOnMouseClicked(new EventHandler<MouseEvent>() {
    @Override
    public void handle(MouseEvent event) {
          if(lastSquare!=null && lastSquare.getImage() != fImg)
            {
                lastSquare.setImage(pImg);
                lastSquare=iView2;

            }
           else if(lastSquare!=null && lastSquare.getImage()==fImg)
           {
                iView9.setImage(fImg);
                iView2.setImage(fImg);
                lastSquare=null;
            }
           else if(lastSquare==null)
           {
                iView2.setImage(fImg);
                lastSquare = iView2;     
           }
        iView2.setImage(fImg);
    }
});
    iView3.setOnMouseClicked(new EventHandler<MouseEvent>() {
    @Override
    public void handle(MouseEvent event) {
        if(lastSquare!=null && lastSquare.getImage() != dImg)
            {
                lastSquare.setImage(pImg);
                lastSquare = iView3;
            }
         else if(lastSquare!=null && lastSquare.getImage()==dImg)
           {
                iView15.setImage(dImg);
                iView3.setImage(dImg);
                lastSquare=null;
            }
         else if(lastSquare==null)
         {
            iView3.setImage(dImg);
             lastSquare = iView3;   
         }

    iView3.setImage(dImg);
    }
});
    iView4.setOnMouseClicked(new EventHandler<MouseEvent>() {
    @Override
    public void handle(MouseEvent event) {
        if(lastSquare!=null && lastSquare.getImage() != lImg)
            {
                lastSquare.setImage(pImg);
                lastSquare = iView4;
            }
         else if(lastSquare!=null && lastSquare.getImage()==lImg)
           {
                iView10.setImage(lImg);
                iView4.setImage(lImg);
                lastSquare=null;
           }
         else if(lastSquare==null)
           {
                iView4.setImage(lImg);
                lastSquare = iView4;  
           }

        iView4.setImage(lImg);
    }
});
    iView5.setOnMouseClicked(new EventHandler<MouseEvent>() {
    @Override
    public void handle(MouseEvent event) {
        if(lastSquare!=null && lastSquare.getImage() != cImg)
            {
                lastSquare.setImage(pImg);
                lastSquare = iView5;
            }
         else if(lastSquare!=null && lastSquare.getImage()==cImg)
           {
                iView14.setImage(cImg);
                iView5.setImage(cImg);
                lastSquare=null;
                }
         else if(lastSquare==null)
           {
                iView5.setImage(cImg);
                lastSquare = iView5;   
           }

        iView5.setImage(cImg);
    }
});
    iView6.setOnMouseClicked(new EventHandler<MouseEvent>() {
    @Override
    public void handle(MouseEvent event) {
        if(lastSquare!=null && lastSquare.getImage() != rImg)
            {
                lastSquare.setImage(pImg);
                lastSquare = iView6;
            }
         else if(lastSquare!=null && lastSquare.getImage()==rImg)
           {
            iView11.setImage(rImg);
            iView6.setImage(rImg);
            lastSquare=null;
            }
         else if(lastSquare==null)
         {
           iView6.setImage(rImg);
            lastSquare = iView6;  
         }

            iView6.setImage(rImg);
    }
});
    iView7.setOnMouseClicked(new EventHandler<MouseEvent>() {
    @Override
    public void handle(MouseEvent event) {
        if(lastSquare!=null && lastSquare.getImage() != tImg)
            {
                lastSquare.setImage(pImg);
               lastSquare = iView7;
            }
         else if(lastSquare!=null && lastSquare.getImage()==tImg)
           {
            iView13.setImage(tImg);
            iView7.setImage(tImg);
            lastSquare=null;
            }
         else if(lastSquare==null)
         {
           iView7.setImage(tImg);
            lastSquare = iView7;  
         }

            iView7.setImage(tImg);
    }
});
    iView8.setOnMouseClicked(new EventHandler<MouseEvent>() {
    @Override
    public void handle(MouseEvent event) {
        if(lastSquare!=null && lastSquare.getImage() != bImg)
            {
                lastSquare.setImage(pImg);
                lastSquare = iView8;
            }
         else if(lastSquare!=null && lastSquare.getImage()==bImg)
           {
            iView12.setImage(bImg);
            iView8.setImage(bImg);
            lastSquare=null;
            }
         else if(lastSquare==null)
         {
           iView8.setImage(bImg);
            lastSquare = iView8;   
         }

            iView8.setImage(bImg);
    }
});
    iView9.setOnMouseClicked(new EventHandler<MouseEvent>() {
    @Override
    public void handle(MouseEvent event) {
        if(lastSquare!=null && lastSquare.getImage() != fImg)
            {
                lastSquare.setImage(pImg);
                lastSquare = iView9;
            }
         else if(lastSquare!=null && lastSquare.getImage()==fImg)
           {
            iView2.setImage(fImg);
            iView9.setImage(fImg);
            lastSquare=null;
            }
         else if(lastSquare==null)
         {
           iView9.setImage(fImg);
            lastSquare = iView9;  
         }

            iView9.setImage(fImg);
    }
});
    iView10.setOnMouseClicked(new EventHandler<MouseEvent>() {
    @Override
    public void handle(MouseEvent event) {
        if(lastSquare!=null && lastSquare.getImage() != lImg)
            {
                lastSquare.setImage(pImg);
                lastSquare = iView10;
            }
         else if(lastSquare!=null && lastSquare.getImage()==lImg)
           {
            iView4.setImage(lImg);
             iView10.setImage(lImg);
            lastSquare=null;
            }
         else if(lastSquare==null)
         {
           iView10.setImage(lImg);
            lastSquare = iView10;   
         }

            iView10.setImage(lImg);
    }
});
    iView11.setOnMouseClicked(new EventHandler<MouseEvent>() {
    @Override
    public void handle(MouseEvent event) {
        if(lastSquare!=null && lastSquare.getImage() != rImg)
            {
                lastSquare.setImage(pImg);
                lastSquare = iView11;
            }
         else if(lastSquare!=null && lastSquare.getImage()==rImg)
           {
            iView6.setImage(rImg);
            iView11.setImage(rImg);
            lastSquare=null;
            }
         else if(lastSquare==null)
         {
           iView11.setImage(rImg);
           lastSquare = iView11;  
         }

            iView11.setImage(rImg);
    }
});
    iView12.setOnMouseClicked(new EventHandler<MouseEvent>() {
    @Override
    public void handle(MouseEvent event) {
        if(lastSquare!=null && lastSquare.getImage() != bImg)
            {
                lastSquare.setImage(pImg);
                lastSquare = iView12;
            }
         else if(lastSquare!=null && lastSquare.getImage()==bImg)
           {
            iView8.setImage(bImg);
            iView12.setImage(bImg);
            lastSquare=null;
            }
         else if(lastSquare==null)
         {
           iView12.setImage(bImg);
            lastSquare = iView12;  
         }

            iView12.setImage(bImg);
    }
});
    iView13.setOnMouseClicked(new EventHandler<MouseEvent>() {
    @Override
    public void handle(MouseEvent event) {
        if(lastSquare!=null && lastSquare.getImage() != tImg)
            {
                lastSquare.setImage(pImg);
                lastSquare = iView13;
            }
         else if(lastSquare!=null && lastSquare.getImage()==tImg)
           {
            iView7.setImage(tImg);
            iView13.setImage(tImg);
            lastSquare=null;
            }
         else if(lastSquare==null)
         {
           iView13.setImage(tImg);
            lastSquare = iView13;  
         }

            iView13.setImage(tImg);
    }
});
    iView14.setOnMouseClicked(new EventHandler<MouseEvent>() {
    @Override
    public void handle(MouseEvent event) {
        if(lastSquare!=null && lastSquare.getImage() != cImg)
            {
                lastSquare.setImage(pImg);
                lastSquare = iView14;
            }
         else if(lastSquare!=null && lastSquare.getImage()==cImg)
           {
            iView5.setImage(cImg);
            iView14.setImage(cImg);
            lastSquare=null;
            }
         else if(lastSquare==null)
         {
           iView14.setImage(cImg);
            lastSquare = iView14;  
         }

            iView14.setImage(cImg);
    }
});
    iView15.setOnMouseClicked(new EventHandler<MouseEvent>() {
    @Override
    public void handle(MouseEvent event) {
        if(lastSquare!=null && lastSquare.getImage() != dImg)
            {
                lastSquare.setImage(pImg);
                lastSquare = iView15;
            }
         else if(lastSquare!=null && lastSquare.getImage()==dImg)
           {
            iView3.setImage(dImg);
            iView15.setImage(dImg);
            lastSquare=null;
            }
         else if(lastSquare==null)
         {
           iView15.setImage(dImg);
            lastSquare = iView15;  
         }

            iView15.setImage(dImg);
    }
});
    iView16.setOnMouseClicked(new EventHandler<MouseEvent>() {
    @Override
    public void handle(MouseEvent event) {
        if(lastSquare!=null && lastSquare.getImage() != eImg)
            {
                lastSquare.setImage(pImg);
                lastSquare = iView16;
            }
         else if(lastSquare!=null && lastSquare.getImage()==eImg)
           {
            iView1.setImage(eImg);
            iView16.setImage(eImg);
            lastSquare=null;
           }
         else if(lastSquare==null)
         {
            iView16.setImage(eImg);
            lastSquare=iView16;
         }
            iView16.setImage(eImg);
    }
});
        primaryStage.setScene(scene);
                primaryStage.show();
        } catch(Exception e) {
                e.printStackTrace();
        }
}
    
    public static void main(String[] args) {
        launch(args);
    }

    private void setTitle(String memory_Game) {
        //To change body of generated methods, choose Tools | Templates.
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
