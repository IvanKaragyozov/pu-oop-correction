package game;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class BoardTiles extends JFrame{

    public final int row;
    public final int col;
    public static int tileSize;
    public final int tileX;
    public final int tileY;


    public BoardTiles(int row, int col){

        this.row        = row;
        this.col        = col;
        this.tileSize   = 50;

        this.tileX = this.col * this.tileSize;
        this.tileY = this.row * this.tileSize;

    }

    public void renderTiles(Graphics g) {

        setTileColor(tileX, tileY, g);

    }

    public void setTiles(Graphics g){

        renderTiles(g);
    }

    void setTileColor(int x, int y , Graphics g){

        g.setColor(Color.YELLOW);
        g.fillRect(x, y, this.tileSize, this.tileSize);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, this.tileSize, this.tileSize);

    }

}


