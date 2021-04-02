package game;

import monsters.*;

import javax.swing.*;
import java.awt.*;

public class GameBoard extends JFrame {

    protected DogEatingBug[][] dogEatingBugs;
    protected DrunkenKnight[][] drunkenKnight;
    protected MagicCat[][] magicCat;
    protected RecklessCannibal[][] recklessCannibal;
    protected SandTurtle[][] sandTurtle;
    protected SofisticatedSam[][] sofisticatedSam;

    /**
     *  Visualises a window with 620 by 645 pixels
     */

    public GameBoard() {
        this.setSize(620,645);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.dogEatingBugs = new DogEatingBug[15][15];
        this.dogEatingBugs[0][0] = (new DogEatingBug(0,0,Color.BLUE,10,2,8,5));
        this.drunkenKnight = new DrunkenKnight[15][15];
        this.drunkenKnight[1][1] = (new DrunkenKnight(1,1,Color.RED,5,5,5,5));
        this.magicCat = new MagicCat[15][15];
        this.magicCat[2][2] = (new MagicCat(2,2,Color.GREEN,8,5,10,1));
        this.recklessCannibal = new RecklessCannibal[15][15];
        this.recklessCannibal[3][3] = (new RecklessCannibal(3,3,Color.MAGENTA,4,6,8,10));
        this.sandTurtle = new SandTurtle[15][15];
        this.sandTurtle[4][4] = (new SandTurtle(4,4, Color.BLACK, 5,10,1,4));
        this.sofisticatedSam = new SofisticatedSam[15][15];
        this.sofisticatedSam[5][5] = (new SofisticatedSam(5,5, Color.CYAN, 10,5,4,1));
    }

    @Override

    public void paint(Graphics g){

        g.translate(10,35); // Corrects the size of the window to be even for each side

        for(int row = 0; row < 12; row++){
            for(int col = 0; col < 12; col++){

                 BoardTiles boardTiles = new BoardTiles(row, col);
                 boardTiles.setTiles(g);

                for (int i = 0; i < 15; i++) {
                    for (int j = 0; j < 15; j++) {
                        renderGamePiece(g, i, j);
                    }
                }

            }
        }
    }
    private DogEatingBug getDog(int row, int col) {
        return this.dogEatingBugs[row][col];
    }

    private DrunkenKnight getKnight(int row, int col){
        return this.drunkenKnight[row][col];
    }

    private MagicCat getCat(int row, int col){
        return this.magicCat[row][col];
    }

    private RecklessCannibal getCannibal(int row, int col){
        return this.recklessCannibal[row][col];
    }

    private SandTurtle getTurtle(int row, int col){
        return this.sandTurtle[row][col];
    }

    private SofisticatedSam getSam(int row, int col){
        return this.sofisticatedSam[row][col];
    }

    //----------------------------------------------------------------------------------
    private boolean hasSam(int row, int col){
        return this.getSam(row, col) != null;
    }

    private boolean hasTurtle(int row, int col){
        return this.getTurtle(row, col) != null;
    }

    private boolean hasCannibal(int row, int col){
        return this.getCannibal(row, col) != null;
    }

    private boolean hasKnight(int row, int col){
        return this.getKnight(row, col) != null;
    }

    private boolean hasCat(int row, int col){
        return this.getCat(row, col) != null;
    }

    private boolean hasDog(int row, int col) {
        return this.getDog(row, col) != null;
    }

    private void renderGamePiece(Graphics g, int row, int col) {
        if (this.hasDog(row, col)) {
            DogEatingBug p = (DogEatingBug) this.getDog(row, col);
            p.render(g);

        }
        else if (this.hasKnight(row, col)){
            DrunkenKnight d = (DrunkenKnight) this.getKnight(row, col);
            d.render(g);
        }
        else if (this.hasCat(row, col)){
            MagicCat c = (MagicCat) this.getCat(row, col);
            c.render(g);
        }
        else if (this.hasCannibal(row, col)){
            RecklessCannibal r = (RecklessCannibal) this.getCannibal(row, col);
            r.render(g);
        }
        else if (this.hasTurtle(row, col)){
            SandTurtle t = (SandTurtle) this.getTurtle(row, col);
            t.render(g);
        }
        else if (this.hasSam(row, col)){
            SofisticatedSam s = (SofisticatedSam) this.getSam(row, col);
            s.render(g);
        }


    }

}
