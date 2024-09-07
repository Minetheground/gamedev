package my2DGame.entity;

import my2DGame.main.GamePanel;
import my2DGame.main.KeyHandler;

import javax.imageio.ImageIO;
import java.awt.*;
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

            up1 = ImageIO.read(getClass().getResourceAsStream("/Player/boy_up_1.png"));
            up2 = ImageIO.read(getClass().getResourceAsStream("/Player/boy_up_2.png"));
            down1 = ImageIO.read(getClass().getResourceAsStream("/Player/boy_down_1.png"));
            down2 = ImageIO.read(getClass().getResourceAsStream("/Player/boy_down_2.png"));
            right1 = ImageIO.read(getClass().getResourceAsStream("/Player/boy_right_1.png"));
            right2 = ImageIO.read(getClass().getResourceAsStream("/Player/boy_right_2.png"));
            left1 = ImageIO.read(getClass().getResourceAsStream("/Player/boy_left_1.png"));
            left2 = ImageIO.read(getClass().getResourceAsStream("/Player/boy_left_2.png"));

        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void update() {
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
    }
    public void draw(Graphics2D g2) {
        g2.setColor(Color.GREEN);

        g2.fillRect(x, y, gp.tileSize, gp.tileSize);
    }
}
