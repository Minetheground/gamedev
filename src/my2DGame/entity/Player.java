package my2DGame.entity;

import my2DGame.main.GamePanel;
import my2DGame.main.KeyHandler;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;



public class Player extends Entity{
    GamePanel gp;
    KeyHandler keyH;


    public Player(GamePanel gp, KeyHandler keyH) {


        this.gp = gp;
        this.keyH = keyH;
        setDefaultValues();
        getPlayerImages();
    }

    public void setDefaultValues() {
        x = 100;
        y = 100;
        speed = 4;
        direction = "right";
    }

    public void getPlayerImages() {
        try {

            up1 = ImageIO.read(getClass().getResourceAsStream("/res/player/boy_up_1.png"));
            up2 = ImageIO.read(getClass().getResourceAsStream("/res/player/boy_up_2.png"));
            down1 = ImageIO.read(getClass().getResourceAsStream("/res/player/boy_down_1.png"));
            down2 = ImageIO.read(getClass().getResourceAsStream("/res/player/boy_down_2.png"));
            right1 = ImageIO.read(getClass().getResourceAsStream("/res/player/boy_right_1.png"));
            right2 = ImageIO.read(getClass().getResourceAsStream("/res/player/boy_right_2.png"));
            left1 = ImageIO.read(getClass().getResourceAsStream("/res/player/boy_left_1.png"));
            left2 = ImageIO.read(getClass().getResourceAsStream("/res/player/boy_left_2.png"));

        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void update() {

        if (keyH.upPressed == true || keyH.downPressed == true || keyH.leftPressed == true || keyH.rightPressed == true) {
            if(keyH.upPressed) {
                direction = "up";
                y -= speed;

            }
            else if(keyH.downPressed) {
                direction = "down";
                y += speed;

            }

            else if (keyH.leftPressed) {
                direction = "left";
                x -= speed;

            }
            else if (keyH.rightPressed) {
                direction = "right";
                x += speed;
            }
            spriteCounter++;
            if (spriteCounter > 12) {
                if (spriteNum == 1) {
                    spriteNum = 2;
                } else if (spriteNum == 2) {
                    spriteNum = 1;

                }
                spriteCounter = 0;
            }
        }


        }



    public void draw(Graphics2D g2) {

     //   g2.setColor(Color.GREEN);

    //    g2.fillRect(x, y, gp.tileSize, gp.tileSize);


        BufferedImage image = null;

        if (direction == "up") {
            if (spriteNum == 1) {
                image = up1;
            } else if (spriteNum == 2){
                image = up2;
            }
        }else if (direction =="down"){
           if (spriteNum == 1) {
               image = down1;
           } else if (spriteNum == 2) {
               image = down2;
           }


        } else if (direction == "left") {
            if (spriteNum == 1) {
                image = left1;
            } else if (spriteNum == 2) {
                image = left2;
            }
        } else if (direction =="right")
            if (spriteNum == 1) {
            image = right1;

        } else if (spriteNum == 2) {
            image = right2;
        }
        g2.drawImage(image, x , y, gp.tileSize, gp.tileSize, null);


}}
