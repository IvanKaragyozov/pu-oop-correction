package monsters;

import game.BoardTiles;

import java.awt.*;

public class SandTurtle extends MonsterStats{

    public SandTurtle(int row, int col, Color color, int ap, int dp, int mana, int move) {

        super();
        this.row     = row;
        this.col     = col;
        this.color   = color;
        this.attack  = ap;
        this.defence = dp;
        this.mana    = mana;
        this.move    = move;
    }

    public void render(Graphics g) {
        int x = this.col * BoardTiles.tileSize;
        int y = this.row * BoardTiles.tileSize;
        g.setColor(this.color);
        g.fillOval(x + 1, y - 200, 48, 48);


    }

}
